package com.example.orgs.ui.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.model.Produto

class ListaProdutosAdapter (
    private  val produtos: List<Produto>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")// indica o item que vc está no adapter e sua posição e viewholder
    }

    override fun getItemCount(): Int = produtos.size// determina quantos itens quer/apresenta dentro do adapter



}
