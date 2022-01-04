package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syquestionpapers extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syquestionpapers);

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
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1BGNZJd36ESO9Fwzm6LT2O8CCP4kVI-V-"));
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1TIO26JWtcEW4gQkDxk3vQUBNZgOXk4GQ"));
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=14UWpMVxynxMw0NXG8Lf4F-t4XM4wY3d7"));
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1qtbUTt0JmBF7uvJk7L-SJzHBVzZ0iCi3"));
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1xYyh0DVp4dpcabvs_vtQ8CrBN0wL8aiq"));
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1gouo7m-Ga_JoS_I-AnmWmca5AlSCA_qJ"));
                startActivity(i);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1wpjK3DgECzVu-zjmN1HlszQSzvjRa0-i"));
                startActivity(i);
            }
        });

        //WORK IS REMAINING FROM HERE

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
