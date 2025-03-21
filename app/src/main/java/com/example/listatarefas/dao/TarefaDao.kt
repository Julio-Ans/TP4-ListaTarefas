package com.example.listatarefas.dao

import com.example.listatarefas.model.Tarefa

class TarefaDao {
    companion object{
        private val tarefas = mutableListOf<Tarefa>()
    }

    fun addTarefa(tarefa:Tarefa){
        tarefas.add(tarefa)
    }
    fun getTarefas():List<Tarefa>{
        return tarefas
    }
}