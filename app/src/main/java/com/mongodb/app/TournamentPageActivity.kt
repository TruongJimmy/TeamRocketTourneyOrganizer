package com.mongodb.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_active_upcoming_tournament.*
import kotlinx.android.synthetic.main.activity_tournament_page.*

class TournamentPageActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<TournamentPageAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tournament_page)

        layoutManager = LinearLayoutManager(this)
        recyclerViewTourneyPage.layoutManager = layoutManager

        adapter = TournamentPageAdapter()
        recyclerViewTourneyPage.adapter = adapter
    }
}

