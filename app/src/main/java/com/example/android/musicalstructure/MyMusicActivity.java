package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicalstructure.R.id.go_to_store_button;

public class MyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        Button goToStoreButton = (Button) findViewById(go_to_store_button);

        goToStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToStoreButtonIntent = new Intent(MyMusicActivity.this, StoreActivity.class);
                startActivity(goToStoreButtonIntent);
            }
        });
    }
}
