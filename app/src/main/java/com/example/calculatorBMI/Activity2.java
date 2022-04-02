package com.example.calculatorBMI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText weight, height, years;
    TextView result;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        years = findViewById(R.id.years);
        result = findViewById(R.id.result);
    }

    public void calculateBMI(View view) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        String yearsStr = years.getText().toString();

        float heightValue = Float.parseFloat(heightStr) / 100;
        float weightValue = Float.parseFloat(weightStr);
        float yearsValue = Float.parseFloat(yearsStr);
        float heightValueCalories = Float.parseFloat(heightStr);

        float bmi = weightValue / (heightValue * heightValue);
        float calories = (float) (66.47 + (13.7 * weightValue) + (5.0 * heightValueCalories) - (6.67 * yearsValue));

        displayBMI(bmi, calories);
    }

    private void displayCalories() {
    }

    private void displayBMI(float bmi, float calories) {
        String bmiLabel = "";

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel = "BMI ujemne :(" + "\n\n" + " proponuje odwiedzic: " + "https://www.medme.pl/artykuly/dieta-3000-kcal-jadlospis-tygodniowy-na-przytycie,87259.html";
        } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0) {
            bmiLabel = "BMI w normie! :) Jedz to co jadłes i jest git :)";
        } else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 40f) <= 0) {
            bmiLabel = "BMI za duże :(" + "\n\n" + " proponuje odwiedzic: " + "https://polki.pl/dieta-i-fitness/odchudzanie,dieta-wyszczuplajaca-skuteczny-jadlospis-odchudzajacy-na-7-dni,10007514,artykul.html";;
        } else {
            bmiLabel ="zdecydowanie za duzo!!! udaj sie do lekarza";
        }
        bmiLabel = "bmi " + "%.2f".format(String.valueOf(bmi)) + "\n\n" + bmiLabel + "\n\n" + "powinienes jeść około: " + "%.2f".format(String.valueOf(calories)) + "kcal";
        result.setText(bmiLabel);
    }

}