package com.example.orgs.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
            ))
//        recyclcerView.layoutManager = LinearLayoutManager(this)//indica que ele será o gerenciador do layout
    }


}