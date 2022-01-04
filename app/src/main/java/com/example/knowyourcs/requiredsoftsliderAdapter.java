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

public class requiredsoftsliderAdapter extends PagerAdapter
{
        Context context;
        LayoutInflater layoutInflater;

        public requiredsoftsliderAdapter(Context context)
        {
            this.context=context;

        }
        //Array
        public int[] slideImages={
                R.drawable.ic_visual_studio,
                R.drawable.ic_apache_netbeans,
                R.drawable.ic_android,
                R.drawable.ic_python

        };

        public String[] slideHeadings=
                {
                        "Visual Studio",
                        "Netbeans",
                        "Android Studio",
                        "IDLE for Python"
                };
        @NonNull
        public String[] slideDesc={
                //VISUAL STUDIO DESC
                "Microsoft Visual Studio is an integrated development environment (IDE) from Microsoft. It is used to develop computer programs, as well as websites, web apps, web services and mobile apps.\n"+"Visual Studio uses Microsoft software development platforms such as Windows API, Windows Forms, Windows Presentation Foundation, Windows Store and Microsoft Silverlight.\n"+"It can produce both native code and managed code. Visual Studio includes a code editor supporting IntelliSense (the code completion component) as well as code refactoring. The integrated debugger works both as a source-level debugger and a machine-level debugger. Other built-in tools include a code profiler, forms designer for building GUI applications, web designer, class designer, and database schema designer.\n"+"It accepts plug-ins that enhance the functionality at almost every level—including adding support for source control systems (like Subversion and Git) and adding new toolsets like editors and visual designers for domain-specific languages or toolsets for other aspects of the software development lifecycle (like the Team Foundation Server client: Team Explorer). Visual Studio supports 36 different programming languages and allows the code editor and debugger to support (to varying degrees) nearly any programming language, provided a language-specific service exists. Built-in languages include C, C++, C++/CLI, Visual Basic .NET, C#, F#, JavaScript, TypeScript, XML, XSLT, HTML, and CSS.\n"+"Support for other languages such as Python,Ruby, Node.js, and M among others is available via plug-ins. Java (and J#) were supported in the past. The most basic edition of Visual Studio, the Community edition, is available free of charge.\n"+"The slogan for Visual Studio Community edition is Free, fully-featured IDE for students, open-source and individual developers",
                //NETBEANS DESC
                "The NetBeans Platform is a framework for simplifying the development of Java Swing desktop applications. The NetBeans IDE bundle for Java SE contains what is needed to start developing NetBeans plugins and NetBeans Platform based applications; no additional SDK is required.\n"+
                        "Applications can install modules dynamically. Any application can include the Update Center module to allow users of the application to download digitally signed upgrades and new features directly into the running application. Reinstalling an upgrade or a new release does not force users to download the entire application again.\n"+
                        "The platform offers reusable services common to desktop applications, allowing developers to focus on the logic specific to their application. Among the features of the platform are:\n"+
                            "User interface management (e.g. menus and toolbars)."+
                            "User settings management\n"+
                            "Storage management (carries out efficient storage."+
                            "Window management\n"+
                            "Wizard framework (supports step-by-step dialogs)"+
                            "NetBeans Visual Library\n"+
                            "Integrated development tools\n",
                //ANDROID DESC
                "Android Studio is the official[7] integrated development environment (IDE) for Google\'s Android operating system, built on JetBrains\' IntelliJ IDEA software and designed specifically for Android development.[8] It is available for download on Windows, macOS and Linux based operating systems.[9][10] It is a replacement for the Eclipse Android Development Tools (ADT) as the primary IDE for native Android application development.\n"+
                        "Android Studio was announced on May 16, 2013 at the Google I/O conference. It was in early access preview stage starting from version 0.1 in May 2013, then entered beta stage starting from version 0.8 which was released in June 2014.[11] The first stable build was released in December 2014, starting from version 1.0.[12]\n"+
                        "Since 7 May 2019, Kotlin is Google’s preferred language for Android app development.[13] Still, other languages are supported, including by Android Studio.\n",

                //IDLE
                "IDLE (short for integrated development environment[1][2] or integrated development and learning environment[3]) is an integrated development environment for Python, which has been bundled with the default implementation of the language since 1.5.2b1.[4][5] It is packaged as an optional part of the Python packaging with many Linux distributions. It is completely written in Python and the Tkinter GUI toolkit (wrapper functions for Tcl/Tk).\n"+
                        "IDLE is intended to be a simple IDE and suitable for beginners, especially in an educational environment. To that end, it is cross-platform, and avoids feature clutter.\n"

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


