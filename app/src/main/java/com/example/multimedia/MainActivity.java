package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView chat, chien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chat = findViewById(R.id.chat);
        chien = findViewById(R.id.chien);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(), "Bonjour chat", Toast.LENGTH_LONG);
                t.show();
                MediaPlayer media = MediaPlayer.create(getApplicationContext(), R.raw.chat);
                media.start();
            }
        });
        chien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(), "Bonjour chien", Toast.LENGTH_LONG);
                t.show();
                MediaPlayer media = MediaPlayer.create(getApplicationContext(), R.raw.chien);
                media.start();
            }
        });
    }
}