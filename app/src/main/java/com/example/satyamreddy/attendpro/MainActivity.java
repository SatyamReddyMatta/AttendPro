/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.satyamreddy.attendpro;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener,
                                                                Tab2.OnFragmentInteractionListener,
                                                                    Tab3.OnFragmentInteractionListener,
                        Tab4.OnFragmentInteractionListener,Tab5.OnFragmentInteractionListener,Tab6.OnFragmentInteractionListener,
        Tab7.OnFragmentInteractionListener,Tab8.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("1-1"));
        tabLayout.addTab(tabLayout.newTab().setText("1-2"));
        tabLayout.addTab(tabLayout.newTab().setText("2-1"));
        tabLayout.addTab(tabLayout.newTab().setText("2-2"));
        tabLayout.addTab(tabLayout.newTab().setText("3-1"));
        tabLayout.addTab(tabLayout.newTab().setText("3-2"));
        tabLayout.addTab(tabLayout.newTab().setText("4-1"));
        tabLayout.addTab(tabLayout.newTab().setText("4-2"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
