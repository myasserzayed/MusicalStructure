package com.example.android.musicalstructure.Saved;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.musicalstructure.MainActivity;
import com.example.android.musicalstructure.PlayNowActivity;
import com.example.android.musicalstructure.R;

import java.util.ArrayList;

public class SavedActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView mSavedRV;
    private ArrayList<SavedRVModel> mSavedList;
    private SavedRVAdapter mSavedAdapter;
    private ImageView mHome, mPlayNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        saved();
        mHome = findViewById(R.id.home_btn);
        mPlayNow = findViewById(R.id.play_now_btn);
        mHome.setOnClickListener(this);
        mPlayNow.setOnClickListener(this);
    }

    private void saved() {
        mSavedRV = findViewById(R.id.saved_RV);
        mSavedList = new ArrayList<>();

        SavedRVModel song1 = new SavedRVModel("Barbara Szymanska", "Nella Fantasia", R.drawable.equalizer);
        mSavedList.add(song1);
        SavedRVModel song2 = new SavedRVModel("Robert Miles", "Children", R.drawable.equalizer);
        mSavedList.add(song2);
        SavedRVModel song3 = new SavedRVModel("Azza Zarour", "Bella Ciao", R.drawable.equalizer);
        mSavedList.add(song3);
        SavedRVModel song4 = new SavedRVModel("Hedi Donia", "Khallouni", R.drawable.equalizer);
        mSavedList.add(song4);
        SavedRVModel song5 = new SavedRVModel("Hisham Kharma", "First Voyage", R.drawable.equalizer);
        mSavedList.add(song5);
        SavedRVModel song6 = new SavedRVModel("Marshmello Remix", "Sing Me To Sleep", R.drawable.equalizer);
        mSavedList.add(song6);
        SavedRVModel song7 = new SavedRVModel("Tchaikovsky", "The Swan Lake", R.drawable.equalizer);
        mSavedList.add(song7);
        SavedRVModel song8 = new SavedRVModel("Barbara Szymanska", "The Center Of Now", R.drawable.equalizer);
        mSavedList.add(song8);
        SavedRVModel song9 = new SavedRVModel("2Pac", "The Next Episode 1", R.drawable.equalizer);
        mSavedList.add(song9);
        SavedRVModel song10 = new SavedRVModel("Norah Jones", "Come Away With Me", R.drawable.equalizer);
        mSavedList.add(song10);
        SavedRVModel song11 = new SavedRVModel("Adele", "Hello", R.drawable.equalizer);
        mSavedList.add(song11);
        SavedRVModel song12 = new SavedRVModel("JLo", "On The Floor", R.drawable.equalizer);
        mSavedList.add(song12);
        SavedRVModel song13 = new SavedRVModel("Mandy Moore", "A Walk To Remember", R.drawable.equalizer);
        mSavedList.add(song13);
        SavedRVModel song14 = new SavedRVModel("Hamza Namera", "Saheb Al Saada", R.drawable.equalizer);
        mSavedList.add(song14);
        SavedRVModel song15 = new SavedRVModel("Adele", "Set Fire To The Rain", R.drawable.equalizer);
        mSavedList.add(song15);
        SavedRVModel song16 = new SavedRVModel("Elton John", "Sorry Seems to Be the Hardest Word", R.drawable.equalizer);
        mSavedList.add(song16);

        mSavedAdapter = new SavedRVAdapter(mSavedList);
        mSavedRV.setAdapter(mSavedAdapter);
        RecyclerView.LayoutManager layoutManagerSaved = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mSavedRV.setLayoutManager(layoutManagerSaved);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_btn:
                Intent home = new Intent(SavedActivity.this, MainActivity.class);
                startActivity(home);
                break;

            case R.id.play_now_btn:
                Intent playNow = new Intent(SavedActivity.this, PlayNowActivity.class);
                startActivity(playNow);
                break;
        }
    }
}