package com.mongodb.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mongodb.app.R
import com.ventura.bracketslib.BracketsView
import com.ventura.bracketslib.model.CompetitorData
import com.ventura.bracketslib.model.MatchData
import com.ventura.bracketslib.model.ColomnData
import java.util.*

class BracketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bracket)

        //Init competitorData and matchData
        val bracketsView = findViewById<BracketsView>(R.id.bracket_view)
        val brazilSemiFinal = CompetitorData("Brazil", "3")
        val englandSemiFinal = CompetitorData("England", "1")
        val argentinaSemiFinal = CompetitorData("Argentina", "3")
        val russiaSemiFinal = CompetitorData("Russia", "2")
        val brazilFinal = CompetitorData("Brazil", "4")
        val argentinaFinal = CompetitorData("Argentina", "2")
        val match1SemiFinal = MatchData(brazilSemiFinal, englandSemiFinal)
        val match2SemiFinal = MatchData(argentinaSemiFinal, russiaSemiFinal)
        val match3Final = MatchData(brazilFinal, argentinaFinal)
        val semiFinalColomn = ColomnData(Arrays.asList(match1SemiFinal, match2SemiFinal))
        val finalColomn = ColomnData(Arrays.asList(match3Final))

        //set data on brackets
        bracketsView.setBracketsData(Arrays.asList(semiFinalColomn, finalColomn))

        //Below 2 lines - Back button for this page supported by the toolbar in xml file
        setSupportActionBar(findViewById(R.id.toolbar_CurrentTournament))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}