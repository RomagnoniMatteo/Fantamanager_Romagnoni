package com.matteoromagnoni.fantamanager.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.matteoromagnoni.fantamanager.ModelDataRecycler.GiocatoreScambio;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.GiocatoreScambioAdapter;
import com.matteoromagnoni.fantamanager.R;

public class Scambi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scambi);

        //display scambi utente

        GiocatoreScambio[] myListData = new GiocatoreScambio[] {
                new GiocatoreScambio("Pellegrini", "33m", "C", R.drawable.arsenal, 2022),
                new GiocatoreScambio("Ansaldi", "3m", "D", R.drawable.arsenal, 2023),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.giocatoriutente);
        GiocatoreScambioAdapter adapter = new GiocatoreScambioAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        //display scambi avversaio

        GiocatoreScambio[] hisListData = new GiocatoreScambio[] {
                new GiocatoreScambio("Zaniolo", "33m", "C", R.drawable.blucarina, 2022),
                new GiocatoreScambio("Gyomber", "3m", "D", R.drawable.blucarina, 2023),

        };

        RecyclerView recView = (RecyclerView) findViewById(R.id.giocatoriavv);
        GiocatoreScambioAdapter adapt = new GiocatoreScambioAdapter(hisListData);
        recView.setHasFixedSize(true);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(adapt);

    }
}