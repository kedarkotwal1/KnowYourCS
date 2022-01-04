package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class startupscreen extends AppCompatActivity {

    private static int SPLASH_TIMEOUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startupscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(startupscreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIMEOUT);
    }
}
