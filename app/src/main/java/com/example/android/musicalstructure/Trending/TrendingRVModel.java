package com.example.android.musicalstructure.Trending;

public class TrendingRVModel {
    String artistName;
    String songName;
    int img;

    public TrendingRVModel (String artistName, String songName, int img){
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
