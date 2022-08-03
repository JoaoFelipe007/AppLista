package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_SHORT).show()
//
//        var preco :Double = 19.00
//        var preco2 : Double = 16.50
//        var result = preco + preco2
//
//       val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de Frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Morango, Maracuja, Melancia"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = result.toString()

        val recylcerView = findViewById<RecyclerView>(R.id.recycler)
        recylcerView.adapter = ListaProdutosAdapter()

    }




}