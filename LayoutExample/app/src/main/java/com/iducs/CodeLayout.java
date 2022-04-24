package com.iducs;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class CodeLayout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        Button b1 = new Button(this);
        b1.setText("첫 번째 버튼");
        container.addView(b1);

        Button b2 = new Button(this);
        b2.setText("두 번째 버튼");
        container.addView(b2);

        setContentView(container);
    }
}
