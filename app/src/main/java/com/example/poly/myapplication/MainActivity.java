package com.example.poly.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText etNumberOne;
    private AppCompatEditText etNumberTwo;
    private AppCompatButton btnPlus;
    private AppCompatButton btnMinus;
    private AppCompatButton btnMultiply;
    private AppCompatButton btnDivide;
    private AppCompatTextView tvResult;

    private Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumberTwo);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NumberOne = etNumberOne.getText().toString();
                String NumberTwo = etNumberTwo.getText().toString();
                if (etNumberOne.length() > 0 && etNumberTwo.length() > 0) {
                    int result = calculator.plus(Integer.parseInt(NumberOne), Integer.parseInt(NumberTwo));
                    tvResult.setText(String.valueOf(result));

                }

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NumberOne = etNumberOne.getText().toString();
                String NumberTwo = etNumberTwo.getText().toString();
                if (etNumberOne.length() > 0 && etNumberTwo.length() > 0) {
                    int result = calculator.minus(Integer.parseInt(NumberOne), Integer.parseInt(NumberTwo));
                    tvResult.setText(String.valueOf(result));

                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NumberOne = etNumberOne.getText().toString();
                String NumberTwo = etNumberTwo.getText().toString();
                if (etNumberOne.length() > 0 && etNumberTwo.length() > 0) {
                    int result = calculator.multiply(Integer.parseInt(NumberOne), Integer.parseInt(NumberTwo));
                    tvResult.setText(String.valueOf(result));

                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NumberOne = etNumberOne.getText().toString();
                String NumberTwo = etNumberTwo.getText().toString();
                if (etNumberOne.length() > 0 && etNumberTwo.length() > 0) {
                    int result = calculator.divide(Integer.parseInt(NumberOne), Integer.parseInt(NumberTwo));
                    tvResult.setText(String.valueOf(result));

                }
            }
        });

    }

}
