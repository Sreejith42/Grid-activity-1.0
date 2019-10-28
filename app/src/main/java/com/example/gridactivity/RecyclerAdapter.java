package com.example.gridactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecycleViewHolder> {


    private String[] numbers;

    public RecyclerAdapter(String[] numbers) {
        this.numbers = numbers;
    }


    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        RecycleViewHolder viewHolder= new RecycleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        holder.textView.setText(numbers[position]);
    }




    @Override
    public int getItemCount() {
        return numbers.length;
    }
}
