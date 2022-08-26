package com.matteoromagnoni.fantamanager.MatchCorrente;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.ModelDataRecycler.VotiAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.VotiItem;
import com.matteoromagnoni.fantamanager.R;

public class VotiLiveFragment  extends Fragment {

    public VotiLiveFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.livevoti, container, false);

        //displayvoti

        //casatit
        VotiItem[] myListData = new VotiItem[] {
                new VotiItem(6, "P", "Milinkovic-Savic", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "D", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "D", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "D", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "A", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "A", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "A", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),

        };

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvtitcasa);
        VotiAdapter adapter = new VotiAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        //casabench
        VotiItem[] myList = new VotiItem[] {
                new VotiItem(6, "C", "Milinkovic-Savic", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),

        };

        RecyclerView recycler = (RecyclerView) view.findViewById(R.id.rvpancasa);
        VotiAdapter adapt = new VotiAdapter(myList);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recycler.setAdapter(adapt);




        //ospitetit
        VotiItem[] myData = new VotiItem[] {
                new VotiItem(6, "P", "Milinkovic-Savic", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "D", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "D", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "D", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "A", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "A", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "A", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),

        };

        RecyclerView reew = (RecyclerView) view.findViewById(R.id.rvtitospite);
        VotiAdapter ada = new VotiAdapter(myData);
        reew.setHasFixedSize(true);
        reew.setLayoutManager(new LinearLayoutManager(view.getContext()));
        reew.setAdapter(ada);

        //ospitebench
        VotiItem[] myaList = new VotiItem[] {
                new VotiItem(6, "C", "Milinkovic-Savic", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                new VotiItem(6, "C", "Badelj", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),

        };

        RecyclerView recyclr = (RecyclerView) view.findViewById(R.id.rvpanosp);
        VotiAdapter apt = new VotiAdapter(myaList);
        recyclr.setHasFixedSize(true);
        recyclr.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclr.setAdapter(apt);


        return view;

    }
}
