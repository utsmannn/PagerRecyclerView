/*
 * Created by Muhammad Utsman on 6/1/2019
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 1/6/19 2:15 AM
 */

package com.utsman.testpagerrecyclerview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.my_viewpager);
        viewPager.setAdapter(new MyPagerAdapter(this));
    }
}
