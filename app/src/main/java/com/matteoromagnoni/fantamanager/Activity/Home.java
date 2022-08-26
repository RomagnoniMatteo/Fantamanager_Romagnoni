package com.matteoromagnoni.fantamanager.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.matteoromagnoni.fantamanager.R;
import com.matteoromagnoni.fantamanager.formazione.Formazione;

public class Home extends AppCompatActivity {

    private Button finanze, club, preview, formazione;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        finanze = findViewById(R.id.finanzebutton);
        club = findViewById(R.id.clubbutton);
        preview = findViewById(R.id.previewmatchbut);
        formazione = findViewById(R.id.formazioneButton);

        finanze.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this, Finanze.class);
            startActivity(intent);
        });

        formazione.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this, Formazione.class);
            startActivity(intent);
        });


        club.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this, Club.class);
            startActivity(intent);
        });



        preview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home.this, MatchInCorso.class);
                startActivity(intent);
            }
        });





        // bottom menu
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.toHome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.toHome:
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
                        startActivity(new Intent(getApplicationContext(), Impostazioni.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });


    }





}






