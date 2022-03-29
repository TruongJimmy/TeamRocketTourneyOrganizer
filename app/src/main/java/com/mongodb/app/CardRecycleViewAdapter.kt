package com.mongodb.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import org.w3c.dom.Text
import com.mongodb.app.games.GAME_ID
import com.mongodb.app.games.GamesListActivity
import com.mongodb.app.games.NAME_GAME
import io.realm.Sort

class CardViewRecyclerAdapter: RecyclerView.Adapter<CardViewRecyclerAdapter.ViewHolder>() {

    val user = realmApp.currentUser()
    val partition = "123"
    val config = SyncConfiguration.Builder(user, partition)
        // because this application only reads/writes small amounts of data, it's OK to read/write from the UI thread
//        .allowWritesOnUiThread(true)
//        .allowQueriesOnUiThread(true)
        .build()
    // open the realm
    val realm = Realm.getInstance(config)
    var title = realm!!.where<Tournament>().sort("name", Sort.ASCENDING).findAllAsync()
    var details = realm!!.where<Tournament>().findAllAsync()
    var host = realm!!.where<Tournament>().findAllAsync()
    var startTime = realm!!.where<Tournament>().findAllAsync()
//    private var title = arrayOf("Chap 1","Chap 2","Chap 3","Chap 4","Chap 5","Chap 6","Chap 7","Chap 8","Chap 9")
//    private var details = arrayOf("detail 1","detail 2","detail 3", "detail 4", "detail 5", "detail 6", "detail 7", "detail 8", "detail 9")
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
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round,
        R.mipmap.dbz_round
    )


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) : ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemTitle.text = title[position]?.name.toString()
        holder.itemDetail.text = details[position]?.tournamentType.toString()
        holder.itemHost.text = host[position]?.location.toString()
        holder.itemStartTime.text = startTime[position]?.startTime.toString()
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemHost: TextView
        var itemStartTime: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)
            itemHost = itemView.findViewById(R.id.itemHost)
            itemStartTime = itemView.findViewById(R.id.itemStartTime)

        }
    }


}