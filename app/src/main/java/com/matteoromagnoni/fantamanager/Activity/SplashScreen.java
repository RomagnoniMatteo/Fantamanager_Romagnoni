package com.matteoromagnoni.fantamanager.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.matteoromagnoni.fantamanager.Activity.Home;
import com.matteoromagnoni.fantamanager.R;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;
    LottieAnimationView lottieAnimationView;
    MediaPlayer mediaplayer;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        text = findViewById(R.id.introtext);
        final String[] mystrings = {"Dennis Johnsen è il giocatore più bello della serie A",
                                    "Badelj è il giocatore che recupera più palloni",
                                    "Bremer è più forte di Thiago Silva"};

        int rando = (int) (Math.random()* mystrings.length);
        text.setText(mystrings[rando]);


        logo = findViewById(R.id.logo);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        Thread timer = new Thread() {
            @Override
            public void run() {
                try {
                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.europaleague);
                    mediaplayer.start();
                    sleep(4000);
                } catch (InterruptedException e) {

                } finally {
                    openHome();
                }
            }
        };

        timer.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaplayer.release();
        finish();
    }

    public void openHome(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}