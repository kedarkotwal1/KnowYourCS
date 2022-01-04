package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class synotes extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synotes);

        b1=(Button)findViewById(R.id.sem3sub1);
        b2=(Button)findViewById(R.id.sem3sub2);
        b3=(Button)findViewById(R.id.sem3sub3);
        b4=(Button)findViewById(R.id.sem3sub4);
        b5=(Button)findViewById(R.id.sem3sub5);
        b6=(Button)findViewById(R.id.sem3sub6);
        b7=(Button)findViewById(R.id.sem3sub7);
        b8=(Button)findViewById(R.id.sem4sub1);
        b9=(Button)findViewById(R.id.sem4sub2);
        b10=(Button)findViewById(R.id.sem4sub3);
        b11=(Button)findViewById(R.id.sem4sub4);
        b12=(Button)findViewById(R.id.sem4sub5);
        b13=(Button)findViewById(R.id.sem4sub6);
        b14=(Button)findViewById(R.id.sem4sub7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=11_y4-3ZrPtTy_5-O1ggGCbg6ORXQ2E3k"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1RqfcwM24ytJluO-zDxhbgdCPOHlRGsKE"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1Km3cIBhjJBkwPwDKVP_9-dZsIkWrJof1"));
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1h1faY3Ndm-emeWvzhYlhC4shy9bCixo_"));
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1R4dJ3tjOmVMBPjkQtGp_AbslexHLm-NS"));
                startActivity(intent);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1NU6p3BLozklhgGel-M6bM9uYVxKD7Kvb"));
                startActivity(intent);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1ASHhRbFnXoFIPVxUEhJviSUinkmAaSZ_"));
                startActivity(intent);
            }
        });

        //SEMESTER IV

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1nnFHkXuDxyvGP2sT_IG8FE4VMe_LT1GV"));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1jFgwHPB0rGlS8_nyrGa8n2zreqg7dg5D"));
                startActivity(intent);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=16H34Wpib6P5uiupO5P2TJ42EynxUgUe_"));
                startActivity(intent);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1X1xH9qYvjhkJzFRwvuBSSsZbkuwK7luS"));
                startActivity(intent);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1uL37v-Aa_ScfWjiJKR-_YQb00eMMkmhT"));
                startActivity(intent);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1eQr1saWUUCb1shh9tBBLmK01Z7B6bSRH"));
                startActivity(intent);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1DQ6SErM-DHKTgyU1sbp5GBZaRRxydSuv"));
                startActivity(intent);
            }
        });
    }
}

