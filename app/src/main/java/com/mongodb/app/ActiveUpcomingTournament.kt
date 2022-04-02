package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_active_upcoming_tournament.*
import java.text.FieldPosition


class ActiveUpcomingTournament:AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ActiveUpcomingAdapter.ViewHolder>? = null

    private var user = realmApp.currentUser()
    private var partition = "123"
    var config = SyncConfiguration.Builder(user, partition).build()
    // open the realm
    private var realm = Realm.getInstance(config)
    private var tourneyQuery = realm!!.where<Tournament>().findAllAsync()




    private var images = intArrayOf(
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active_upcoming_tournament)

        layoutManager = LinearLayoutManager(this)
        cardRecyclerView.layoutManager = layoutManager

        adapter = ActiveUpcomingAdapter(tourneyQuery, images)
        cardRecyclerView.adapter = adapter

        (adapter as ActiveUpcomingAdapter).setOnItemClickListener(object : ActiveUpcomingAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@ActiveUpcomingTournament, TournamentPageActivity::class.java)
                intent.putExtra("participant", tourneyQuery[position]!!.participant)
                intent.putExtra("tourneyGame", tourneyQuery[position]!!.game)
                intent.putExtra("location", tourneyQuery[position]!!.location)
                intent.putExtra("startTime", tourneyQuery[position]!!.startTime)
                intent.putExtra("tourneyName", tourneyQuery[position]!!.name)
                intent.putExtra("tournamentType", tourneyQuery[position]!!.tournamentType)
//                intent.putExtra("tourneyPicture", images[position])
                startActivity(intent)
            }
        })


    }


}

