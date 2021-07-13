package com.example.mousic

object SpecialIntervals {
    fun getLesson() : ArrayList<Reader>{

        val lessonList = java.util.ArrayList<Reader>()

        //basics
        val lesson0 = Reader(
                0,
                "Общая информация",
                R.drawable.b3,
                "Про характерные интервалы"
        )
        lessonList.add(lesson0)


        val lesson1 = Reader(
                1,
                "Увеличенные кварты",
                R.drawable.ic_launcher_background,
                "Секунда. Говорю про кварты. очень длинный текст Говорю про увеличенную секунду. очень длинный текст Говорю про кварты. очень длинный текст " +
                        "Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст " +
                        "Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст " +
                        "Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст " +
                        "Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст " +
                        "Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст " +
                        "Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст Говорю про кварты. очень длинный текст "
        )
        lessonList.add(lesson1)

        val lesson2 = Reader(
                2,
                "Уменьшенные кварты",
                R.drawable.b3,
                "про уменьшенные кварты"
        )
        lessonList.add(lesson2)

        val lesson3 = Reader(
                3,
                "Увеличенные квинты",
                R.drawable.ch5,
                "Про увеличенные квинты"
        )
        lessonList.add(lesson3)

        return lessonList
    }
}