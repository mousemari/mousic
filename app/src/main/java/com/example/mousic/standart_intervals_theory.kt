package com.example.mousic

import android.content.Intent
import android.content.res.Resources
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spanned
import android.widget.*
import androidx.core.view.isVisible
import com.example.mousic.QuizQuestionsActivity
import androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY

class standart_intervals_theory : AppCompatActivity() {
    var contextID = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standart_intervals_theory)

        val intervalName = findViewById<TextView>(R.id.name_of_interval)
        val intervalTextView = findViewById<TextView>(R.id.textview2)

        val nameID = resources.getIdentifier("intName0", "string", this.packageName)
        intervalName.text = getString(nameID)

        //попытка в стили
        /*val sometext : String = getString(nameID)
        val htmltext : Spanned = Html.fromHtml(sometext, FROM_HTML_MODE_LEGACY)
        intervalName.text = htmltext*/

        val textID= resources.getIdentifier("interval0", "string", this.packageName)
        intervalTextView.text=getString(textID)

        val nextButton = findViewById<Button>(R.id.next1)
        val backButton = findViewById<Button>(R.id.previous1)

        var pic = findViewById<ImageView>(R.id.intImg)

        val scroll = findViewById<ScrollView>(R.id.scrollView2)

        backButton.isVisible = false

        nextButton.setOnClickListener{
            contextID++
            backButton.isVisible = true
            scroll.scrollTo(0,0)

            val nameID = resources.getIdentifier("intName" + contextID, "string", this.packageName)
            intervalName.text = getString(nameID)
            val textID = resources.getIdentifier("interval" + contextID, "string", this.packageName)
            intervalTextView.text = getString(textID)

            val picID = resources.getIdentifier("int"+contextID, "drawable", this.packageName)
            pic.setImageResource(picID)

            if (contextID === 7) {
                nextButton.isVisible = false
                }
            }

        backButton.setOnClickListener {
            contextID--
            nextButton.isVisible = true
            scroll.scrollTo(0,0)

            val nameID = resources.getIdentifier("intName" + contextID, "string", this.packageName)
            intervalName.text = getString(nameID)
            val textID = resources.getIdentifier("interval" + contextID, "string", this.packageName)
            intervalTextView.text = getString(textID)
            val picID = resources.getIdentifier("int"+contextID, "drawable", this.packageName)
            pic.setImageResource(picID)

            if (contextID === 0) {
                    backButton.isVisible = false
                }
            }

        val quizButton = findViewById<Button>(R.id.quiz)
        quizButton.setOnClickListener{
            val intent = Intent(this,  QuizQuestionsActivity::class.java)
            startActivity(intent)
        }
    }

}