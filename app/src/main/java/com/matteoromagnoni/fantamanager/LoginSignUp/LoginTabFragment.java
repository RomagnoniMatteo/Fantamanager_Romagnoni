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

public class LoginTabFragment extends Fragment {

    EditText user, pass;
    TextView dimpass;
    Button login;
    float v=0;

    public LoginTabFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        user = root.findViewById(R.id.username);
        pass = root.findViewById(R.id.pass);
        dimpass = root.findViewById(R.id.passdiment);
        login = root.findViewById(R.id.loginButton);



        user.setTranslationY(800);
        pass.setTranslationY(800);
        dimpass.setTranslationY(800);
        login.setTranslationY(800);


        user.setAlpha(v);
        pass.setAlpha(v);
        dimpass.setAlpha(v);
        login.setAlpha(v);

        user.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        dimpass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return  root;
    }
}
