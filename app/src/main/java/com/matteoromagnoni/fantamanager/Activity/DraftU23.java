package com.matteoromagnoni.fantamanager.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.matteoromagnoni.fantamanager.ModelDataRecycler.PickDraftAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.PickDraftItem;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.PickTurno;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.PickTurnoAdapter;
import com.matteoromagnoni.fantamanager.R;

public class DraftU23 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draft_u23);

        //prima recycleview

        PickTurno[] listpickturno = new PickTurno[] {
                new PickTurno(1,  R.drawable.blucarina),
                new PickTurno(2,  R.drawable.rosa),
                new PickTurno(3,  R.drawable.newcastle),
                new PickTurno(4,  R.drawable.crystalpalace),
                new PickTurno(5,  R.drawable.chelsea),
                new PickTurno(6,  R.drawable.bohemians),


        };

        RecyclerView recyView = (RecyclerView) findViewById(R.id.pickturnorec);
        PickTurnoAdapter adapt = new PickTurnoAdapter(listpickturno);
        recyView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = (new LinearLayoutManager(this,  LinearLayoutManager.HORIZONTAL, false));
        recyView.setLayoutManager(layoutManager);
        recyView.setAdapter(adapt);


        //seconda recycleview
        PickDraftItem[] myListData = new PickDraftItem[] {
                new PickDraftItem("Cancellieri", "A", 2002, R.drawable.blucarina, 1),
                new PickDraftItem("Flamingo", "D", 2002, R.drawable.rosa, 2),
                new PickDraftItem("Casadei", "C", 2002, R.drawable.newcastle, 3),
                new PickDraftItem("Nasti", "A", 2002, R.drawable.crystalpalace, 4),
                new PickDraftItem("Degli Innocenti", "C", 2002, R.drawable.chelsea, 5),
                new PickDraftItem("De Vries", "C", 2002, R.drawable.bohemians, 6),


        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.DraftRecycleNext);
        PickDraftAdapter adapter = new PickDraftAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }



}


