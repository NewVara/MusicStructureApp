package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
        // create string variable for activity description
     String descriptionText = " A list of songs in your library.Song title and Artist name is displayed below." +
             " Menu bar below allows you to access other activities.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Set activity description to string declared on activity startup
        TextView description = (TextView) findViewById(R.id.activity_desc);
        description.setText(descriptionText);

        // Create an arraylist to store songartist objects

        ArrayList<songArtist> songArtists = new ArrayList<songArtist>();

        songArtists.add(new songArtist("Girls Like You","Andrea garcia Maroon 5"));
        songArtists.add(new songArtist("No Tears Left to Cry","Ariana Grande"));
        songArtists.add(new songArtist("Solo","Clean Bandit"));
        songArtists.add(new songArtist("God's Plan","Drake"));
        songArtists.add(new songArtist("SICKO MODE","Travis Scott"));
        songArtists.add(new songArtist("Back To You","Selena Gomez"));
        songArtists.add(new songArtist("Youngblood","5 Seconds of Summer"));
        songArtists.add(new songArtist("Don't Leave Me Alone","David Guetta"));
        songArtists.add(new songArtist("Mine","Bazzi"));
        songArtists.add(new songArtist("Nevermind","Dennis Lloyd"));

        // Create an adapter whose datasource is songartists

        SongAdapter adapter = new SongAdapter(this, songArtists);
        // find listview in main activity.xml
        ListView listView = (ListView) findViewById(R.id.list);
        // use setAdapter method to display items in the listview
        listView.setAdapter(adapter);


        TextView albums = findViewById(R.id.albums);
        TextView nowPlaying = findViewById(R.id.nowPlaying);
        TextView top10 = findViewById(R.id.top10);

        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        top10.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent top100Intent = new Intent(MainActivity.this, Top10.class);
                startActivity(top100Intent);
            }
        });


    }
}
