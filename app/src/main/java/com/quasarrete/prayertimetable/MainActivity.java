package com.quasarrete.prayertimetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        website = findViewById(R.id.webView);
        WebSettings webSettings = website.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        website.setInitialScale(170);
        website.loadUrl("http://masjidsolutions.com/ms/msbm/");

    }
}
