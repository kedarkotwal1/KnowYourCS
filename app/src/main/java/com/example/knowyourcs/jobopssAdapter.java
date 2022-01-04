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

public class jobopssAdapter extends PagerAdapter{

        Context context;
        LayoutInflater layoutInflater;

        public jobopssAdapter(Context context)
        {
            this.context=context;

        }
        //Array
        public int[] slideImages={
                R.drawable.appanalyst,
                R.drawable.database,
                R.drawable.game_dev,
                R.drawable.systemmanager,
                R.drawable.systemanalyst,
                R.drawable.webdesigner
        };

        public String[] slideHeadings=
                {
                        "Application Analyst",
                        "Database Administrator",
                        "Games Developer",
                        "Information Systems Manager",
                        "Systems Analyst",
                        "Web Designer"
                };

        public String[] slideDesc={
                "Application analysts are responsible for the administration, monitoring, and maintenance of software infrastructures and applications. \n"+"As an application analyst, you will oversee practices and processes to ensure integrity, safety, and availability of all data and applications as part of organisations information systems.\n"+"You’ll make sure that the processes needed for a business to function and succeed are running smoothly. You’ll act as a technical point of contact to fix application and systems issues, usually on an immediate basis.\n"+"Application analysts work within IT departments alongside application developers and software engineers.\n",
                "If you’re looking for a role that combines your love of IT and new technology, with your problem-solving and communication skills then look no further.\n"+"A database administrator (DBA) is responsible for the performance, integrity, and security of a database.\n"+"They will also be involved in the planning and development of the database, as well as troubleshooting any issues on behalf of the users.\n",
                "Working in games development you’ll be involved in the creation and production of games for personal computers, games consoles, social/online games, arcade games, tablets, mobile phones and other hand-held devices.\n"+"Your work will usually be concerned with either design (including art and animation) or programming. The making of a game from concept to finished product can take years and involve teams of professionals.\n"+"There are several stages, including creating and designing a game’s look and how it plays, animating characters and objects, creating audio, programming, localisation, testing and producing.\n",
                "If you love networking and are attracted to a problem-solving, fast-paced, IT role, you’d be a great information systems manager.\n"+"An information systems manager is responsible for the computer systems within a company.\n"+"You’ll need experience in the sector, in areas such as technical support or operations, before becoming a manager.\n",
                "As a systems analyst, you will use computers and related systems to design new IT solutions, modify, enhance or adapt existing systems and integrate new features or improvements, all with the aim of improving business efficiency and productivity.\n"+"You must have a high level of technical expertise and clear insights into current business practices.\n"+"Depending on the employer, clients may be internal, e.g. departments within the same organisation, or external.\n",
                "A web developer’s primary task is creating reliable and high performing applications and services, which can be accessed over the internet.\n"+"Web developers build and maintain websites and web applications.\n"+"Although their work usually focuses solely on the underlying software and databases (known as the ‘back end’), some web developers work on the interface and visual design (the ‘front end’), while others combine both (‘full-stack development’).\n"

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


