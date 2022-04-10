package com.caioiox.afirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.caioiox.afirmations.adapter.ItemAdapter
import com.caioiox.afirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializar dados
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataset)

        //Usar essa configuração para aprimorar a performance
        //caso isso não mude o tamanho da RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}