package com.iducs;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeAttributeToCode extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_define);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setText("코드에서도 변경 가능");

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setEnabled(false);
    }
}
