package com.example.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(p: Produto) {
           val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = p.nome
            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text=p.descricao
            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = p.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): ViewHolder {//referncia em pegar a view que queremos apresentar na recycleView e fazer o procecesso de bidding
        val inlater = LayoutInflater.from(context)
        val view = inlater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {// indica o item que vc está no adapter e sua posição e viewholder
      val p=  produtos[position]
        holder.vincula(p)
    }

    override fun getItemCount(): Int =
        produtos.size// determina quantos itens quer/apresenta dentro do adapter


}
