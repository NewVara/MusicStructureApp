package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    String descriptionTextAlbums = "List of albums with Artist name. Menu bar below allows you to access other activities.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView description = (TextView) findViewById(R.id.activity_desc);
        description.setText(descriptionTextAlbums);

        ArrayList<songArtist> songArtists = new ArrayList<songArtist>();

        songArtists.add(new songArtist("Revival","Eminem"));
        songArtists.add(new songArtist("Reputation","Taylor Swift"));
        songArtists.add(new songArtist("Scorpion","Drake"));
        songArtists.add(new songArtist("Post","Jeff Rosenstock"));
        songArtists.add(new songArtist("Hundreds of Days","Mary Lattimore"));
        songArtists.add(new songArtist("Lush","Snail Mail"));
        songArtists.add(new songArtist("Everything is Love","Beyoncé and Jay-Z"));
        songArtists.add(new songArtist("Victory Lap","Nipsey Hussle"));
        songArtists.add(new songArtist("Ephorize","CupcakKe"));
        songArtists.add(new songArtist("BEASTMODE 2","Future"));

        SongAdapter adapter = new SongAdapter(this, songArtists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView main = findViewById(R.id.playList);
        TextView nowPlaying = findViewById(R.id.nowPlaying);
        TextView top10 = findViewById(R.id.top10);

        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        top10.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent top100Intent = new Intent(AlbumsActivity.this, Top10.class);
                startActivity(top100Intent);
            }
        });
    }
}
