package com.example.calculatorBMI;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Quiz extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4;
    private Question question= new Question();
    TextView question_text;
    private String answer;
    private int questionlength=question.questions.length;
    Random random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        random = new Random();
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        question_text=(TextView)findViewById(R.id.questions);
        NextQuestion(random.nextInt(questionlength));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button1:
                if (button1.getText()==answer){
                    Toast.makeText(this,"Prawidłowo!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionlength));
                }
                break;
            case R.id.button2:
                if (button2.getText()==answer){
                    Toast.makeText(this,"Prawidłowo!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionlength));
                }
                break;
            case R.id.button3:
                if (button3.getText()==answer){
                    Toast.makeText(this,"Prawidłowo!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionlength));
                }
                break;
            case R.id.button4:
                if (button4.getText()==answer){
                    Toast.makeText(this,"Prawidłowo!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionlength));
                }
                break;
        }

    }

    private void NextQuestion(int x) {
        question_text.setText(question.getQuestion(x));
        button1.setText(question.getchoice1(x));
        button2.setText(question.getchoice2(x));
        button3.setText(question.getchoice3(x));
        button4.setText(question.getchoice4(x));
        answer=question.getCorrectAnswer(x);

    }
}