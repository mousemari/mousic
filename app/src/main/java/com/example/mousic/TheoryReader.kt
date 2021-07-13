package com.example.mousic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import android.content.Intent
import android.widget.*

class TheoryReader : AppCompatActivity() {
    private var currentPosition:Int = 0

    private lateinit var btnNext:Button
    private lateinit var btnBack:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reader)

        val theoryTheme = intent.getIntExtra("ListOfTheory", 12)
        val theoryLessons: ArrayList<Reader> = GetTheory.getLesson(theoryTheme)

        // Загаловок на странице с материалами в зависимости от того, из какой темы попал
        when (theoryTheme){
            // Интервалы. Тема "стандатрные интервлы" реализована другим методом
            12 -> {
                title = "Тритоны"
            }
            13 -> {
                title = "Характерные интервалы"
            }
            // Аккорды
            21 -> {
                title = "Стандартные трезвучия"
            }
            22 -> {
                title = "Побочные трезвучия"
            }
            23 -> {
                title = "Доминантсептаккорд"
            }
            24 -> {
                title = "Септаккорды"
            }
            // Лады
            31 -> {
                title = "Бесполутоновые лады"
            }
            32 -> {
                title = "Диатонические лады"
            }
            33 -> {
                title = "Условно диатонические лады"
            }
            34 -> {
                title = "Искуственные лады"
            }
            // Ритм
            41 -> {
                title = "Ритмические деления"
            }
            42 -> {
                title = "Размер"
            }
            43 -> {
                title = "Метр"
            }
            44 -> {
                title = "Ритмический рисунок"
            }
        }

        btnNext = findViewById<Button>(R.id.btn_next)
        btnBack = findViewById<Button>(R.id.btn_back)

        // На первой странице отсутствует кнопка "назад"
        btnBack.isVisible = false

        // Заполняем UI контейнеры в соответствии с полями объекта
        setLesson()

        btnNext.setOnClickListener(){
            currentPosition++
            btnBack.isVisible = true
            setLesson()


            if (currentPosition == theoryLessons!!.size-1){
                btnNext.isVisible = false
            }
        }

        btnBack.setOnClickListener(){
            currentPosition--
            btnNext.isVisible = true
            setLesson()


            if (currentPosition == 0){
                btnBack.isVisible = false
            }
        }
    }

    // Заполнение контейнеров в соответствии с полями объекта
    private fun setLesson(){
        val lessonTitle = findViewById<TextView>(R.id.lessonTitle)
        val img = findViewById<ImageView>(R.id.lessonImage)
        val lessonText = findViewById<TextView>(R.id.lessonText)

        val theoryTheme = intent.getIntExtra("ListOfTheory", 1)
        val theoryLessons: ArrayList<Reader> = GetTheory.getLesson(theoryTheme)

        val lesson = theoryLessons!!.get(currentPosition)

        // Для прокрутки текстового поля в начало при переходе на новую страницу
        val scroll = findViewById<ScrollView>(R.id.scrollView2)
        scroll.scrollTo(0,0)

        lessonTitle.text = lesson.lessonTitle
        img.setImageResource(lesson.pict)
        lessonText.text = lesson.lessonText
    }
}