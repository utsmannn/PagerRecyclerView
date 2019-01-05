/*
 * Created by Muhammad Utsman on 6/1/2019
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 1/6/19 2:19 AM
 */

package com.utsman.testpagerrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MyPagerAdapter extends PagerAdapter {

    private Context context;

    private List<String> stringList1 = new ArrayList<>();
    private List<String> stringList2 = new ArrayList<>();

    MyPagerAdapter(Context context) {
        this.context = context;

        // add list
        for (int x = 1; x <= 6; x++){
            stringList1.add("item page1 " + String.valueOf(x));
        }

        for (int x = 1; x <= 4; x++) {
            stringList2.add("item page2 " + String.valueOf(x));
        }

    }

    private List[] lists = new List[]{
            stringList1,
            stringList2
    };

    private MyRecyclerViewAdapter[] adapters = new MyRecyclerViewAdapter[] {
            new MyRecyclerViewAdapter(stringList1),
            new MyRecyclerViewAdapter(stringList2)
    };

    @Override
    public int getCount() {
        return lists.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pager, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.my_list);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
        recyclerView.setAdapter(adapters[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
