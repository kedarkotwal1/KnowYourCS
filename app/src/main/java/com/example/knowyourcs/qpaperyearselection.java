package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qpaperyearselection extends AppCompatActivity {

    Button b1,b3,b4;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qpaperyearselection);

        b1=(Button)findViewById(R.id.fybtn);
        b2=(Button)findViewById(R.id.sy);
        b3=(Button)findViewById(R.id.tybtn);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(qpaperyearselection.this,fyquestionpapers.class);
                startActivity(i);
            }
        });

//b2 is no more defective b2 is no more defective b2 is no more defective b2 is no more defective
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(qpaperyearselection.this,syquestionpapers.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(qpaperyearselection.this,tyquestionpapers.class);
                startActivity(i);
            }
        });

    }
}
