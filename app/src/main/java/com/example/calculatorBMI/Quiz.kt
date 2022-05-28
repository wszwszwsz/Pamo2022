package com.example.calculatorBMI

import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorBMI.Question
import android.widget.TextView
import android.os.Bundle
import com.example.calculatorBMI.R
import android.widget.Toast
import android.widget.EditText
import android.content.Intent
import android.view.View
import com.example.calculatorBMI.Activity2
import com.example.calculatorBMI.Quiz
import com.example.calculatorBMI.GraphActivity
import android.webkit.WebView
import android.widget.Button
import java.util.*

class Quiz : AppCompatActivity(), View.OnClickListener {
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    private val question = Question()
    var question_text: TextView? = null
    private var answer: String? = null
    private val questionlength = question.questions.size
    var random: Random? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        random = Random()
        button1 = findViewById<View>(R.id.button1) as Button
        button1!!.setOnClickListener(this)
        button2 = findViewById<View>(R.id.button2) as Button
        button2!!.setOnClickListener(this)
        button3 = findViewById<View>(R.id.button3) as Button
        button3!!.setOnClickListener(this)
        button4 = findViewById<View>(R.id.button4) as Button
        button4!!.setOnClickListener(this)
        question_text = findViewById<View>(R.id.questions) as TextView
        NextQuestion(random!!.nextInt(questionlength))
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button1 -> if (button1!!.text === answer) {
                Toast.makeText(this, "Prawidłowo!", Toast.LENGTH_LONG).show()
                NextQuestion(random!!.nextInt(questionlength))
            }
            R.id.button2 -> if (button2!!.text === answer) {
                Toast.makeText(this, "Prawidłowo!", Toast.LENGTH_LONG).show()
                NextQuestion(random!!.nextInt(questionlength))
            }
            R.id.button3 -> if (button3!!.text === answer) {
                Toast.makeText(this, "Prawidłowo!", Toast.LENGTH_LONG).show()
                NextQuestion(random!!.nextInt(questionlength))
            }
            R.id.button4 -> if (button4!!.text === answer) {
                Toast.makeText(this, "Prawidłowo!", Toast.LENGTH_LONG).show()
                NextQuestion(random!!.nextInt(questionlength))
            }
        }
    }

    private fun NextQuestion(x: Int) {
        question_text!!.text = question.getQuestion(x)
        button1!!.text = question.getchoice1(x)
        button2!!.text = question.getchoice2(x)
        button3!!.text = question.getchoice3(x)
        button4!!.text = question.getchoice4(x)
        answer = question.getCorrectAnswer(x)
    }
}