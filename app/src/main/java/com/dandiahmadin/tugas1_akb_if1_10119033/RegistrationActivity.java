package com.dandiahmadin.tugas1_akb_if1_10119033;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
 * Tanggal   : 22 April 2022
 * NIM       : 10119033
 * Nama      : Dandi Ahmadin
 * Kelas     : IF-1
 * */

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void changeActivityToLogin(View view) {
        Intent login = new Intent(RegistrationActivity.this, LoginActivity.class);
        startActivity(login);
    }
}