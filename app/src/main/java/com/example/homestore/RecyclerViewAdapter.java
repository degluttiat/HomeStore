package com.example.homestore;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    ArrayList<HomeClass> list;

    public RecyclerViewAdapter(ArrayList<HomeClass> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {
        HomeClass homeClass = list.get(i);
        viewHolder.textBreakfast.setText(homeClass.getTextBreakfast());
        viewHolder.textLunch.setText(homeClass.getTextLunch());
        viewHolder.textSupper.setText(homeClass.getTextSupper());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textBreakfast;
        public TextView textLunch;
        public TextView textSupper;

        public ViewHolder(View itemView) {
            super(itemView);
            textBreakfast = itemView.findViewById(R.id.textBreakfast);
            textLunch = itemView.findViewById(R.id.textLunch);
            textSupper = itemView.findViewById(R.id.textSupper);
        }
    }
}
