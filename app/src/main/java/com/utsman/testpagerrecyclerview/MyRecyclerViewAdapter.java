/*
 * Created by Muhammad Utsman on 6/1/2019
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 1/6/19 2:30 AM
 */

package com.utsman.testpagerrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.Holder> {
    private List<String> list;

    MyRecyclerViewAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        String item = list.get(i);

        holder.textView.setText(item);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView textView;

        Holder(@NonNull View itemView) {
            super(itemView);
            textView  = itemView.findViewById(R.id.title_card);
        }
    }
}
