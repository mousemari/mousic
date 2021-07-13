package com.example.mousic

object SeptChords {
    fun getLesson() : ArrayList<Reader>
    {

        val lessonList = java.util.ArrayList<Reader>()

        //basics
        val lesson0 = Reader(
                0,
                "Общая информация",
                R.drawable.d70,
                "Про построение септаккордов "
        )
        lessonList.add(lesson0)

        val lesson1 = Reader(
                0,
                "Мажорные септаккорды",
                R.drawable.d70,
                "Про большие и малые мажорные септаккорды "
        )
        lessonList.add(lesson1)

        val lesson2 = Reader(
                0,
                "Минорные септаккорды",
                R.drawable.d70,
                "Про большие и малые минорные септаккорды "
        )
        lessonList.add(lesson2)

        val lesson3 = Reader(
                0,
                "Увеличенные септаккорд",
                R.drawable.d70,
                "Про увеличенные септаккорд "
        )
        lessonList.add(lesson3)

        val lesson4 = Reader(
                0,
                "Полууменьшенные и уменьшонные",
                R.drawable.d70,
                "Про полууменьшенные и уменьшенные септаккорды "
        )
        lessonList.add(lesson4)

        return lessonList
    }
}