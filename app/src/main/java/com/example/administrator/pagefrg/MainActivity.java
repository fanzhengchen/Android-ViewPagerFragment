package com.example.administrator.pagefrg;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private Fragment frg1, frg2, frg3;
    private ArrayList<Fragment> fragments;
    private Adapter adapter;
    @Bind(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        fragments = new ArrayList<Fragment>();
        frg1 = new Frg1();
        frg2 = new Frg2();
        frg3 = new Frg3();
        fragments.add(frg1);
        fragments.add(frg2);
        fragments.add(frg3);
        adapter = new Adapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
    }
}
