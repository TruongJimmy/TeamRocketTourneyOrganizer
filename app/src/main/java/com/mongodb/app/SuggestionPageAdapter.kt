package com.mongodb.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.suggestion_page_row.view.*

class SuggestionPageAdapter:RecyclerView.Adapter<CustomViewHolder>() {
    val tournamentTitles = listOf<String>("First Tournament","Second Tournament","Third Tournament")
    var tournamentPics = intArrayOf(R.drawable.logo,R.drawable.logo,R.drawable.logo)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        //how to create view
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.suggestion_page_row,parent,false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val tournamentTitles = tournamentTitles.get(position)
        holder?.view?.tournamentName.text = tournamentTitles

        //var tournamentPics = tournamentPics.get(position)
        holder?.view?.tournamentPic.setImageResource(tournamentPics[position])


    }
    //number of items
    override fun getItemCount(): Int {
        return 3
    }
}

class CustomViewHolder(val view:View): RecyclerView.ViewHolder(view)
{

}