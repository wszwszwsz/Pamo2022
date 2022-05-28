package com.example.calculatorBMI

import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorBMI.Question
import android.widget.TextView
import android.os.Bundle
import com.example.calculatorBMI.R
import android.widget.Toast
import android.widget.EditText
import android.content.Intent
import com.example.calculatorBMI.Activity2
import com.example.calculatorBMI.Quiz
import com.example.calculatorBMI.GraphActivity
import android.webkit.WebView

class GraphActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph)
        val graph = findViewById<WebView>(R.id.graph)
        graph.settings.javaScriptEnabled = true
        graph.loadUrl("https://www.vertex42.com/ExcelTemplates/Images/bmi-chart.gif")
    }
}