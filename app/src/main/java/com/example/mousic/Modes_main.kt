package com.example.mousic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Modes_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modes_main)

        val button1 = findViewById<Button>(R.id.angemiton)
        button1.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 31)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.diatonic)
        button2.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 32)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.cond_diatonic)
        button3.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 33)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.false_modes)
        button4.setOnClickListener{
            val intent = Intent(this, TheoryReader::class.java)
            intent.putExtra("ListOfTheory", 34)
            startActivity(intent)
        }
    }
}