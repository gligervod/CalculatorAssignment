package com.example.calculatorassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);
        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;
        resultTV.setText("" + sum);
    }

    public void findDif(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);
        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int dif = num1 - num2;
        resultTV.setText("" + dif);
    }

}