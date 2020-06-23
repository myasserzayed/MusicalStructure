package com.example.android.musicalstructure.Trending;

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

public class TrendingActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView mTrendingRV;
    private ArrayList<TrendingRVModel> mTrendingList;
    private TrendingRVAdapter mTrendingAdapter;
    private ImageView mHome, mSaved,mPlayNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);

        trendings();
        mHome = findViewById(R.id.home_btn);
        mSaved = findViewById(R.id.saved_btn);
        mPlayNow = findViewById(R.id.play_now_btn);
        mHome.setOnClickListener(this);
        mSaved.setOnClickListener(this);
        mPlayNow.setOnClickListener(this);
    }

    private void trendings() {
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
            case R.id.home_btn:
                Intent home = new Intent(TrendingActivity.this, MainActivity.class);
                startActivity(home);
                break;

            case R.id.saved_btn:
                Intent saved = new Intent(TrendingActivity.this, SavedActivity.class);
                startActivity(saved);
                break;

            case R.id.play_now_btn:
                Intent playNow = new Intent(TrendingActivity.this, PlayNowActivity.class);
                startActivity(playNow);
                break;
        }

    }
}
