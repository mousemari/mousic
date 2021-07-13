package com.example.mousic

object Constants{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        // 1
        val que1=Question(1,
            "Как иначе называется гармоническая прима?",
            R.drawable.harm1,
            "Унисон",
            "Октава",
            "Соло",
            "Хроматизм",
            1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "К какой группе относится большая секста?",
            R.drawable.b6,
            "Весьма совершенный консонанс", "Диссонанс",
            "Несовершенный консонанс", "Совершеннный консонанс", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Как называется изображенный интервал?",
            R.drawable.ch5,
            "Малая секста", "Большая секста",
            "Чистая кварта", "Чистая квинта", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Для чего используется малая секунда в гармоническом движении?",
            R.drawable.m2,
            "Пошаговое движение", "Создание тяготения",
            "Разрешение неустойчивости", "Составление интервалов", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Сколько тонов в представленном интервале?",
            R.drawable.ch4,
            "2,5", "3",
            "3,5", "4", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Какой интервал является диссонансом?",
            R.drawable.diss,
            "Малая септима", "Большая септима",
            "Большая секунда", "Все перечисленные", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Какой интервал является обращением большой терции?",
            R.drawable.b3,
            "Чистая кварта", "Чистая квинта",
            "Малая секста", "Малая терция", 3
        )

        questionsList.add(que7)


        return questionsList

    }
}