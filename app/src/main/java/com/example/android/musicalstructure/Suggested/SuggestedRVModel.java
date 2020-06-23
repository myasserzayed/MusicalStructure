package com.example.android.musicalstructure.Suggested;

public class SuggestedRVModel {
    String artistName;
    String songName;
    int img;

    public SuggestedRVModel (String artistName, String songName, int img){
        this.artistName = artistName;
        this.songName = songName;
        this.img = img;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongName() {
        return songName;
    }

    public int getImg() {
        return img;
    }
}
