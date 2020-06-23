package com.example.android.musicalstructure.Suggested;

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
import com.example.android.musicalstructure.Saved.SavedActivity;

import java.util.ArrayList;

public class SuggestionActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView mSuggestedRV;
    private ArrayList<SuggestedRVModel> mSuggestedList;
    private SuggestedRVAdapter mSuggestedAdapter;
    private ImageView mHome, mSaved, mPlayNow;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        suggested();
        mHome = findViewById(R.id.home_btn);
        mSaved = findViewById(R.id.saved_btn);
        mPlayNow = findViewById(R.id.play_now_btn);
        mHome.setOnClickListener(this);
        mSaved.setOnClickListener(this);
        mPlayNow.setOnClickListener(this);
    }

     private void suggested() {
        mSuggestedRV = findViewById(R.id.suggestions_RV);
        mSuggestedList = new ArrayList<>();

        SuggestedRVModel song1 = new SuggestedRVModel("Barbara Szymanska", "Nella Fantasia", R.drawable.equalizer);
        mSuggestedList.add(song1);
        SuggestedRVModel song2 = new SuggestedRVModel("Sia", "Snowman", R.drawable.equalizer);
        mSuggestedList.add(song2);
        SuggestedRVModel song3 = new SuggestedRVModel("Dasha Klyukina", "Not Like Everyone", R.drawable.equalizer);
        mSuggestedList.add(song3);
        SuggestedRVModel song4 = new SuggestedRVModel("Eagles", "Hotel California", R.drawable.equalizer);
        mSuggestedList.add(song4);
        SuggestedRVModel song5 = new SuggestedRVModel("Rihanna", "This Is What You Came For", R.drawable.equalizer);
        mSuggestedList.add(song5);
        SuggestedRVModel song6 = new SuggestedRVModel("Sting", "Shape Of My Heart", R.drawable.equalizer);
        mSuggestedList.add(song6);
        SuggestedRVModel song7 = new SuggestedRVModel("Robert Miles", "Children", R.drawable.equalizer);
        mSuggestedList.add(song7);
        SuggestedRVModel song8 = new SuggestedRVModel("James Newton Howard", "Larry Crowne", R.drawable.equalizer);
        mSuggestedList.add(song8);
        SuggestedRVModel song9 = new SuggestedRVModel("Outlandish", "Better Days", R.drawable.equalizer);
        mSuggestedList.add(song9);
        SuggestedRVModel song10 = new SuggestedRVModel("Yiruma", "River Flows In You", R.drawable.equalizer);
        mSuggestedList.add(song10);
        SuggestedRVModel song11 = new SuggestedRVModel("Ludovico Einaudi", "Primavera", R.drawable.equalizer);
        mSuggestedList.add(song11);
        SuggestedRVModel song12 = new SuggestedRVModel("Yann Tiersen", "Comptine d`un autre ete", R.drawable.equalizer);
        mSuggestedList.add(song12);
         SuggestedRVModel song13 = new SuggestedRVModel("Joss Stone", "A Man's World", R.drawable.equalizer);
         mSuggestedList.add(song13);
         SuggestedRVModel song14 = new SuggestedRVModel("Issam B", "Man With A Plan", R.drawable.equalizer);
         mSuggestedList.add(song14);
         SuggestedRVModel song15 = new SuggestedRVModel("Zayn", "Dusk Till Dawn", R.drawable.equalizer);
         mSuggestedList.add(song15);
         SuggestedRVModel song16 = new SuggestedRVModel("Nabila Maen", "Qol Feya Sheeran", R.drawable.equalizer);
         mSuggestedList.add(song16);

        mSuggestedAdapter = new SuggestedRVAdapter(mSuggestedList);
        mSuggestedRV.setAdapter(mSuggestedAdapter);
        RecyclerView.LayoutManager layoutManagerSuggested = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mSuggestedRV.setLayoutManager(layoutManagerSuggested);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_btn:
                Intent home = new Intent(SuggestionActivity.this, MainActivity.class);
                startActivity(home);
                break;

            case R.id.saved_btn:
                Intent saved = new Intent(SuggestionActivity.this, SavedActivity.class);
                startActivity(saved);
                break;

            case R.id.play_now_btn:
                Intent playNow = new Intent(SuggestionActivity.this, PlayNowActivity.class);
                startActivity(playNow);
                break;
        }
    }
}
