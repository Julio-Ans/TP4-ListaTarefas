package com.example.listatarefas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listatarefas.adapter.TarefaAdapter
import com.example.listatarefas.dao.TarefaDao

class ShowListActivity : AppCompatActivity(R.layout.activity_show_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dao = TarefaDao()
        val tarefas = dao.getTarefas()

        val rvListaTarefas = findViewById<RecyclerView>(R.id.rv_lista_tarefas)
        rvListaTarefas.layoutManager = LinearLayoutManager(this)
        rvListaTarefas.adapter = TarefaAdapter(tarefas)

        }
    }
