package com.example.knowyourcs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class infocssliderAdapter extends PagerAdapter
{
    Context context;
    LayoutInflater layoutInflater;

    public infocssliderAdapter(Context context)
    {
        this.context=context;

    }
    //Array
    public int[] slideImages={
            R.drawable.ic_responsive,
            R.drawable.science,
            R.drawable.computerscience
    };

    public String[] slideHeadings=
            {
              "What is Computer?",
              "What is Science?",
              "What is Computer Science?"
            };

    public String[] slideDesc={
        "An electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program.\n" +
                "a person who makes calculations, especially with a calculating machine.\n",
        "The intellectual and practical activity encompassing the systematic study of the structure and behaviour of the physical and natural world through observation and experiment.\n",
        "Computer science is the study of computers and computing concepts. It includes both hardware and software, as well as networking and the Internet. \n"+"The hardware aspect of computer science overlaps with electrical engineering. It covers the basic design of computers and the way they work.\n"
    };
    @Override
    public int getCount()
    {
        return slideHeadings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(ConstraintLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slider_layout,container,false);

        ImageView  slideImageView=(ImageView)view.findViewById(R.id.icongoeshere);
        TextView slideHeading=(TextView)view.findViewById(R.id.titlegoeshere);
        TextView slideDescription=(TextView)view.findViewById(R.id.descgoeshere);

        slideImageView.setImageResource(slideImages[position]);
        slideHeading.setText(slideHeadings[position]);
        slideDescription.setText(slideDesc[position]);

        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }


}
