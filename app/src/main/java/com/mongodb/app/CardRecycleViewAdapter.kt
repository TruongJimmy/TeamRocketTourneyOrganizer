package com.mongodb.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardViewRecyclerAdapter: RecyclerView.Adapter<CardViewRecyclerAdapter.ViewHolder>() {
    private var title = arrayOf("Chap 1","Chap 2","Chap 3","Chap 4","Chap 5","Chap 6","Chap 7","Chap 8","Chap 9")
    private var details = arrayOf("detail 1","detail 2","detail 3", "detail 4", "detail 5", "detail 6", "detail 7", "detail 8", "detail 9")
    private var images = intArrayOf(
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
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size


    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)

        }
    }

}