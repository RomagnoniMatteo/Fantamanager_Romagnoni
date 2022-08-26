package com.matteoromagnoni.fantamanager.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.matteoromagnoni.fantamanager.ModelDataRecycler.VivaioAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.VivaioItem;
import com.matteoromagnoni.fantamanager.R;

public class Vivaio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivaio);

        //display vivaio players
        VivaioItem[] myListData = new VivaioItem[] {
                new VivaioItem("C", "Baldanzi", 2003),
                new VivaioItem("C", "Miretti", 2003),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvvivaio);
        VivaioAdapter adapter = new VivaioAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }

}