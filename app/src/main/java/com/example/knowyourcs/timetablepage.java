package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class timetablepage extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetablepage);

        b1=(Button)findViewById(R.id.firstyeartt);
        b2=(Button)findViewById(R.id.secondyeartt);
        b3=(Button)findViewById(R.id.thirdyeartt);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=11XQ-SZJ84Xo6VxzIUKZRFkjNd5FK2SAX"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1BWrpgrB_9anMh0OpvNiWDTmP20ZMWyGy"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=12j38iGGYZkPPAOl6Xqpcxt_eeDnThUEP"));
                startActivity(intent);
            }
        });
    }
}
