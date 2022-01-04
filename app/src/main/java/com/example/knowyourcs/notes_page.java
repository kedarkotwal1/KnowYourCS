package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class notes_page extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_page2);

        b1=(Button)findViewById(R.id.fybtn);
        b2=(Button)findViewById(R.id.sybtn);
        b3=(Button)findViewById(R.id.tybtn);

        tv1=(TextView)findViewById(R.id.titletv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(notes_page.this,fynotes.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(notes_page.this,synotes.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(notes_page.this,tynotes.class);
                startActivity(intent);
            }
        });


    }
}
