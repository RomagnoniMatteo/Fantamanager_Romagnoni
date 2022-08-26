package com.matteoromagnoni.fantamanager.mercatoanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;
import com.matteoromagnoni.fantamanager.Activity.Home;
import com.matteoromagnoni.fantamanager.R;

public class aperturamercato extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    int timeout = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aperturamercato);

        lottieAnimationView = findViewById(R.id.lottie);

        lottieAnimationView.animate().translationY(-1600).setDuration(1000).setStartDelay(1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openHome();
                finish();
            }
        }, timeout);
    }

    public void openHome(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}