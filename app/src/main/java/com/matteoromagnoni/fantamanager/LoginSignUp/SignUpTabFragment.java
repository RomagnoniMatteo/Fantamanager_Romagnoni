package com.matteoromagnoni.fantamanager.LoginSignUp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.matteoromagnoni.fantamanager.R;

public class SignUpTabFragment extends Fragment {


    public SignUpTabFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.signup_tab_fragment, container, false);

    }
}
