package com.example.callerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CallerAppAdapter extends RecyclerView.Adapter<CallerAppViewHolder> {
    private ArrayList<CallerAppModel>callerAppModels;

    public CallerAppAdapter(ArrayList<CallerAppModel> callerAppModels, MainActivity mainActivity) {
        this.callerAppModels=callerAppModels;
    }


    @NonNull
    @Override
    public CallerAppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        return new CallerAppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallerAppViewHolder holder, int position) {
        CallerAppModel callerAppModel=callerAppModels.get(position);
        holder.setData(callerAppModel);

    }

    @Override
    public int getItemCount() {
        return callerAppModels.size();
    }
}
