package com.duytran.buoi29t3h

import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var numberTextView : TextView
    private lateinit var btnCount: Button
    private lateinit var btnReset: Button

    private var count: Int = 0
        set(value) {
            field = value
            numberTextView.text = value.toString()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        numberTextView = findViewById(R.id.numberTextView)
        btnCount = findViewById(R.id.btnCount)
        btnReset = findViewById(R.id.btnReset)

        count = sharedPreferences.getInt("count", 0)
        numberTextView.setBackgroundColor(sharedPreferences.getInt("color", Color.WHITE))

        btnCount.setOnClickListener {
            count++
            saveCount()
        }

        btnReset.setOnClickListener {
            count = 0
            saveCount()
        }

        findViewById<Button>(R.id.btnRed).setOnClickListener { changeColor(Color.RED) }
        findViewById<Button>(R.id.btnBLue).setOnClickListener { changeColor(Color.BLUE) }
        findViewById<Button>(R.id.btnGreen).setOnClickListener { changeColor(Color.GREEN) }
        findViewById<Button>(R.id.btnBlack).setOnClickListener { changeColor(Color.BLACK) }
    }

    private fun changeColor(color: Int) {
        numberTextView.setBackgroundColor(color)
        saveColor(color)
    }

    private fun saveCount() {
        val editor = sharedPreferences.edit()
        editor.putInt("count", count)
        editor.apply()
    }

    private fun saveColor(color: Int) {
        val editor = sharedPreferences.edit()
        editor.putInt("color", color)
        editor.apply()
    }
}

