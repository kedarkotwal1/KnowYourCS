package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

public class infoaboutcspage extends AppCompatActivity {
    private ViewPager sliderviewpager;
    private LinearLayout mdotslayout;
    private TextView[] dots;
    private infocssliderAdapter infocssliderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoaboutcspage);

        mdotslayout=(LinearLayout)findViewById(R.id.dotslayout);
        sliderviewpager=(ViewPager)findViewById(R.id.viewPager);


        infocssliderAdapter =new infocssliderAdapter(this);
        sliderviewpager.setAdapter(infocssliderAdapter);

        sliderviewpager.addOnPageChangeListener(viewlistener);

        addDotsIndicator(0);
    }

    public void addDotsIndicator(int position)
    {
        dots=new TextView[3];
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
