package com.example.listatarefas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listatarefas.dao.TarefaDao
import com.example.listatarefas.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtnome = findViewById<EditText>(R.id.edt_nome)
        val edtdescricao = findViewById<EditText>(R.id.edt_descricao)
        val edtdata = findViewById<EditText>(R.id.edt_data)
        val btsalvar = findViewById<Button>(R.id.bt_salvar)
        val btlistar = findViewById<FloatingActionButton>(R.id.bt_listar)

        val dao = TarefaDao()

        btsalvar.setOnClickListener{
            val nome = edtnome.text.toString()
            val categoria = edtdescricao.text.toString()
            val data = edtdata.text.toString()
            val tarefa = Tarefa(nome, categoria, data)
            dao.addTarefa(tarefa)

            edtnome.text.clear()
            edtdescricao.text.clear()
            edtdata.text.clear()

        }

        btlistar.setOnClickListener{
            val intent = Intent(this, ShowListActivity::class.java )
            startActivity(intent)

        }


        }
    }
