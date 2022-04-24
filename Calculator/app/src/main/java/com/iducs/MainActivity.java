package com.iducs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id1, et_id2, et_id3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id1 = findViewById(R.id.et_id1);
        et_id2 = findViewById(R.id.et_id2);
        et_id3 = findViewById(R.id.et_id3);
    }

    public void funcPlus(View view) {
        int num1 = Integer.parseInt(et_id1.getText().toString());
        int num2 = Integer.parseInt(et_id2.getText().toString());
        String result = String.valueOf(num1 + num2);
        et_id3.setText(result);
    }

    public void funcMinus(View view) {
        int num1 = Integer.parseInt(et_id1.getText().toString());
        int num2 = Integer.parseInt(et_id2.getText().toString());
        String result = String.valueOf(num1 - num2);
        et_id3.setText(result);
    }

    public void funcMul(View view) {
        int num1 = Integer.parseInt(et_id1.getText().toString());
        int num2 = Integer.parseInt(et_id2.getText().toString());
        String result = String.valueOf(num1 * num2);
        et_id3.setText(result);
    }

    public void funcDiv(View view) {
        int num1 = Integer.parseInt(et_id1.getText().toString());
        int num2 = Integer.parseInt(et_id2.getText().toString());
        String result = String.valueOf(num1 / num2);
        et_id3.setText(result);
    }

}