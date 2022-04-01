package com.mongodb.app

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import org.w3c.dom.Text
import com.mongodb.app.games.GAME_ID
import com.mongodb.app.games.GamesListActivity
import com.mongodb.app.games.NAME_GAME
import io.realm.*

class ActiveUpcomingAdapter(private var tourneyQuery: RealmResults<Tournament>, private var images: IntArray): RecyclerView.Adapter<ActiveUpcomingAdapter.ViewHolder>() {

    private lateinit var mListener: onItemClickListener

//    val user = realmApp.currentUser()
//    val partition = "123"
//    val config = SyncConfiguration.Builder(user, partition).build()
//    // open the realm
//    val realm = Realm.getInstance(config)
//    var tourneyQuery = realm!!.where<Tournament>().findAllAsync()
//
//
//    private var images = intArrayOf(
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round,
//        R.mipmap.dbz_round
//    )

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) : ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(v, mListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemTitle.text = tourneyQuery[position]!!.name
        holder.itemDetail.text = tourneyQuery[position]!!.tournamentType
        holder.itemHost.text = tourneyQuery[position]!!.location
        holder.itemStartTime.text = tourneyQuery[position]!!.startTime
        holder.itemGameName.text = tourneyQuery[position]!!.game
        holder.itemPerson.text = tourneyQuery[position]!!.participant
        //holder.itemMoney.text = tourneyQuery[position]!!.p
        holder.itemImage.setImageResource(images[position])

    }

    override fun getItemCount(): Int {
        return images.size
    }

    inner class ViewHolder(itemView: View, listener: onItemClickListener): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemHost: TextView
        var itemStartTime: TextView
        var itemGameName: TextView
        var itemPerson: TextView
        //var itemMoney: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)
            itemHost = itemView.findViewById(R.id.itemHost)
            itemStartTime = itemView.findViewById(R.id.itemStartTime)
            itemGameName= itemView.findViewById(R.id.itemGameName)
            itemPerson = itemView.findViewById(R.id.itemPerson)
           // itemMoney = itemView.findViewById(R.id.itemMoney)

            itemView.setOnClickListener {
                listener.onItemClick(absoluteAdapterPosition)
            }
        }
    }


}