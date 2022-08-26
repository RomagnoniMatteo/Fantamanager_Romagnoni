package com.matteoromagnoni.fantamanager.MatchCorrente;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class MatchAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;


    public MatchAdapter (FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }


    @NonNull
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MatchFragment();
            case 1:
                return new VotiLiveFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
