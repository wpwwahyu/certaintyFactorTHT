package com.example.certaintyfactorv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView diagnosa_cv = (CardView) findViewById(R.id.diagnosa);
        diagnosa_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainDiagnosa.class);
                startActivity(i);
            }
        });
        CardView daftar_cv = (CardView) findViewById(R.id.daftar);
        daftar_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainDaftar.class);
                startActivity(i);
            }
        });

        CardView gejala_cv = (CardView) findViewById(R.id.gejala);
        gejala_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainGejala.class);
                startActivity(i);
            }
        });
    }
}