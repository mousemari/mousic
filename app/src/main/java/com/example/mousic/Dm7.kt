package com.example.mousic

object Dm7 {
    fun getLesson() : ArrayList<Reader>
    {

        val lessonList = java.util.ArrayList<Reader>()

        //basics
        val lesson0 = Reader(
                0,
                "Общая информация",
                R.drawable.d70,
                "Про доминантсептаккорд и его разрешение"
        )
        lessonList.add(lesson0)

        val lesson1 = Reader(
                0,
                "Квинтсекст",
                R.drawable.d70,
                "Про квинтсекст и его разрешение"
        )
        lessonList.add(lesson1)

        val lesson2 = Reader(
                0,
                "Терцкварт",
                R.drawable.d70,
                "Про терцкварт"
        )
        lessonList.add(lesson2)

        val lesson3 = Reader(
                0,
                "Секундаккорд",
                R.drawable.d70,
                "Про секундаккорд"
        )
        lessonList.add(lesson3)

        return lessonList
    }
}