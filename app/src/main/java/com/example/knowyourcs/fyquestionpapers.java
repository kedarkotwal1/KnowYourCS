package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fyquestionpapers extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyquestionpapers);

        b1=(Button)findViewById(R.id.sem1sub1);
        b2=(Button)findViewById(R.id.sem1sub2);
        b3=(Button)findViewById(R.id.sem1sub3);
        b4=(Button)findViewById(R.id.sem1sub4);
        b5=(Button)findViewById(R.id.sem1sub5);
        b6=(Button)findViewById(R.id.sem1sub6);
        b7=(Button)findViewById(R.id.sem1sub7);
        b8=(Button)findViewById(R.id.sem2sub1);
        b9=(Button)findViewById(R.id.sem2sub2);
        b10=(Button)findViewById(R.id.sem2sub3);
        b11=(Button)findViewById(R.id.sem2sub4);
        b12=(Button)findViewById(R.id.sem2sub5);
        b13=(Button)findViewById(R.id.sem2sub6);
        b14=(Button)findViewById(R.id.sem2sub7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1E1B8_ypqAZsIQ-_cV2pDAX4h-VRgmwR6"));
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1g6J0dGcjWWcMFZqtWy7nz5BJLjsMxILa"));
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1B4QwPpKV7WdJNnC604YRt07e-Rlh-MVe"));
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=13lLM1mQfC64szc_8MG2Gh5gX3lhfJcxB"));
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1YmyqICf-FAXxodE-JjK29xRoMR4IOAS0"));
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=16k2SIhZHGlpt_dkx1u-Hp0mEKdZz5S7p"));
                startActivity(i);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=16k2SIhZHGlpt_dkx1u-Hp0mEKdZz5S7p"));
                startActivity(i);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1VQsssCWVm9DNR8KJnR4LvArBTstD7LmV"));
                startActivity(i);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1yxnBYGXRPpj6n6KGpqRBC_CO1K4eIf0Y"));
                startActivity(i);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Qnqsk1gSiGz3bFn_WP9zVCvbKdmQnukX"));
                startActivity(i);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1HmHOrKV9agunDVpuM-ADT6M487BOHd-U"));
                startActivity(i);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1PcG9V0eJE8-Bg9i12N6dciIO8qrQYNJY"));
                startActivity(i);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1SgoJ3TNHeKeJ15BIY1DlI7xJVoHGlHBv"));
                startActivity(i);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ohFk9EDHJDDNkhdwqT4njXM7sC3biHT7"));
                startActivity(i);
            }
        });


    }
}
