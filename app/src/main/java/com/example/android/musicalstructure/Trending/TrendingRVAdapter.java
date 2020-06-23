package com.example.android.musicalstructure.Trending;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.musicalstructure.R;

import java.util.ArrayList;

public class TrendingRVAdapter extends RecyclerView.Adapter<TrendingRVAdapter.TrendingViewHolder> {

    private ArrayList <TrendingRVModel> mTrendingList;

    public TrendingRVAdapter(ArrayList <TrendingRVModel> trendingList){
        mTrendingList = trendingList;
    }

    @NonNull
    @Override
    public TrendingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_list, parent, false);
        TrendingViewHolder trendingViewHolder = new TrendingViewHolder(view);
        return trendingViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingViewHolder holder, int position) {
        holder.mArtist.setText(mTrendingList.get(position).getArtistName());
        holder.mSong.setText(mTrendingList.get(position).getSongName());
        holder.mImg.setImageResource(mTrendingList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mTrendingList.size();
    }

    public class TrendingViewHolder extends RecyclerView.ViewHolder {
        TextView mArtist, mSong;
        ImageView mImg;
        public TrendingViewHolder(@NonNull View itemView) {
            super(itemView);
            mArtist = itemView.findViewById(R.id.artistName);
            mSong = itemView.findViewById(R.id.songName);
            mImg = itemView.findViewById(R.id.art_img);
        }
    }
}
