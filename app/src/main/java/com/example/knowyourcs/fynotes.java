package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fynotes extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fynotes);

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
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1vnH7a84ydBBfVcRgGydXMkGeI1xQIzsW"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1E3j3cnyK216rTxgtJpw7phhpuWbS4Lwc"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1_SVDsNJAyatgsY7sHvawdIR3p2LCUrbY"));
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1HXnl8jg3vi0B3fr450DEdytplLF3hXut"));
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1fK3ftiwCiG1bVzJJfiHCb9A8vSR6jECN"));
                startActivity(intent);
            }
        });
//DSIP MISSING
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                startActivity(intent);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1SvZ94W-dI1vxevUVkqedQ59dQFdhBzRD"));
                startActivity(intent);
            }
        });

        //SEMESTER II
//C PROGRAMMING MISSING
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1zH9eX-0k6kWv1xDs4gFgqDa_ydbS2lT7"));
                startActivity(intent);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1gG3KkTucJKdOStfxXRLdQizHI1PL6iKD"));
                startActivity(intent);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1vPbtmGUtDFCglAwMh2rFHBX-oMA8aqQA"));
                startActivity(intent);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1koeg3ysjwoFH2Kn6GAzSyA-h0JHSviMt"));
                startActivity(intent);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1MYceBKoia2nmiQkaVSwaICE0eHwLhUZq"));
                startActivity(intent);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1SzgEBkmrs9S0xPGPb-VDzngzsWA_J3En"));
                startActivity(intent);
            }
        });
    }
}
