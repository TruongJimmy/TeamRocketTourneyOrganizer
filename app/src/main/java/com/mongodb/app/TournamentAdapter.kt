package com.mongodb.app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.CheckBox
import android.widget.PopupMenu
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.mongodb.app.games.GAME_ID
import com.mongodb.app.games.NAME_GAME
import io.realm.OrderedRealmCollection
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmRecyclerViewAdapter
import io.realm.kotlin.where
import io.realm.mongodb.mongo.MongoCollection
import org.bson.types.ObjectId

internal class TournamentAdapter(data: OrderedRealmCollection<Tournament>, private val config: RealmConfiguration, private val mContext: Context, var currentGameId: Long?) : RealmRecyclerViewAdapter<Tournament, TournamentAdapter.TournamentViewHolder?>(data, true) {
    val intent = Intent(mContext, TournamentDetailActivity::class.java)
    internal inner class TournamentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var id: ObjectId? = null
        var name: TextView = view.findViewById(R.id.name)
        var menu: TextView = view.findViewById(R.id.popup_menu)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TournamentViewHolder {
        val tournamentView = LayoutInflater.from(parent.context).inflate(R.layout.tournament_view, parent, false)
        val intent = Intent(Intent(mContext, TournamentDetailActivity::class.java))
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentGameId = bundle.getLong(GAME_ID)
        }
        return TournamentViewHolder(tournamentView)
    }

    override fun onBindViewHolder(holder: TournamentViewHolder, position: Int) {
        val tournament: Tournament = getItem(position) ?: return
        holder.id = tournament._id  // changed id to _id
        holder.name.text = tournament.name
        holder.menu.setOnClickListener { onMenuClicked(holder) }
        intent.putExtra("DATE", tournament.startTime)
        intent.putExtra("NAME", tournament.name)

    }
    private fun onMenuClicked(holder: TournamentAdapter.TournamentViewHolder) {
       // mContext.startActivity(Intent(mContext, TournamentDetailActivity::class.java))

        intent.putExtra(GAME_ID, currentGameId)
        mContext.startActivity(intent)
    }


}
