package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    String descriptionTextNow = "Song that is playing currently is displayed on this screen. Menu bar below allows you to access other activities.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView description = (TextView) findViewById(R.id.activity_desc_Now);
        description.setText(descriptionTextNow);

        TextView main = findViewById(R.id.playList);
        TextView albums = findViewById(R.id.albums);
        TextView top10 = findViewById(R.id.top10);

        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

       albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(NowPlayingActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
        top10.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent top100Intent = new Intent(NowPlayingActivity.this, Top10.class);
                startActivity(top100Intent);
            }
        });
    }
}
