package com.example.calculatorassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1ET;
    EditText number2ET;
    TextView resultTV;
    TextView operationTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1ET = findViewById(R.id.num1ET);
        number2ET = findViewById(R.id.num2ET);
        resultTV = findViewById(R.id.resultTV);
        operationTV = findViewById(R.id.operationTV);
    }

    public void findSum(View view) {
        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;
        resultTV.setText("=\t\t" + sum);
        operationTV.setText("+");
    }

    public void findDif(View view) {
        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int dif = num1 - num2;
        resultTV.setText("=\t\t" + dif);
        operationTV.setText("-");
    }

    public void findmult(View view){
        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int mult = num1 * num2;
        resultTV.setText("=\t\t" + mult);
        operationTV.setText("×");
    }

    public void findDiv(View view){
        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        double div = (double)num1 / num2;
        resultTV.setText("=\t\t" + div);
        operationTV.setText("÷");
    }


}