package com.example.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_SHORT).show()


        val recyclcerView = findViewById<RecyclerView>(R.id.recycler)
        recyclcerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "Cesta de Chocolate",
                    descricao = "Choquito, prestigio e trento",
                    valor = BigDecimal("25.64")
                ),
                Produto(
                    nome = "Cesta Basica",
                    descricao = "Arroz, Feijão e Mistura",
                    valor = BigDecimal("50.64")
                ),
            )
        )

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        fab.setOnClickListener {
            val intent = Intent(this, FormProdutoActivity::class.java)
            startActivity(intent)
        }

    }


}