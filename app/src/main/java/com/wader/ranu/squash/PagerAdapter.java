package com.wader.ranu.squash;

/**
 * Created by Ranu on 10/01/2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                UniversitasFragment tab1 = new UniversitasFragment();
                return tab1;
            case 1:
                FakultasFragment tab2 = new FakultasFragment();
                return tab2;
            case 2:
                ForumFragment tab3 = new ForumFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}