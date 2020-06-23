package com.example.android.musicalstructure.Suggested;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.musicalstructure.R;

import java.util.ArrayList;

public class SuggestedRVAdapter extends RecyclerView.Adapter<SuggestedRVAdapter.SuggestedViewHolder> {

    private ArrayList<SuggestedRVModel> mSuggestedList;

    public SuggestedRVAdapter(ArrayList <SuggestedRVModel> suggestedList){
        mSuggestedList = suggestedList;
    }

    @NonNull
    @Override
    public SuggestedRVAdapter.SuggestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_list, parent, false);
        SuggestedRVAdapter.SuggestedViewHolder suggestedViewHolder = new SuggestedRVAdapter.SuggestedViewHolder(view);
        return suggestedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuggestedRVAdapter.SuggestedViewHolder holder, int position) {
        holder.mArtist.setText(mSuggestedList.get(position).getArtistName());
        holder.mSong.setText(mSuggestedList.get(position).getSongName());
        holder.mImg.setImageResource(mSuggestedList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mSuggestedList.size();
    }

    public class SuggestedViewHolder extends RecyclerView.ViewHolder {
        TextView mArtist, mSong;
        ImageView mImg;
        public SuggestedViewHolder(@NonNull View itemView) {
            super(itemView);
            mArtist = itemView.findViewById(R.id.artistName);
            mSong = itemView.findViewById(R.id.songName);
            mImg = itemView.findViewById(R.id.art_img);
        }
    }
}
