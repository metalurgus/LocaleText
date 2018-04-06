package com.github.metalurgus.localetext;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Locale;

import metalurgus.github.com.lib.base.LocaleText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.rus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocaleText.setLocale(new Locale("ru", "RU"), MainActivity.this);
            }
        });
        findViewById(R.id.eng).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocaleText.setLocale(new Locale("en", "US"), MainActivity.this);
            }
        });
    }

}
