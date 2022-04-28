package com.mongodb.app

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import io.realm.RealmConfiguration
import java.text.DateFormat
import java.util.*
import java.text.SimpleDateFormat
import java.time.LocalDateTime

class TimerActivity : AppCompatActivity() {
    private var mTextViewCountDown: TextView? = null
    private var mButtonStartPause: Button? = null
    private var mButtonReset: Button? = null
    private var mCountDownTimer: CountDownTimer? = null
    private var mTimerRunning = false
    private var mTimeLeftInMillis = START_TIME_IN_MILLIS

    private lateinit var StartTime: String
    private lateinit var date: DateFormat
    private lateinit var StartDate : Date
    private var milliStart = 0.0
    private lateinit var currentDate: String
    private lateinit var CurrentDate : Date
    private  var currentMillis = 0.0
    private var clockStart = 0L


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        val tournament = Tournament()

        currentDate = LocalDateTime.now().toString()
        date = SimpleDateFormat("h:mm a")
        CurrentDate = date.parse(currentDate)
        currentMillis = CurrentDate.getTime().toDouble()


        StartTime =  tournament.startTime
        StartTime = StartTime.substring(0, StartTime.indexOf(' ')+1)
        date = SimpleDateFormat("h:mm a")
        StartDate = date.parse(StartTime)
        milliStart = StartDate.getTime().toDouble()

        clockStart = (milliStart - 7200000) as Long



        mTextViewCountDown = findViewById(R.id.text_view_countdown)
        mButtonStartPause = findViewById(R.id.button_start_pause)
        mButtonReset = findViewById(R.id.button_reset)
        mButtonStartPause!!.setOnClickListener {
            if (mTimerRunning) {
                pauseTimer()
            } else {
                startTimer()
            }
        }
        mButtonReset!!.setOnClickListener { resetTimer() }
        updateCountDownText()
    }

    private fun startTimer() {
        if(currentMillis as Long == clockStart){
            mTimerRunning = true
            mCountDownTimer = object : CountDownTimer(clockStart as Long, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    clockStart = millisUntilFinished
                    updateCountDownText()
                }

                override fun onFinish() {
                    mTimerRunning = false
                }
            }.start()
        }

        mTimerRunning = true
        mButtonStartPause!!.text = "pause"
        mButtonReset!!.visibility = View.INVISIBLE
    }

    private fun pauseTimer() {
        mCountDownTimer?.cancel()
        mTimerRunning = false
        mButtonStartPause!!.text = "Start"
        mButtonReset!!.visibility = View.VISIBLE
    }

    private fun resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS
        updateCountDownText()
        mButtonReset!!.visibility = View.INVISIBLE
        mButtonStartPause!!.visibility = View.VISIBLE
    }

    private fun updateCountDownText() {
        val minutes = (mTimeLeftInMillis / 1000).toInt() / 60
        val seconds = (mTimeLeftInMillis / 1000).toInt() % 60
        val timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds)
        mTextViewCountDown?.setText(timeLeftFormatted)
    }

    companion object {
        private const val START_TIME_IN_MILLIS: Long = 600000
    }
}
