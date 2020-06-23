package com.example.android.musicalstructure.Saved;

public class SavedRVModel {
    String artistName;
    String songName;
    int img;

    public SavedRVModel(String artistName, String songName, int img) {
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
