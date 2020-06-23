package com.example.android.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.musicalstructure.Saved.SavedActivity;

public class PlayNowActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mHome, mSaved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_now);

        mHome = findViewById(R.id.home_btn);
        mSaved = findViewById(R.id.saved_btn);
        mHome.setOnClickListener(this);
        mSaved.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_btn:
                Intent home = new Intent(PlayNowActivity.this, MainActivity.class);
                startActivity(home);
                break;

            case R.id.saved_btn:
                Intent saved = new Intent(PlayNowActivity.this, SavedActivity.class);
                startActivity(saved);
                break;
        }
    }
}
