package com.mongodb.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class TournamentPageAdapter: RecyclerView.Adapter<TournamentPageAdapter.ViewHolder>() {

    private var title = arrayOf("Location", "Start Time", "Rules", "Contact Tournament Organizer", "Chat Room")
    private var details = arrayOf("long beach", "2:30", "Tap for details", "TO Name", "Text with other participants")

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TournamentPageAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.tournament_page_card_view, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: TournamentPageAdapter.ViewHolder, position: Int) {
        holder.headerTitle.text = title[position]
        holder.description.text = details[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var headerTitle: TextView
        var description: TextView

        init {
            headerTitle = itemView.findViewById(R.id.headerTitle)
            description = itemView.findViewById(R.id.bodyDetail)
        }
    }
}