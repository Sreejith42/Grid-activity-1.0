package com.example.gridactivity;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;


    public RecycleViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.text);
    }
}
