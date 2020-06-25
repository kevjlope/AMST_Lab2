package com.example.amst_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    com.github.clans.fab.FloatingActionButton btnVideo;
    com.github.clans.fab.FloatingActionButton btnMapa;
    com.github.clans.fab.FloatingActionButton btnRegrsion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVideo = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.btnVideo);
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),VideoActivity.class);
                startActivity(intent);
            }
        });


        btnMapa = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.btnMapa);
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MapActivity.class);
                startActivity(intent);
            }
        });

        btnRegrsion = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.btnRegresion);
        btnRegrsion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),GraficaActivity.class);
                startActivity(intent);
            }
        });



    }
}
