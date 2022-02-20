package com.example.home_work_rec3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<Language_ViewHolder> {
    public ArrayList<String>languages = new ArrayList<>();
    public LanguageAdapter(ArrayList<String>languages){
        this.languages = languages;
    }

    @NonNull
    @Override
    public Language_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Language_ViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.languages_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Language_ViewHolder holder, int position) {
    holder.bind(languages.get(position));
    }

    @Override
    public int getItemCount() {
        return languages.size();
    }
}
