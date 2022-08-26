package com.matteoromagnoni.fantamanager.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.matteoromagnoni.fantamanager.MatchCorrente.MatchAdapter;
import com.matteoromagnoni.fantamanager.R;

public class MatchInCorso extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchcorrente);


        //tabview
        tabLayout = findViewById(R.id.tab_layoutmatch);
        viewPager = findViewById(R.id.view_pagermatch);

        final MatchAdapter madapter = new MatchAdapter(getSupportFragmentManager(), this, tabLayout.getTabCount());
        viewPager.setAdapter(madapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

}
