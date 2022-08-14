package com.example.bongobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView webApp = (WebView) findViewById(R.id.webApp);

        webApp.getSettings().setJavaScriptEnabled(true);
        webApp.loadUrl("https://bongoacademy.com/gotomycourse");
    }
}