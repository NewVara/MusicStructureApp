package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Top10 extends AppCompatActivity {

    String descriptionTextTop10 = "A list of top 10 songs with song name and artist name below. " +
            "Menu bar below allows you to access other activities.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView description = (TextView) findViewById(R.id.activity_desc);
        description.setText(descriptionTextTop10);

        ArrayList<songArtist> songArtists = new ArrayList<songArtist>();

        songArtists.add(new songArtist("Never Be the Same","Camila Cabello"));
        songArtists.add(new songArtist("All The Stars","Kendrick Lamar"));
        songArtists.add(new songArtist("Love Lies","Khalid"));
        songArtists.add(new songArtist("High Horse","Kacey Musgraves"));
        songArtists.add(new songArtist("After The Storm","Kali Uchis"));
        songArtists.add(new songArtist("Rise","Jonas Blue"));
        songArtists.add(new songArtist("Thunderclouds","LSD"));
        songArtists.add(new songArtist("Happier","Marshmello"));
        songArtists.add(new songArtist("You Are The Reason","Calum Scott"));
        songArtists.add(new songArtist("The Chainsmokers","Sick Boy"));

        SongAdapter adapter = new SongAdapter(this, songArtists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView albums = findViewById(R.id.albums);
        TextView nowPlaying = findViewById(R.id.nowPlaying);
        TextView main = findViewById(R.id.playList);

        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the albums View is clicked on.
                Intent albumsIntent = new Intent(Top10.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing View is clicked on.
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the Now playing View is clicked on.
                Intent nowPlayingIntent = new Intent(Top10.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the Play list View is clicked on.
                Intent mainIntent = new Intent(Top10.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

    }
}
