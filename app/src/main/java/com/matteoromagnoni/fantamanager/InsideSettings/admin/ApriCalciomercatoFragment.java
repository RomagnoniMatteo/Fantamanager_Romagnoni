package com.matteoromagnoni.fantamanager.InsideSettings.admin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import com.matteoromagnoni.fantamanager.R;
import com.matteoromagnoni.fantamanager.mercatoanimation.Chiusuramercato;
import com.matteoromagnoni.fantamanager.mercatoanimation.aperturamercato;


public class ApriCalciomercatoFragment extends Activity {

    Button open, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apricalciomercato_fragment);

        open = findViewById(R.id.opentransfer);
        close = findViewById(R.id.closetransfer);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), aperturamercato.class);
                startActivity(intent);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Chiusuramercato.class);
                startActivity(intent);
            }
        });
    }
}
