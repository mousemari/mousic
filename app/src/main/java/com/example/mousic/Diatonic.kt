package com.example.mousic

object Diatonic {
    fun getLesson() : ArrayList<Reader> {

        val lessonList = java.util.ArrayList<Reader>()

        //basics
        val lesson0 = Reader(
                0,
                "Общая информация",
                R.drawable.d70,
                ""
        )
        lessonList.add(lesson0)

        val lesson1 = Reader(
                1,
                "",
                R.drawable.d70,
                ""
        )
        lessonList.add(lesson1)

        return lessonList
    }
}