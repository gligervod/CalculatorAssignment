package com.example.calculatorassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1ET;
    EditText number2ET;
    TextView resultTV;
    TextView operationTV;
    Switch intDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1ET = findViewById(R.id.num1ET);
        number2ET = findViewById(R.id.num2ET);
        resultTV = findViewById(R.id.resultTV);
        operationTV = findViewById(R.id.operationTV);
        intDiv = findViewById(R.id.IntDivSwitch);
    }

    public void findSum(View view) {
        try {
            int num1 = Integer.parseInt(number1ET.getText().toString());
            int num2 = Integer.parseInt(number2ET.getText().toString());
            int sum = num1 + num2;
            resultTV.setText("=\t\t" + sum);
            operationTV.setText("+");
        } catch (Exception e){}
    }

    public void findDif(View view) {
        try {
            int num1 = Integer.parseInt(number1ET.getText().toString());
            int num2 = Integer.parseInt(number2ET.getText().toString());
            int dif = num1 - num2;
            resultTV.setText("=\t\t" + dif);
            operationTV.setText("-");
        } catch (Exception e){}
    }

    public void findmult(View view){
        try {
            int num1 = Integer.parseInt(number1ET.getText().toString());
            int num2 = Integer.parseInt(number2ET.getText().toString());
            int mult = num1 * num2;
            resultTV.setText("=\t\t" + mult);
            operationTV.setText("×");
        } catch (Exception e){}
    }

    public void findDiv(View view){
        try {
            if(intDiv.isChecked()){
                int num1 = Integer.parseInt(number1ET.getText().toString());
                int num2 = Integer.parseInt(number2ET.getText().toString());
                int div = num1 / num2;
                resultTV.setText("=\t\t" + div + " r" + num1 % num2);
                operationTV.setText("÷");
            } else {
                int num1 = Integer.parseInt(number1ET.getText().toString());
                int num2 = Integer.parseInt(number2ET.getText().toString());
                double div = (double) num1 / num2;
                resultTV.setText("=\t\t" + div);
                operationTV.setText("÷");
            }
        } catch (Exception e){}
    }


}