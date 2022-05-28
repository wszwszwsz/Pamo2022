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

/******************************
 * Author: Wojciech Szypelt s14578
 */
class MainActivity : AppCompatActivity() {
    private var activity2: Button? = null
    private var quiz: Button? = null
    private var graph: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activity2 = findViewById<View>(R.id.button) as Button
        quiz = findViewById<View>(R.id.quiz) as Button
        graph = findViewById<View>(R.id.graphs) as Button
        activity2!!.setOnClickListener { openActivity2() }
        quiz!!.setOnClickListener { openQuiz() }
        graph!!.setOnClickListener { openGraph() }
    }

    fun openActivity2() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    fun openQuiz() {
        val intent = Intent(this, Quiz::class.java)
        startActivity(intent)
    }

    fun openGraph() {
        val intent = Intent(this, GraphActivity::class.java)
        startActivity(intent)
    }
}