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

class Activity2 : AppCompatActivity() {
    var weight: EditText? = null
    var height: EditText? = null
    var years: EditText? = null
    var result: TextView? = null
    var calculation: String? = null
    var BMIresult: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        weight = findViewById(R.id.weight)
        height = findViewById(R.id.height)
        years = findViewById(R.id.years)
        result = findViewById(R.id.result)
    }

    fun calculateBMI(view: View?) {
        val heightStr = height!!.text.toString()
        val weightStr = weight!!.text.toString()
        val yearsStr = years!!.text.toString()
        val heightValue = heightStr.toFloat() / 100
        val weightValue = weightStr.toFloat()
        val yearsValue = yearsStr.toFloat()
        val heightValueCalories = heightStr.toFloat()
        val bmi = weightValue / (heightValue * heightValue)
        val calories = (66.47 + 13.7 * weightValue + 5.0 * heightValueCalories - 6.67 * yearsValue).toFloat()
        displayBMI(bmi, calories)
    }

    private fun displayCalories() {}
    private fun displayBMI(bmi: Float, calories: Float) {
        var bmiLabel = ""
        bmiLabel = if (java.lang.Float.compare(bmi, 15f) <= 0) {
            """BMI ujemne :(

 proponuje odwiedzic: https://www.medme.pl/artykuly/dieta-3000-kcal-jadlospis-tygodniowy-na-przytycie,87259.html"""
        } else if (java.lang.Float.compare(bmi, 18.5f) > 0 && java.lang.Float.compare(bmi, 25f) <= 0) {
            "BMI w normie! :) Jedz to co jadłes i jest git :)"
        } else if (java.lang.Float.compare(bmi, 25f) > 0 && java.lang.Float.compare(bmi, 40f) <= 0) {
            """BMI za duże :(

 proponuje odwiedzic: https://polki.pl/dieta-i-fitness/odchudzanie,dieta-wyszczuplajaca-skuteczny-jadlospis-odchudzajacy-na-7-dni,10007514,artykul.html"""
        } else {
            "zdecydowanie za duzo!!! udaj sie do lekarza"
        }
        bmiLabel = """
            bmi ${String.format(bmi.toString())}
            
            $bmiLabel
            
            powinienes jeść około: ${String.format(calories.toString())}kcal
            """.trimIndent()
        result!!.text = bmiLabel
    }
}