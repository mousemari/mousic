package com.example.mousic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Intervals_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intervals_main)



        val button1 = findViewById<Button>(R.id.standart_intervals)
        button1.setOnClickListener{
            val intent = Intent(this, standart_intervals_theory::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.tritons)
        button2.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 12)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.special_intervals)
        button3.setOnClickListener {
            val intent = Intent(this, TheoryReader::class.java)
        }
    }
}