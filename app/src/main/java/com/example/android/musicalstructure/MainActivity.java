package com.example.android.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicalstructure.Saved.SavedActivity;
import com.example.android.musicalstructure.Suggested.SuggestedRVAdapter;
import com.example.android.musicalstructure.Suggested.SuggestedRVModel;
import com.example.android.musicalstructure.Suggested.SuggestionActivity;
import com.example.android.musicalstructure.Trending.TrendingActivity;
import com.example.android.musicalstructure.Trending.TrendingRVAdapter;
import com.example.android.musicalstructure.Trending.TrendingRVModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTrendingSongs, mSuggestedSongs;
    private ImageView mSavedSongs, mPlayNow;
    private RecyclerView mTrendingRV, mSuggestedRV;
    private ArrayList<TrendingRVModel> mTrendingList;
    private ArrayList<SuggestedRVModel> mSuggestedList;
    private TrendingRVAdapter mTrendingAdapter;
    private SuggestedRVAdapter mSuggestedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trending();
        suggested();
        listeners();
    }

    private void listeners() {
        mTrendingSongs = findViewById(R.id.trending);
        mSuggestedSongs = findViewById(R.id.suggestions);
        mSavedSongs = findViewById(R.id.saved_btn);
        mPlayNow = findViewById(R.id.play_now_btn);

        mTrendingSongs.setOnClickListener(this);
        mSuggestedSongs.setOnClickListener(this);
        mSavedSongs.setOnClickListener(this);
        mPlayNow.setOnClickListener(this);
    }

    public void suggested() {
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

    public void trending() {
        mTrendingRV = findViewById(R.id.trending_RV);
        mTrendingList = new ArrayList<>();

        TrendingRVModel song1 = new TrendingRVModel("Tones And I", "Dance Monkey", R.drawable.equalizer);
        mTrendingList.add(song1);
        TrendingRVModel song2 = new TrendingRVModel("Bebe Rexha", "I Got Time", R.drawable.equalizer);
        mTrendingList.add(song2);
        TrendingRVModel song3 = new TrendingRVModel("Dua Lipa", "Break My Heart", R.drawable.equalizer);
        mTrendingList.add(song3);
        TrendingRVModel song4 = new TrendingRVModel("Warriyo", "Mortals", R.drawable.equalizer);
        mTrendingList.add(song4);
        TrendingRVModel song5 = new TrendingRVModel("Christina Perri", "A Thousand Years", R.drawable.equalizer);
        mTrendingList.add(song5);
        TrendingRVModel song6 = new TrendingRVModel("Bazzi", "Renee's Song", R.drawable.equalizer);
        mTrendingList.add(song6);
        TrendingRVModel song7 = new TrendingRVModel("Sia", "Flames", R.drawable.equalizer);
        mTrendingList.add(song7);
        TrendingRVModel song8 = new TrendingRVModel("Joss Stone", "A Man's World", R.drawable.equalizer);
        mTrendingList.add(song8);
        TrendingRVModel song9 = new TrendingRVModel("Issam B", "Man With A Plan", R.drawable.equalizer);
        mTrendingList.add(song9);
        TrendingRVModel song10 = new TrendingRVModel("Zayn", "Dusk Till Dawn", R.drawable.equalizer);
        mTrendingList.add(song10);
        TrendingRVModel song11 = new TrendingRVModel("Nabila Maen", "Qol Feya Sheeran", R.drawable.equalizer);
        mTrendingList.add(song11);
        TrendingRVModel song12 = new TrendingRVModel("Bahjat", "Galbek Ween", R.drawable.equalizer);
        mTrendingList.add(song12);
        TrendingRVModel song13 = new TrendingRVModel("Outlandish", "Better Days", R.drawable.equalizer);
        mTrendingList.add(song13);
        TrendingRVModel song14 = new TrendingRVModel("Yiruma", "River Flows In You", R.drawable.equalizer);
        mTrendingList.add(song14);
        TrendingRVModel song15 = new TrendingRVModel("Ludovico Einaudi", "Primavera", R.drawable.equalizer);
        mTrendingList.add(song15);
        TrendingRVModel song16 = new TrendingRVModel("Yann Tiersen", "Comptine d`un autre ete", R.drawable.equalizer);
        mTrendingList.add(song16);

        mTrendingAdapter = new TrendingRVAdapter(mTrendingList);
        mTrendingRV.setAdapter(mTrendingAdapter);
        RecyclerView.LayoutManager layoutManagerTrending = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mTrendingRV.setLayoutManager(layoutManagerTrending);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.trending:
                Intent trendingSongs = new Intent(MainActivity.this, TrendingActivity.class);
                startActivity(trendingSongs);
                break;

            case R.id.suggestions:
                Intent suggestedSongs = new Intent(MainActivity.this, SuggestionActivity.class);
                startActivity(suggestedSongs);
                break;

            case R.id.saved_btn:
                Intent savedSongs = new Intent(MainActivity.this, SavedActivity.class);
                startActivity(savedSongs);
                break;

            case R.id.play_now_btn:
                Intent playingNow = new Intent(MainActivity.this, PlayNowActivity.class);
                startActivity(playingNow);
                break;
        }
    }
}
