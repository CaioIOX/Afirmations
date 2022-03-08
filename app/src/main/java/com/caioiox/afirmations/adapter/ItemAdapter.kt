package com.caioiox.afirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.caioiox.afirmations.R
import com.caioiox.afirmations.model.Affirmation

    //Adaptador da RecycleView na MainActivity
    //Mostra Affirmation

class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>)
                : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //Promove uma referencia para as views para cada item dos dados
    //Dados complexos podem precisar de mais de uma view por item
    //Você provem acesso de cada view aos item de dados em um view holder
    //Cada item de dados é um objeto Affirmation
    class ItemViewHolder (private val view: View) : RecyclerView.ViewHolder(view){
        val textview:TextView = view.findViewById(R.id.item_title)
    }

    //Cria novas views(chamado pelo layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }
    //Substitui o conteudo de um views(chamado pelo layout manager)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textview.text = context.resources.getString(item.stringResourceId)
    }
    //Retorna o tamanho do dataset(chamado pelo layout manager)
    override fun getItemCount() = dataset.size
}