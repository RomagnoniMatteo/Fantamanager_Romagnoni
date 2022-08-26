package com.matteoromagnoni.fantamanager.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.matteoromagnoni.fantamanager.InsideSettings.RegolamentoLegaFragment;
import com.matteoromagnoni.fantamanager.InsideSettings.SvincolatiFragment;
import com.matteoromagnoni.fantamanager.InsideSettings.SvincolatiU21Fragment;
import com.matteoromagnoni.fantamanager.InsideSettings.admin.ApriCalciomercatoFragment;
import com.matteoromagnoni.fantamanager.InsideSettings.admin.AssegnaGiocatoriFragment;
import com.matteoromagnoni.fantamanager.InsideSettings.admin.CreaCompetizione.CreaCompetizioneFragment;
import com.matteoromagnoni.fantamanager.InsideSettings.admin.FaiAltroAdminFragment;
import com.matteoromagnoni.fantamanager.R;

public class Impostazioni extends AppCompatActivity {

    ImageButton svinc, svincu21, regola, apricalcio, assegnagioc, newadmin, creacomp, assisten, chisiamo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impostazioni);

        svinc = findViewById(R.id.svincolatibut);
        svincu21 = findViewById(R.id.svincolatiu21but);
        regola = findViewById(R.id.regolamentobut);
        apricalcio = findViewById(R.id.apricalciomercatobut);
        assegnagioc = findViewById(R.id.assegnagiocatoribut);
        newadmin = findViewById(R.id.newadminbut);
        creacomp = findViewById(R.id.creacompetizionebut);
        assisten = findViewById(R.id.assistenzabut);
        chisiamo = findViewById(R.id.chisiamobut);

        svinc.setOnClickListener(view -> {
            Intent intent = new Intent(Impostazioni.this, SvincolatiFragment.class);
            startActivity(intent);
        });

        svincu21.setOnClickListener(view -> {
            Intent intent = new Intent(Impostazioni.this, SvincolatiU21Fragment.class);
            startActivity(intent);
        });

        regola.setOnClickListener(view -> {
            Intent intent = new Intent(Impostazioni.this, RegolamentoLegaFragment.class);
            startActivity(intent);
        });

        apricalcio.setOnClickListener(view -> {
            Intent intent = new Intent(Impostazioni.this, ApriCalciomercatoFragment.class);
            startActivity(intent);
        });

        assegnagioc.setOnClickListener(view -> {
            Intent intent = new Intent(Impostazioni.this, AssegnaGiocatoriFragment.class);
            startActivity(intent);
        });

        newadmin.setOnClickListener(view -> {
            Intent intent = new Intent(Impostazioni.this, FaiAltroAdminFragment.class);
            startActivity(intent);
        });

        creacomp.setOnClickListener(view -> {
            Intent intent = new Intent(Impostazioni.this, CreaCompetizioneFragment.class);
            startActivity(intent);
        });





        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.toSettings);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.toHome:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.toCalendar:
                        startActivity(new Intent(getApplicationContext(), Calendario.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.toTransfer:
                        startActivity(new Intent(getApplicationContext(), Calciomercato.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.toClass:
                        startActivity(new Intent(getApplicationContext(), Classifica.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.toSettings:
                        return true;
                }
                return false;
            }
        });
    }
}