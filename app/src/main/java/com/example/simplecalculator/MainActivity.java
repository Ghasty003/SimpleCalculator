package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        add = (Button) findViewById(R.id.btnAdd);
        subtract = (Button) findViewById(R.id.btnSubtract);
        divide = (Button) findViewById(R.id.btnDivide);
        multiply = (Button) findViewById(R.id.btnMultiply);
        result = (TextView) findViewById(R.id.tvAnswer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer: " + String.valueOf(sum));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int subtract = number1 - number2;
                result.setText("Answer: " + String.valueOf(subtract));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int multiply = number1 * number2;
                result.setText("Answer: " + String.valueOf(multiply));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                double divide = number1 / number2;

                if ( number2 == 0 ) {

                    result.setText("Cannot divide by 0");
                }
                else {
                    result.setText("Answer: " + String.valueOf(divide));
                }
            }
        });
    }
}