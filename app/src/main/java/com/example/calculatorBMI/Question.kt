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

class Question {
    var questions = arrayOf(
            "Czy pączki sa zdrowe?",
            "Co powinno byc podstawowym żródłem energii na co dzień?",
            "Ile posiłkow dziennie powinno sie jesc?",
            "Który z posiłków jest najważniejszy?",
            "Co ile godzin powinno się spożywać posiłki?",
            "Ile godzin snu potrzebuje przecietny człowiek?"
    )
    var choices = arrayOf(arrayOf("Tak, jeszcze jak!", "Nieeee, to samo zlo", "wszystko zalezy od ilosci paczkow", "Lubie placki"), arrayOf("Zboża", "Podatki ", "mieso", "ryby"), arrayOf("Jeden", "Dwa", "Cztery", "Pięć"), arrayOf("Śniadanie", "Drugie śniadanie", "Obiad", "Kolacja"), arrayOf("1", "10", "2", "3-4"), arrayOf("4", "5-6", "7-8", "12"))
    var correctAnswer = arrayOf(
            "wszystko zalezy od ilosci paczkow", "Zboża", "Pięć", "Śniadanie", "3-4", "7-8"
    )

    fun getQuestion(x: Int): String {
        return questions[x]
    }

    fun getchoice1(x: Int): String {
        return choices[x][0]
    }

    fun getchoice2(x: Int): String {
        return choices[x][1]
    }

    fun getchoice3(x: Int): String {
        return choices[x][2]
    }

    fun getchoice4(x: Int): String {
        return choices[x][3]
    }

    fun getCorrectAnswer(x: Int): String {
        return correctAnswer[x]
    }
}