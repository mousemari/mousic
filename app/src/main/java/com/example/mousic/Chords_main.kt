package com.example.mousic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Chords_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chords_main)

        val button1 = findViewById<Button>(R.id.standart_trio)
        button1.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 21)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.side_trio)
        button2.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 22)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.D7)
        button3.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 23)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.sept_chords)
        button4.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 24)
            startActivity(intent)
        }
    }
}