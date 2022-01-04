package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class essentiallangs extends AppCompatActivity {
    private ViewPager sliderviewpager;
    private essentiallangAdapter essentialAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essentiallangs);

        sliderviewpager=(ViewPager)findViewById(R.id.viewPager);
        essentialAdapter=new essentiallangAdapter(this);

        sliderviewpager.setAdapter(essentialAdapter);
    }
}
