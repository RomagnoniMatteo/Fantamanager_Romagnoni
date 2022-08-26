package com.matteoromagnoni.fantamanager.InsideSettings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.matteoromagnoni.fantamanager.Activity.Home;
import com.matteoromagnoni.fantamanager.ModelDataList.SvincolatiAdapter;
import com.matteoromagnoni.fantamanager.ModelDataList.SvincolatiItem;
import com.matteoromagnoni.fantamanager.R;

import java.util.ArrayList;

public class SvincolatiU21Fragment extends Activity {

    ImageButton b;
    ListView list;
    EditText search;
    ArrayList<SvincolatiItem> originalValues;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.svincolatifragment);

        list = findViewById(R.id.lvsnicolati);
        search = findViewById(R.id.searchplsvinc);


        b = findViewById(R.id.butHome);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });






        originalValues = new ArrayList<>();


        for (int i = 0; i < 1; i++) {
            // here you initialise the class with your own data
            SvincolatiItem searchPlayerItem = new SvincolatiItem(2002, "Badelj", "Genoa", "C");

            originalValues.add(searchPlayerItem);
        }

        final SvincolatiAdapter adapter = new SvincolatiAdapter(getApplicationContext(), R.layout.fragment_svincolati, originalValues);

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

    }

    public void openHome(){
        Intent intent = new Intent(SvincolatiU21Fragment.this, Home.class);
        startActivity(intent);
    }
}