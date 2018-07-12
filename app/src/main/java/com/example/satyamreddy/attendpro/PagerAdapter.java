/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.satyamreddy.attendpro;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(android.support.v4.app.FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;

            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;

            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;

            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;

            case 4:
                Tab5 tab5 = new Tab5();
                return tab5;
            case 5:
                Tab6 tab6 = new Tab6();
                return tab6;
            case 6:
                Tab7 tab7 = new Tab7();
                return tab7;
            case 7:
                Tab8 tab8 = new Tab8();
                return tab8;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
