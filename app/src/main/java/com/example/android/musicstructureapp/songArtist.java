package com.example.android.musicstructureapp;

public class songArtist {
    private String msongName;

    private String martistName;


    public songArtist(String songName, String artistName){
        msongName = songName;
        martistName = artistName;

    }

    public String getSongName(){

        return msongName;
    }
    public String getArtistName(){

        return martistName;
    }

}
