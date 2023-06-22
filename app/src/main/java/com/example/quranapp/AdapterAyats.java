package com.example.quranapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quranapp.Models.AyatModel.VersesItem;

import java.util.ArrayList;
import java.util.List;

public class AdapterAyats extends RecyclerView.Adapter<AdapterAyats.AyatViewHolder> {
    private List<VersesItem> results;

    public AdapterAyats(List<VersesItem> results) {
        this.results = results;
    }

    @NonNull
    @Override
    public AdapterAyats.AyatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AyatViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.ayat, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAyats.AyatViewHolder holder, int position) {
        VersesItem result = results.get(position);

        holder.textViewAyat.setText(result.getTextUthmani());

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class AyatViewHolder extends RecyclerView.ViewHolder {
        TextView textViewAyat;
        public AyatViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewAyat = itemView.findViewById(R.id.tvAyat);
        }
    }

    public void setData(List<VersesItem> data){
        results.clear();
        results.addAll(data);
        notifyDataSetChanged();
    }


}
