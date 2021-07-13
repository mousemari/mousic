package com.example.mousic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val button1 = findViewById<Button>(R.id.intervals)
        button1.setOnClickListener{
            val intent = Intent(this, Intervals_main::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.chords)
        button2.setOnClickListener{
            val intent = Intent(this, Chords_main::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.modes)
        button3.setOnClickListener{
            val intent = Intent(this, Modes_main::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.rhythm)
        button4.setOnClickListener{
            val intent = Intent(this, Rhythm_main::class.java)
            startActivity(intent)
        }
    }


}
