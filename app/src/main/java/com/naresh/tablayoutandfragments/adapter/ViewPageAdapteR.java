package com.naresh.tablayoutandfragments.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapteR extends FragmentPagerAdapter {
    private List<Fragment> fragmentList= new ArrayList<>();
    private List<String>fragmenttitle= new ArrayList<>();

    public ViewPageAdapteR(@NonNull FragmentManager fm) {
        super(fm);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmenttitle.get(position);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount()  {
        return fragmentList.size();
    }
    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        fragmenttitle.add(title);
    }
}
