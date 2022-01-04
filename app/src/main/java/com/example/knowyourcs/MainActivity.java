package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1=(CardView)findViewById(R.id.notesbtn);
        bt2=(CardView) findViewById(R.id.syllabusbtn);
        bt3=(CardView)findViewById(R.id.infocsbtn);
        bt4=(CardView)findViewById(R.id.jobbtn);
        bt5=(CardView)findViewById(R.id.timetablebtn);
        bt6=(CardView)findViewById(R.id.languagebtn);
        bt7=(CardView)findViewById(R.id.softwarebtn);
        bt8=(CardView)findViewById(R.id.convobtn);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,notesPaperSelection.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "NOTES SECTION", Toast.LENGTH_SHORT).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,syllabusyearselectpage.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "SYLLABUS SECTION", Toast.LENGTH_SHORT).show();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,infoaboutcspage.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "INFO CS SECTION", Toast.LENGTH_SHORT).show();
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,jobopps.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "JOB OPP. SECTION", Toast.LENGTH_SHORT).show();
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,timetablepage.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "TIME TABLE SECTION", Toast.LENGTH_SHORT).show();
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,essentiallangs.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "ESSENTIAL LANG SECTION", Toast.LENGTH_SHORT).show();
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,softreq.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "REQ. SOFTWARE SECTION", Toast.LENGTH_SHORT).show();
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,numcon.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "NUMERIC CONVERTOR", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem)
        {
            int id=menuItem.getItemId();
            if(id==R.id.login)
            {
                Intent intent=new Intent(MainActivity.this,adminlogin.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Choose Your Selection", Toast.LENGTH_SHORT).show();
            }

            return true;
        }


}
