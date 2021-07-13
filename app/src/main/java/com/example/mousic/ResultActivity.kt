package com.example.mousic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_result)

        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        var tv_score = findViewById<TextView>(R.id.tv_score)
        val btn_finish = findViewById<Button>(R.id.btn_finish)

        tv_score.text = "Правильных ответов: $correctAnswers из $totalQuestions"
        btn_finish.setOnClickListener{
            startActivity(Intent(this, Intervals_main::class.java))
        }


    }
}
