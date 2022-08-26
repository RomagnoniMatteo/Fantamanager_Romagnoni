package com.matteoromagnoni.fantamanager.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.dsphotoeditor.sdk.activity.DsPhotoEditorActivity;
import com.dsphotoeditor.sdk.utils.DsPhotoEditorConstants;
import com.matteoromagnoni.fantamanager.ImageEditor.ImageEditor;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.RosaClubAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.RosaClubItem;
import com.matteoromagnoni.fantamanager.R;

public class Club extends AppCompatActivity {

    ImageButton btPick;
    ImageView imageView, modclub, modstadio;
    Button divcasa, divosp, divport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);



        //displaygiocatori

        RosaClubItem[] myListData = new RosaClubItem[] {
                new RosaClubItem("P", "Consigli", R.drawable.aston_villa_emblem, 1),
                new RosaClubItem("D", "Chiellini", R.drawable.aston_villa_emblem, 3),
                new RosaClubItem("D", "Calabria", R.drawable.aston_villa_emblem, 6),
                new RosaClubItem("D", "Bremer", R.drawable.aston_villa_emblem, 33),
                new RosaClubItem("D", "De Sciglio", R.drawable.aston_villa_emblem, 2),
                new RosaClubItem("C", "Badelj", R.drawable.aston_villa_emblem, 47),
                new RosaClubItem("C", "Zakaria", R.drawable.aston_villa_emblem, 4),
                new RosaClubItem("C", "Marin", R.drawable.aston_villa_emblem, 20),
                new RosaClubItem("C", "Frendrup", R.drawable.aston_villa_emblem, 15),
                new RosaClubItem("A", "Piccoli", R.drawable.aston_villa_emblem, 99),
                new RosaClubItem("A", "Ekuban", R.drawable.aston_villa_emblem, 97),
                new RosaClubItem("A", "Kallon", R.drawable.aston_villa_emblem, 98),



        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvrosa);
        RosaClubAdapter adapter = new RosaClubAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        //modifica club & stadio //
        modclub = findViewById(R.id.modificaclub);
        modstadio = findViewById(R.id.modificastadio);


        // modifica divise //
        divcasa = findViewById(R.id.modificacasa);
        divosp= findViewById(R.id.modificatrasf);
        divport = findViewById(R.id.modificaport);

        divcasa.setOnClickListener(view -> openImageEditor());
        divosp.setOnClickListener(view -> openImageEditor());
        divport.setOnClickListener(view -> openImageEditor());



        // modifica logo //

        btPick = findViewById(R.id.changelogo);
        imageView = findViewById(R.id.logoteam);

        btPick.setOnClickListener(view -> checkPermission());
    }

    private void checkPermission(){
        int permission = ActivityCompat.checkSelfPermission(Club.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
            pickImage();
        } else{
            if(permission != PackageManager.PERMISSION_GRANTED){

                ActivityCompat.requestPermissions(Club.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);
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
                    Intent intent = new Intent(Club.this, DsPhotoEditorActivity.class);

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
    }

    // fine modifica logo //




    public void openImageEditor(){
        Intent intent = new Intent(Club.this, ImageEditor.class);
        startActivity(intent);
    }


}