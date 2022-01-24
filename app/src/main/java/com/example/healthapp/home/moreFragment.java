package com.example.healthapp.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.healthapp.R;
import com.example.healthapp.more.Calendar_page;
import com.example.healthapp.more.Reminders_page;
import com.example.healthapp.more.human_body;


public class moreFragment extends Fragment {

TextView Reminders,Calendar,Calculate,body_pro,feedback,setting,chart;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_more, container, false);
        context = view.getContext();






        Reminders = view.findViewById(R.id.Reminders);
        Reminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), Reminders_page.class);
                startActivity(intent);
            }
        });
        Calendar = view.findViewById(R.id.Calendar);
        Calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), Calendar_page.class);
                startActivity(intent);
            }
        });



        body_pro = view.findViewById(R.id.body_pro);
        body_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), human_body.class);
                startActivity(intent);
            }
        });








        return view;
    }


    private void Click(View view) {



    }


}