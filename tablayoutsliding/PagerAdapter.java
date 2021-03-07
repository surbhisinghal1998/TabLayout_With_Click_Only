package com.solution.tablayoutsliding;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.solution.tablayoutsliding.fragments.CallFragments;
import com.solution.tablayoutsliding.fragments.ChatFragments;
import com.solution.tablayoutsliding.fragments.StatusFragments;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int NumberOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumberOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ChatFragments tab1 = new ChatFragments();
                return tab1;
            case 1:
                StatusFragments tab2 = new StatusFragments();
                return tab2;
            case 2:
                CallFragments tab3 = new CallFragments();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumberOfTabs;
    }
}