package com.example.knowyourcs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class essentiallangAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

        public essentiallangAdapter(Context context)
        {
            this.context=context;

        }
        //Array
        public int[] slideImages={
                R.drawable.java,
                R.drawable.pythonlanguage,
                R.drawable.cplusplus,
                R.drawable.csharp,
                R.drawable.html5
        };

        public String[] slideHeadings=
                {
                        "JAVA",
                        "PYTHON",
                        "C/C++",
                        "C#",
                        "HTML5"
                };

        public String[] slideDesc={
            //JAVA
                "Java is a popular general-purpose programming language and computing platform. It is fast, reliable, and secure. According to Oracle, the company that owns Java, Java runs on 3 billion devices worldwide.\n" +
                        "Considering the number of Java developers, devices running Java, and companies adapting it, it's safe to say that Java will be around for many years to come.\n" +
                        "This guide will provide everything you need to know about Java programming language before you learn it. More specifically, you will learn about features of Java programming, its applications, reasons to learn it, and how you can learn it the right way.\n" +
                        "Java is a widely used programming language expressly designed for use in the distributed environment of the internet. It is the most popular programming language for Android smartphone applications and is also among the most favored for the development of edge devices and the internet of things.\n",

            //PYTHON
                "Python is a widely used general-purpose, high level programming language. It was initially designed by Guido van Rossum in 1991 and developed by Python Software Foundation. It was mainly developed for emphasis on code readability, and its syntax allows programmers to express concepts in fewer lines of code.\n" +
                        "Python is a programming language that lets you work quickly and integrate systems more efficiently.\n" +
                        "There are two major Python versions- Python 2 and Python 3. Both are quite different.\n"+"Before we start Python programming, we need to have an interpreter to interpret and run our programs. There are certain online interpreters like https://ide.geeksforgeeks.org/\n",

            //C++
                "C is a procedural programming language. It was initially developed by Dennis Ritchie between 1969 and 1973. It was mainly developed as a system programming language to write an operating system. The main features of C language include low-level access to memory, \n" +
                        "a simple set of keywords, and clean style, these features make C language suitable for system programmings like an operating system or compiler development.\n" +
                        "Many later languages have borrowed syntax/features directly or indirectly from C language. \n" +
                        "Like syntax of Java, PHP, JavaScript and many other languages are mainly based on C language. C++ is nearly a superset of C language (There are few programs that may compile in C, but not in C++). \n",

            //C#
                "C# is a general-purpose, modern and object-oriented programming language pronounced as “C sharp”. \n" +
                        "It was developed by Microsoft led by Anders Hejlsberg and his team within the .Net initiative and was approved by European Computer Manufacturers Association (ECMA) and International Standards Organization (ISO).\n" +
                        " C# is among the languages for Common Language Infrastructure and the current version of C# is version 7.2. C# is a lot similar to Java syntactically and is easy for the users who have knowledge of C, C++ or Java.\n",


            //HTML5
                "HTML, as a markup language doesn't really “do” anything in the sense that a programming language does. HTML contains no programming logic. It doesn't have common conditional statements such as If/Else. ... This is because HTML is not a programming language.\n" +
                        "Hypertext Markup Language (HTML) is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript. \n" +
                        "Web browsers receive HTML documents from a web server or from local storage and render the documents into multimedia web pages. HTML describes the structure of a web page semantically and originally included cues for the appearance of the document. \n"
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

            ImageView slideImageView=(ImageView)view.findViewById(R.id.icongoeshere);
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



