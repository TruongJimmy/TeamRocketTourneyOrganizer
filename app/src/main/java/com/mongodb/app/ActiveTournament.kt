package com.mongodb.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_active_tournament.*

class ActiveTournament:AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<CardViewRecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active_tournament)

        layoutManager = LinearLayoutManager(this)
        cardRecyclerView.layoutManager = layoutManager

        adapter = CardViewRecyclerAdapter()
        cardRecyclerView.adapter = adapter


    }
}