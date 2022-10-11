package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    EditText opr;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        opr = findViewById(R.id.operator);
        result = findViewById(R.id.result);
    }

    public void calculate(View view){

        if (
        num1.getText().toString().matches("") ||
        num2.getText().toString().matches("") ||
        opr.getText().toString().matches("")){
            result.setText("There is Empty field");
        }else {
            String operator = opr.getText().toString();
            int firstNum = Integer.parseInt(num1.getText().toString());
            int secondNum = Integer.parseInt(num2.getText().toString());

            int endResult;

            switch (operator) {

                case "+":
                    endResult = firstNum + secondNum;
                    result.setText("Result:" + endResult);
                    break;
                case "-":
                    endResult = firstNum - secondNum;
                    result.setText("Result:" + endResult);
                    break;
                case "x":
                    endResult = firstNum * secondNum;
                    result.setText("Result:" + endResult);
                    break;

                case "/":
                    endResult = firstNum / secondNum;
                    result.setText("Result:" + endResult);
                    break;
                default: result.setText("Operator False");
            }
        }
    }
}