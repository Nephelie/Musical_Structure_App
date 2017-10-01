package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView goToPlaylistButton = (TextView) findViewById(R.id.go_to_My_Music);

        goToPlaylistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylistButtonIntent = new Intent(NowPlayingActivity.this, MyMusicActivity.class);
                startActivity(goToPlaylistButtonIntent);
            }
        });
    }
}
