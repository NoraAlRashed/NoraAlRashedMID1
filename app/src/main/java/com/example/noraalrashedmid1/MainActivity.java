package com.example.noraalrashedmid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    {

        ImageView animal;
        int playing;
        MediaPlayer animalmp;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("You're in the first activity");

        animalmp = new MediaPlayer();
        animalmp = MediaPlayer.create(this, R.raw.track1);

        playing = 0;

        animal = (ImageView) findViewById(R.id.imageView);

        Button actbtn2 = findViewById(R.id.act2btn);
        Button actbtn3 = findViewById(R.id.act3btn);


        actbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        actbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });

        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playing) {
                    case 0:
                        animalmp.start();
                        playing = 1;
                        break;
                    case 1:
                        animalmp.pause();
                        playing = 0;
                        break;
                }
            }
        });

    }
    }
}
