package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1, number2;
    Button sum, subtract, multiply, divide;
    float x;
    float a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        sum = (Button)findViewById(R.id.sum_btn);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiplication);
        divide = (Button)findViewById(R.id.divide);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(number1.getText().toString());
                b = Float.parseFloat(number2.getText().toString());
                x = a+b;
                result.setText(String.valueOf(x));

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(number1.getText().toString());
                b = Float.parseFloat(number2.getText().toString());
                x = a-b;
                result.setText(String.valueOf(x));

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(number1.getText().toString());
                b = Float.parseFloat(number2.getText().toString());
                x = a*b;
                result.setText(String.valueOf(x));

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(number1.getText().toString());
                b = Float.parseFloat(number2.getText().toString());
                x = a/b;
                result.setText(String.valueOf(x));

            }
        });

    }
}
