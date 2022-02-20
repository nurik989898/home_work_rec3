package com.example.home_work_rec3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Language_ViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public Language_ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.language_textview);
    }

    public void bind(String s) {
       textView.setText(s);
    }
}
