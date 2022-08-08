package com.example.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.orgs.R
import com.example.orgs.model.Produto
import java.math.BigDecimal

class FormProdutoActivity : AppCompatActivity(R.layout.activity_form_produto) {


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val salvar = findViewById<Button>(R.id.salvar)
        salvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.editNome)
            val nome = campoNome.text.toString()
            val campoDescricao = findViewById<EditText>(R.id.editDescricao)
            val descricao = campoDescricao.text.toString()
            val campoValor = findViewById<EditText>(R.id.edivalor)
            val valorEmTexto = campoValor.text.toString()

            val valor = if (valorEmTexto.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(valorEmTexto)
            }

            val produtoNovo = Produto(
                nome = nome,
                descricao = descricao,
                valor = valor
            )

            Log.i("FormProduto", "onCreate: $produtoNovo")

        }
    }
}