package com.firstapp.webviewapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView;
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView) ;
        webView.loadUrl("https://www.codingal.com/");
    }
}