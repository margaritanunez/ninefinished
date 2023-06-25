package com.example.nine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initListeners();
        
    }

    private void initListeners() {
        ImageButton map = findViewById(R.id.mapButton);
        ImageButton share = findViewById(R.id.shareButton);
        ImageButton photos = findViewById(R.id.photosButton);
        ImageButton camera = findViewById(R.id.cameraButton);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationSecondActivity();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationSecondActivity();
            }
        });

        photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationSecondActivity();
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationSecondActivity();
            }
        });
    }

    public void navigationSecondActivity(){
    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
    startActivity(intent);
    }
}