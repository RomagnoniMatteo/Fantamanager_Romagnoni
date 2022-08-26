package com.matteoromagnoni.fantamanager.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.applandeo.materialcalendarview.EventDay;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.matteoromagnoni.fantamanager.R;

import java.util.ArrayList;
import java.util.List;


public class Calendario extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        List<EventDay> events = new ArrayList<>();



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.toCalendar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.toHome:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.toCalendar:
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