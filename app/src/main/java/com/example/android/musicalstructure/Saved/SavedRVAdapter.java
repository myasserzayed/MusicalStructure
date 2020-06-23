package com.example.android.musicalstructure.Saved;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.musicalstructure.R;

import java.util.ArrayList;

public class SavedRVAdapter extends RecyclerView.Adapter<SavedRVAdapter.SavedViewHolder> {

    private ArrayList<SavedRVModel> mSavedList;

    public SavedRVAdapter(ArrayList <SavedRVModel> savedList){
        mSavedList = savedList;
    }

    @NonNull
    @Override
    public SavedRVAdapter.SavedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_list, parent, false);
        SavedRVAdapter.SavedViewHolder savedViewHolder = new SavedRVAdapter.SavedViewHolder(view);
        return savedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SavedRVAdapter.SavedViewHolder holder, int position) {
        holder.mArtist.setText(mSavedList.get(position).getArtistName());
        holder.mSong.setText(mSavedList.get(position).getSongName());
        holder.mImg.setImageResource(mSavedList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mSavedList.size();
    }

    public class SavedViewHolder extends RecyclerView.ViewHolder {
        TextView mArtist, mSong;
        ImageView mImg;
        public SavedViewHolder(@NonNull View itemView) {
            super(itemView);
            mArtist = itemView.findViewById(R.id.artistName);
            mSong = itemView.findViewById(R.id.songName);
            mImg = itemView.findViewById(R.id.art_img);
        }
    }
}

