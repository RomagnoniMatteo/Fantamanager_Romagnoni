package com.matteoromagnoni.fantamanager.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.ClassificaAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.ClassificaItem;
import com.matteoromagnoni.fantamanager.R;

public class Classifica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classifica);


        //displayclass

        ClassificaItem[] myListData = new ClassificaItem[] {
                new ClassificaItem(1, 33, 2, 2, 67,55,38, 89, "Astor Villa"),
                new ClassificaItem(2, 33, 2, 2, 67,55,38, 89, "Ac Peakkia"),
                new ClassificaItem(3, 33, 2, 2, 67,55,38, 89, "Penalteam"),
                new ClassificaItem(4, 33, 2, 2, 67,55,38, 89, "Glikbait"),
                new ClassificaItem(5, 33, 2, 2, 67,55,38, 89, "Troppo Cristante"),


        };


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvclassificaitem);
        ClassificaAdapter adapter = new ClassificaAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



        //bottom navugation

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.toClass);

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