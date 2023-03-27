package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText first_num, last_num;
    ImageButton plus, minus;
    LinearLayout reset;
    int count;

    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_num = findViewById(R.id.first_num);
        last_num = findViewById(R.id.last_num);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        reset = findViewById(R.id.reset);
        result = findViewById(R.id.result);


        first_num.setOnClickListener(this);
        last_num.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        reset.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        try {


            String number1 = first_num.getText().toString();
            String number2 = last_num.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);


            if (view.getId() == R.id.plus) {

                double sum = num1 + num2;
                result.setText("Sum : " + sum);
                
            }


            if (view.getId() == R.id.minus) {

                double sub = num1 - num2;
                result.setText("Sub : " + sub);

            }


        } catch (Exception e) {

            Toast.makeText(MainActivity.this, "Enter any number", Toast.LENGTH_SHORT).show();

        }

    }

}
