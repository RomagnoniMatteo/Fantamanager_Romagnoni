package com.matteoromagnoni.fantamanager.MatchCorrente;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.ModelDataRecycler.BenchAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.BenchItem;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.FormazioneAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.FormazioneItem;
import com.matteoromagnoni.fantamanager.R;

public class MatchFragment  extends Fragment {

    public MatchFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.previewformazioni, container, false);

        //portiere casa
        FormazioneItem[] myaList = new FormazioneItem[] {
                new FormazioneItem(99, R.drawable.gialloviola_strana, "Musso"),

        };

        RecyclerView recyclr = (RecyclerView) view.findViewById(R.id.portierecasa);
        FormazioneAdapter apt = new FormazioneAdapter(myaList);
        recyclr.setHasFixedSize(true);
        LinearLayoutManager layoutManager = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        recyclr.setLayoutManager(layoutManager);
        recyclr.setAdapter(apt);



        //difensore casa
        FormazioneItem[] mydifcasa = new FormazioneItem[] {
                new FormazioneItem(3, R.drawable.blucarina, "Bremer"),
                new FormazioneItem(77, R.drawable.blucarina, "Zappacosta"),
                new FormazioneItem(25, R.drawable.blucarina, "Demiral"),
        };

        RecyclerView recdifcasa = (RecyclerView) view.findViewById(R.id.difensoricasa);
        FormazioneAdapter aptdifcasa = new FormazioneAdapter(mydifcasa);
        recdifcasa.setHasFixedSize(true);
        LinearLayoutManager layoutManagerdc = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        recdifcasa.setLayoutManager(layoutManagerdc);
        recdifcasa.setAdapter(aptdifcasa);


        //centrocampo casa
        FormazioneItem[] mycencasa = new FormazioneItem[] {
                new FormazioneItem(11, R.drawable.blucarina, "Saponara"),
                new FormazioneItem(10, R.drawable.blucarina, "Badelj"),
                new FormazioneItem(2, R.drawable.blucarina, "Torreira"),
                new FormazioneItem(8, R.drawable.blucarina, "Frattesi"),
        };

        RecyclerView reccencasa = (RecyclerView) view.findViewById(R.id.centrocasa);
        FormazioneAdapter aptcencasa = new FormazioneAdapter(mycencasa);
        reccencasa.setHasFixedSize(true);
        LinearLayoutManager layoutManagercc = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        reccencasa.setLayoutManager(layoutManagercc);
        reccencasa.setAdapter(aptcencasa);


        //attacco casa
        FormazioneItem[] myattcasa = new FormazioneItem[] {
                new FormazioneItem(9, R.drawable.blucarina, "Caputo"),
                new FormazioneItem(22, R.drawable.blucarina, "Cabral"),
                new FormazioneItem(25, R.drawable.blucarina, "Kean"),
        };

        RecyclerView recattcasa = (RecyclerView) view.findViewById(R.id.attcasa);
        FormazioneAdapter aptattcasa = new FormazioneAdapter(myattcasa);
        recattcasa.setHasFixedSize(true);
        LinearLayoutManager layoutManageratt = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        recattcasa.setLayoutManager(layoutManageratt);
        recattcasa.setAdapter(aptattcasa);



        //portiere ospite
        FormazioneItem[] myoList = new FormazioneItem[] {
                new FormazioneItem(99, R.drawable.rosa, "Montipò"),

        };

        RecyclerView recycl = (RecyclerView) view.findViewById(R.id.portiereosp);
        FormazioneAdapter ap = new FormazioneAdapter(myoList);
        recycl.setHasFixedSize(true);
        LinearLayoutManager layoutManage = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        recycl.setLayoutManager(layoutManage);
        recycl.setAdapter(ap);



        //difensore casa
        FormazioneItem[] mydifosp = new FormazioneItem[] {
                new FormazioneItem(3, R.drawable.ororosso, "Hateboer"),
                new FormazioneItem(77, R.drawable.ororosso, "Gosens"),
                new FormazioneItem(25, R.drawable.ororosso, "Ansaldi"),
        };

        RecyclerView recdifosp = (RecyclerView) view.findViewById(R.id.difensoriosp);
        FormazioneAdapter aptdifosp = new FormazioneAdapter(mydifosp);
        recdifosp.setHasFixedSize(true);
        LinearLayoutManager layoutManagerdo = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        recdifosp.setLayoutManager(layoutManagerdo);
        recdifosp.setAdapter(aptdifosp);


        //centrocampo ospite
        FormazioneItem[] mycenosp = new FormazioneItem[] {
                new FormazioneItem(11, R.drawable.ororosso, "Zaniolo"),
                new FormazioneItem(10, R.drawable.ororosso, "Zakaria"),
                new FormazioneItem(2, R.drawable.ororosso, "Miranchuk"),
                new FormazioneItem(8, R.drawable.ororosso, "Pessina"),
        };

        RecyclerView reccenosp = (RecyclerView) view.findViewById(R.id.centroosp);
        FormazioneAdapter aptcenosp = new FormazioneAdapter(mycenosp);
        reccenosp.setHasFixedSize(true);
        LinearLayoutManager layoutManagerco = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        reccenosp.setLayoutManager(layoutManagerco);
        reccenosp.setAdapter(aptcenosp);


        //attacco ospite
        FormazioneItem[] myattosp = new FormazioneItem[] {
                new FormazioneItem(9, R.drawable.ororosso, "Rebic"),
                new FormazioneItem(22, R.drawable.ororosso, "Ibra"),
                new FormazioneItem(25, R.drawable.ororosso, "Henry"),
        };

        RecyclerView recattosp = (RecyclerView) view.findViewById(R.id.attosp);
        FormazioneAdapter aptattosp = new FormazioneAdapter(myattosp);
        recattosp.setHasFixedSize(true);
        LinearLayoutManager layoutManagerattosp = (new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL, false));
        recattosp.setLayoutManager(layoutManagerattosp);
        recattosp.setAdapter(aptattosp);





        //panchina casa

        BenchItem[] benchcasa = new BenchItem[] {
                new BenchItem(9, "Morata"),
                new BenchItem(3, "Strandberg"),
                new BenchItem(4, "Gyomber"),
                new BenchItem(9, "Morata"),
                new BenchItem(3, "Strandberg"),
                new BenchItem(4, "Gyomber"),

        };

        RecyclerView recbenchcasa = (RecyclerView) view.findViewById(R.id.rvpanchinacasa);
        BenchAdapter adaptbenchcasa = new BenchAdapter(benchcasa);
        recbenchcasa.setHasFixedSize(true);
        LinearLayoutManager layoutManagerbenchcasa = (new LinearLayoutManager(view.getContext()));
        recbenchcasa.setLayoutManager(layoutManagerbenchcasa);
        recbenchcasa.setAdapter(adaptbenchcasa);



        //panchina ospite

        BenchItem[] benchospite = new BenchItem[] {
                new BenchItem(9, "Morata"),
                new BenchItem(3, "Strandberg"),
                new BenchItem(4, "Gyomber"),
                new BenchItem(9, "Morata"),
                new BenchItem(3, "Strandberg"),
                new BenchItem(4, "Gyomber"),

        };

        RecyclerView recbenchosp = (RecyclerView) view.findViewById(R.id.rvpanchinaosp);
        BenchAdapter adaptbenchosp = new BenchAdapter(benchospite);
        recbenchosp.setHasFixedSize(true);
        LinearLayoutManager layoutManagerbenchosp = (new LinearLayoutManager(view.getContext()));
        recbenchosp.setLayoutManager(layoutManagerbenchosp);
        recbenchosp.setAdapter(adaptbenchosp);

        return view;

    }
}