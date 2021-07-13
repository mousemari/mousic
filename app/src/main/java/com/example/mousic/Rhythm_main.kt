package com.example.mousic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rhythm_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rhythm_main)

        val button1 = findViewById<Button>(R.id.rhythm_div)
        button1.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 41)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.time_signature)
        button2.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 42)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.metre)
        button3.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 43)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.rhythm_pattern)
        button4.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 44)
            startActivity(intent)
        }
    }
}