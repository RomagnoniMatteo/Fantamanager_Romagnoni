package com.matteoromagnoni.fantamanager.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.dsphotoeditor.sdk.activity.DsPhotoEditorActivity;
import com.dsphotoeditor.sdk.utils.DsPhotoEditorConstants;
import com.matteoromagnoni.fantamanager.ModelDataList.LegaAdapter;
import com.matteoromagnoni.fantamanager.ModelDataList.LegaItem;
import com.matteoromagnoni.fantamanager.R;

import java.util.ArrayList;

public class Lega extends AppCompatActivity {

    ImageButton btPick;
    Button btCreaLega;
    ImageView imageView;
    EditText search;
    ListView list;
    View layout;
    ArrayList<LegaItem> originalValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lega);

        layout = findViewById(R.id.view_pagercrealega);
        btCreaLega = findViewById(R.id.crealegaBUT);
        btCreaLega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.VISIBLE);
            }
        });




        //search lega

        list = findViewById(R.id.viewleghe);
        search = findViewById(R.id.searchlega);
        search.addTextChangedListener(filterTextWatcher);

        originalValues = new ArrayList<>();



        for (int i = 0; i < 5; i++) {
            // here you initialise the class with your own data
            LegaItem legaItem = new LegaItem(R.drawable.aston_villa_emblem, 12, 10, "Grevissimo");

            originalValues.add(legaItem);
        }

        final LegaAdapter adapter = new LegaAdapter(this, R.layout.legaitem, originalValues);

        list.setAdapter(adapter);
        search.addTextChangedListener(new TextWatcher() {


            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String searchString = search.getText().toString();
                int textLength = searchString.length();

                adapter.clearSearchResult();

                for (int i = 0; i < originalValues.size(); i++) {
                    String lega = originalValues.get(i).getNomelega();
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










        // modifica logo //

        btPick = findViewById(R.id.changelogo);
        imageView = findViewById(R.id.logoteamlega);

        btPick.setOnClickListener(view -> checkPermission());
    }

    private void checkPermission(){
        int permission = ActivityCompat.checkSelfPermission(Lega.this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
            pickImage();
        } else{
            if(permission != PackageManager.PERMISSION_GRANTED){

                ActivityCompat.requestPermissions(Lega.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);
            } else{

                pickImage();
            }
        }
    }

    private void pickImage(){
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 100);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == 100 && grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
            pickImage();
        }
        else{
            Toast.makeText(getApplicationContext(),"Unlucky", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode== RESULT_OK){
            Uri uri = data.getData();
            switch (requestCode){
                case 100:
                    Intent intent = new Intent(Lega.this, DsPhotoEditorActivity.class);

                    intent.setData(uri);
                    intent.putExtra(DsPhotoEditorConstants.DS_PHOTO_EDITOR_OUTPUT_DIRECTORY, "Images");

                    //toolbar
                    intent.putExtra(DsPhotoEditorConstants.DS_TOOL_BAR_BACKGROUND_COLOR, Color.parseColor("#BE000000"));
                    intent.putExtra(DsPhotoEditorConstants.DS_MAIN_BACKGROUND_COLOR, Color.parseColor("#FFFFFF"));


                    intent.putExtra(DsPhotoEditorConstants.DS_PHOTO_EDITOR_TOOLS_TO_HIDE, new int[]
                            {       DsPhotoEditorActivity.TOOL_WARMTH,
                                    DsPhotoEditorActivity.TOOL_PIXELATE,
                                    DsPhotoEditorActivity.TOOL_ORIENTATION,
                                    DsPhotoEditorActivity.TOOL_EXPOSURE,
                                    DsPhotoEditorActivity.TOOL_VIGNETTE,
                                    DsPhotoEditorActivity.TOOL_SHARPNESS,
                                    DsPhotoEditorActivity.TOOL_ROUND,
                                    DsPhotoEditorActivity.TOOL_FRAME,

                            });

                    startActivityForResult(intent, 101);
                    break;

                case 101:
                    imageView.setImageURI(uri);

                    Toast.makeText(getApplicationContext(), "foto salvata", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        // fine modifica logo //
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