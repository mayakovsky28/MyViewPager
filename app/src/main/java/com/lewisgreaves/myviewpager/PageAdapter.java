package com.lewisgreaves.myviewpager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/*
 * Created by @Mayakovsky28 on 06 01 2020.
 */
public class PageAdapter extends FragmentPagerAdapter {

    private int[] colors;

    public PageAdapter(FragmentManager fragmentManager, int[] colors) {
        super(fragmentManager);
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return (139);
    }

    @Override
    public Fragment getItem(int position) {
        return (PageFragment.newInstance(position, this.colors[position]));
    }
}
