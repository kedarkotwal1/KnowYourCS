package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;

public class softreq extends AppCompatActivity {
    public ViewPager viewPager;
    private requiredsoftsliderAdapter requiredsoftsliderAdapter;
    Button linkingbtn;
    private int currentpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_softreq);



       viewPager=(ViewPager)findViewById(R.id.viewPager);


       requiredsoftsliderAdapter=new requiredsoftsliderAdapter(this);
       viewPager.setAdapter(requiredsoftsliderAdapter);
    }

    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
