package com.matteoromagnoni.fantamanager.InsideSettings.admin.CreaCompetizione;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.matteoromagnoni.fantamanager.R;

public class CreaCompetizione  extends Fragment {


    public CreaCompetizione(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.crea_competizione, container, false);

    }
}
