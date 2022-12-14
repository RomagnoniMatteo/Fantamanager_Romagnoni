package com.matteoromagnoni.fantamanager.ImageEditor;

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
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.dsphotoeditor.sdk.activity.DsPhotoEditorActivity;
import com.dsphotoeditor.sdk.activity.DsPhotoEditorCropActivity;
import com.dsphotoeditor.sdk.ui.simplecropview.CropImageView;
import com.dsphotoeditor.sdk.utils.DsPhotoEditorConstants;
import com.matteoromagnoni.fantamanager.R;

public class ImageEditor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_editor);

    }
}