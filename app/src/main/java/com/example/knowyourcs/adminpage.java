package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;

public class adminpage extends AppCompatActivity {

    Button b1,b2,b3;
    private ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);

        progress=new ProgressDialog(this);

        b1=(Button)findViewById(R.id.notesuploadbtn);
        b2=(Button)findViewById(R.id.qpaperuploadbtn);
        b3=(Button)findViewById(R.id.syllabusuploadbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress.setMessage("processing...");
                progress.show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Xe31xKH-Wm5OhNv98E706YZU5NBySO5o"));
                startActivity(intent);
                progress.dismiss();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress.setMessage("processing...");
                progress.show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=13qGS92HZYWBrhww38WnjzzHhDdaGQcTA"));
                startActivity(intent);
                progress.dismiss();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress.setMessage("processing...");
                progress.show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1YtvWuunBaWA-599H02iyU6ACyGMtazKZ"));
                startActivity(intent);
                progress.dismiss();
            }
        });
    }
}
