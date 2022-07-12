package com.example.glimpse;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new com.example.glimpse.HomeFragment();

            case 1:
                return new com.example.glimpse.SportsFragment();

            case 2:
                return new com.example.glimpse.HealthFragment();

            case 3:
                return new com.example.glimpse.ScienceFragment();

            case 4:
                return new com.example.glimpse.EntertainmentFragment();

            case 5:
                return new com.example.glimpse.TechnologyFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return tabcount;
    }
}
