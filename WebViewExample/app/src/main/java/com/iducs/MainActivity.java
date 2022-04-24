package com.iducs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView wv;
    private WebSettings ws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.webview);
        ws = wv.getSettings();
        ws.setAllowFileAccess(true);
        ws.setAllowContentAccess(true);
        ws.setJavaScriptEnabled(true);

        wv.loadUrl("https://m.naver.com");
    }
}