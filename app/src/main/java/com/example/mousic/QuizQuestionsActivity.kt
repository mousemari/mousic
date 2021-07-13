package com.example.mousic

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1 // Дефолтное значение позиции первого вопроса
    private var mQuestionsList: ArrayList<Question>? = null

    private var mCorrectAnswers: Int = 0
    private var mSelectedOptionPosition: Int = 0

    //объявление приватных переменных, которые будут инициализированы позже
    private lateinit var tv_option_one: TextView
    private lateinit var tv_option_two: TextView
    private lateinit var tv_option_three: TextView
    private lateinit var tv_option_four: TextView

    private lateinit var btn_submit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        // Запуск активити
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_questions)

        //Помещаем в переменную список вопросов из объекта Constants
        mQuestionsList = Constants.getQuestions()

        //Инициализация переменных
        tv_option_one = findViewById<TextView>(R.id.tv_option_one)
        tv_option_two = findViewById<TextView>(R.id.tv_option_two)
        tv_option_three = findViewById<TextView>(R.id.tv_option_three)
        tv_option_four = findViewById<TextView>(R.id.tv_option_four)

        btn_submit = findViewById<Button>(R.id.btn_submit)

        //Размещение полей первого вопроса
        setQuestion()

        //Так как класс наследуется в том числе от View.OnClickListener,
        //то можем сразу задать им ожидание нажатия с параметром this
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

        btn_submit.setOnClickListener(this)

    }

    //Обработка нажатий
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tv_option_one -> {

                selectedOptionView(tv_option_one, 1)
            }

            R.id.tv_option_two -> {

                selectedOptionView(tv_option_two, 2)
            }

            R.id.tv_option_three -> {

                selectedOptionView(tv_option_three, 3)
            }

            R.id.tv_option_four -> {

                selectedOptionView(tv_option_four, 4)
            }

            // Логика при нажатии на кнопку подтверждения ответа
            R.id.btn_submit -> {

                tv_option_one.isEnabled=false
                tv_option_two.isEnabled=false
                tv_option_three.isEnabled=false
                tv_option_four.isEnabled=false

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }
                        else -> {

                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)

                    // При неверном ответе
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }
                    else{
                        mCorrectAnswers++
                    }

                    // При верном ответе
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btn_submit.text = "Итоги"
                    } else {
                        btn_submit.text = "К следующему вопросу"
                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }

   // Размещение вопросов в UI компоненты
    private fun setQuestion() {

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val tv_progress = findViewById<TextView>(R.id.tv_progress)
        val tv_question = findViewById<TextView>(R.id.tv_question)
        val iv_image = findViewById<ImageView>(R.id.iv_image)

        tv_option_one.isEnabled=true
        tv_option_two.isEnabled=true
        tv_option_three.isEnabled=true
        tv_option_four.isEnabled=true

       // Получение объекта вопроса из списка в соответствии с текущим положением
        val question = mQuestionsList!!.get(mCurrentPosition - 1)

        defaultOptionsView()

        btn_submit.text = "Подтвердить"


        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.getMax()

        tv_question.text = question.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    // Изменение стиля выбранного ответа
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this@QuizQuestionsActivity,
            R.drawable.selected_option_border_bg
        )
    }

    // Задание стандартного вида вариантов при отрисовке нового вопроса или при перевыборе ответа
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@QuizQuestionsActivity,
                R.drawable.default_option_border_bg
            )
        }
    }

    // Функция для задания фона текстового поля в зависимости от того, верный ответ или нет.
    // Используется в функции onClick при подтверждении выбранного ответа
    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
        }
    }

}