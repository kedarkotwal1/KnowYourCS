package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syllabusyearselectpage extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabusyearselectpage);

        b1=(Button)findViewById(R.id.firstyearbtn);
        b2=(Button)findViewById(R.id.secondyearbtn);
        b3=(Button)findViewById(R.id.thirdyearbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1BRdJwjWak67PEgG8Q4CWgYH9G5tB_inE"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1u8PP1XpI7jHCWogpxQAVjOU_vMZFObSr"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1LLHnW7ibY7R1e0pBUACzmOwfJcPFNiU8"));
                startActivity(intent);
            }
        });
    }
}
