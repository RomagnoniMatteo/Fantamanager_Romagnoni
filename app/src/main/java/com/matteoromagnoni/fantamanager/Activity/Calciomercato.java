package com.matteoromagnoni.fantamanager.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.matteoromagnoni.fantamanager.ModelDataList.SearchPlayerAdapter;
import com.matteoromagnoni.fantamanager.ModelDataList.SearchPlayerItem;
import com.matteoromagnoni.fantamanager.R;

import java.util.ArrayList;

public class Calciomercato extends AppCompatActivity {

    Button scambi, vivaio, draft, sulmercato;
    ListView list;
    EditText search;
    ArrayList<SearchPlayerItem> originalValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calciomercato);


        //search player

        list = findViewById(R.id.viewplayer);
        search = findViewById(R.id.cercaplayer);
        search.addTextChangedListener(filterTextWatcher);


        originalValues = new ArrayList<>();



        for (int i = 0; i < 5; i++) {
            // here you initialise the class with your own data
            SearchPlayerItem searchPlayerItem = new SearchPlayerItem(1989, R.drawable.aston_villa_emblem, "Badelj", "Genoa", "C");

            originalValues.add(searchPlayerItem);
        }

        final SearchPlayerAdapter adapter = new SearchPlayerAdapter(this, R.layout.legaitem, originalValues);

        list.setAdapter(adapter);
        search.addTextChangedListener(new TextWatcher() {


            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String searchString = search.getText().toString();
                int textLength = searchString.length();

                adapter.clearSearchResult();

                for (int i = 0; i < originalValues.size(); i++) {
                    String lega = originalValues.get(i).getNome();
                    if (textLength <= lega.length()) {
                        // compare the String in EditText with Names in the
                        // ArrayList
                        if (searchString.equalsIgnoreCase(lega.substring(0, textLength)))
                            adapter.addSeachResult(originalValues.get(i));
                    }
                }

                adapter.notifyDataSetChanged();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            public void afterTextChanged(Editable s) {

            }
        });



        //button schermate

        scambi = findViewById(R.id.ButtonScambi);
        draft = findViewById(R.id.ButtonDraft);
        vivaio = findViewById(R.id.ButtonVivaio);
        sulmercato = findViewById(R.id.ButtonMercato);



        scambi.setOnClickListener(view -> {
            Intent intent = new Intent(Calciomercato.this, Scambi.class);
            startActivity(intent);
        });

        draft.setOnClickListener(view -> {
            Intent intent = new Intent(Calciomercato.this, DraftU23.class);
            startActivity(intent);
        });

        vivaio.setOnClickListener(view -> {
            Intent intent = new Intent(Calciomercato.this, Vivaio.class);
            startActivity(intent);
        });




        sulmercato.setOnClickListener(view -> {

            Intent intent = new Intent(Calciomercato.this, SulMercato.class);
            startActivity(intent);
        });





        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.toTransfer);

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



    // listview a comparsa
    private TextWatcher filterTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count)
        {
            //Change the visibility here
            list.setVisibility(View.VISIBLE);

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    }
