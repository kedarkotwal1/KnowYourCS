package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notesPaperSelection extends AppCompatActivity {

    Button notesbtn,qpaperbtn,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_paper_selection);

        notesbtn=(Button)findViewById(R.id.notesbtn);
        qpaperbtn=(Button)findViewById(R.id.qpaperbtn);

        notesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(notesPaperSelection.this,notes_page.class);
                startActivity(intent);
            }
        });

        qpaperbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(notesPaperSelection.this,qpaperyearselection.class);
                startActivity(intent);
            }
        });


    }
}
