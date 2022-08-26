package com.matteoromagnoni.fantamanager.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.matteoromagnoni.fantamanager.ModelDataRecycler.FinanzeAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.FinanzeItem;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.GiocatoreScambio;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.GiocatoreScambioAdapter;
import com.matteoromagnoni.fantamanager.R;

public class Finanze extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finanze);

        //display finanze

        FinanzeItem[] myListData = new FinanzeItem[] {
                new FinanzeItem("P", "Musso", "35m",  2022),
                new FinanzeItem("P", "Szscezsny", "50m",  2022),
                new FinanzeItem("P", "Perin", "5m",  2022),
                new FinanzeItem("D", "Bremer", "55m",  2022),
                new FinanzeItem("D", "Ansaldi", "5m",  2022),
                new FinanzeItem("D", "Bonucci", "35m",  2022),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.finanzerv);
        FinanzeAdapter adapter = new FinanzeAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}