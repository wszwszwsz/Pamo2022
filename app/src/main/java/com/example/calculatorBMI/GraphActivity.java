package com.example.calculatorBMI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        WebView graph = findViewById(R.id.graph);
        graph.getSettings().setJavaScriptEnabled(true);
        graph.loadUrl("https://www.vertex42.com/ExcelTemplates/Images/bmi-chart.gif");
    }
}