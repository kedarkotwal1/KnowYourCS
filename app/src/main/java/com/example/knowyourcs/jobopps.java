package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class jobopps extends AppCompatActivity {
    private ViewPager sliderviewpager;
    private jobopssAdapter jobadapter;
    private LinearLayout mdotslayout;
    private TextView[] dots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobopps);

        mdotslayout=(LinearLayout)findViewById(R.id.jobdotslayout);
        sliderviewpager=(ViewPager)findViewById(R.id.viewPager);

        jobadapter =new jobopssAdapter(this);
        sliderviewpager.setAdapter(jobadapter);

        sliderviewpager.addOnPageChangeListener(viewlistener);
        addDotsIndicator(0);

    }

    public void addDotsIndicator(int position)
    {
        dots=new TextView[6];
       mdotslayout.removeAllViews();
        for(int i=0;i<dots.length;i++)
        {
            dots[i]=new TextView(this);

            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextColor(getResources().getColor(R.color.colorTransparantWhite));
            dots[i].setTextSize(40);

            mdotslayout.addView(dots[i]);

        }

        if(dots.length>0)
        {
            dots[position].setTextColor(getResources().getColor(R.color.colorWhite));

        }
    }
    ViewPager.OnPageChangeListener viewlistener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
