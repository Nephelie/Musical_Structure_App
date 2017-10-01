package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });


        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });


        TextView myMusic = (TextView) findViewById(R.id.myMusic);

        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MainActivity.this, MyMusicActivity.class);
                startActivity(myMusicIntent);
            }
        });


        TextView store = (TextView) findViewById(R.id.store);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });

    }
}

