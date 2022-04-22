package com.dandiahmadin.tugas1_akb_if1_10119033;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/*
 * Tanggal   : 22 April 2022
 * NIM       : 10119033
 * Nama      : Dandi Ahmadin
 * Kelas     : IF-1
 * */

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash_screen = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(splash_screen);
                finish();
            }
        }, 2000);
    }
}