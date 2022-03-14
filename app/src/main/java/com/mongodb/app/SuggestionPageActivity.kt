package com.mongodb.app

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.suggestion_page.*

class SuggestionPageActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.suggestion_page)
        //recycler_view.setBackgroundColor(Color.BLUE)
        recycler_view.layoutManager = LinearLayoutManager(this)
      //  recycler_view.adapter = SuggestionPageAdapter()
        recycler_view.adapter = SuggestionPageAdapter()
    }

}