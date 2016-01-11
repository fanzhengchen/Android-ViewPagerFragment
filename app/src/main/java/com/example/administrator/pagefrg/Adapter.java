package com.example.administrator.pagefrg;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/1/11.
 */
public class Adapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;
    private FragmentManager fragmentManager;

    public Adapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragmentManager = fm;
        this.fragments = fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
