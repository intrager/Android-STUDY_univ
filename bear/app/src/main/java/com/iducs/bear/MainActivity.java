package com.iducs.bear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.iducs.bear.R;

public class MainActivity extends AppCompatActivity {

    EditText inputNum1, inputNum2, resultNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNum1 = findViewById(R.id.inputNum1);
        inputNum2 = findViewById(R.id.inputNum2);
        resultNum = findViewById(R.id.resultNum);
    }

    public void funcPlus(View view) {
        int num1 = Integer.parseInt(inputNum1.getText().toString());
        int num2 = Integer.parseInt(inputNum2.getText().toString());
        String result = String.valueOf(num1 + num2);
        resultNum.setText(result);
    }

    public void funcMinus(View view) {
        int num1 = Integer.parseInt(inputNum1.getText().toString());
        int num2 = Integer.parseInt(inputNum2.getText().toString());
        String result = String.valueOf(num1 - num2);
        resultNum.setText(result);
    }

    public void funcMul(View view) {
        int num1 = Integer.parseInt(inputNum1.getText().toString());
        int num2 = Integer.parseInt(inputNum2.getText().toString());
        String result = String.valueOf(num1 * num2);
        resultNum.setText(result);
    }

    public void funcDiv(View view) {
        int num1 = Integer.parseInt(inputNum1.getText().toString());
        int num2 = Integer.parseInt(inputNum2.getText().toString());
        String result = String.valueOf(num1 / num2);
        resultNum.setText(result);
    }
}