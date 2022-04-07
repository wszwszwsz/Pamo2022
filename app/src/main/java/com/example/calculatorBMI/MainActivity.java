package com.example.calculatorBMI;

/******************************
 * Author: Wojciech Szypelt s14578
 ******************************/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button activity2;
    private Button quiz;
    private Button graph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity2 = (Button) findViewById(R.id.button);
        quiz = (Button) findViewById(R.id.quiz);
        graph = (Button) findViewById(R.id.graphs);

        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz();
            }
        });
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGraph();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void openQuiz(){
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
    public void openGraph(){
        Intent intent = new Intent(this, GraphActivity.class);
        startActivity(intent);
    }

}