package com.matteoromagnoni.fantamanager.InsideSettings.admin.CreaCompetizione;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CreaCompetizioneAdapter  extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;


    public CreaCompetizioneAdapter (FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }


    @NonNull
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CreaCompetizione();
            case 1:
                return new EliminaCompetizione();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}