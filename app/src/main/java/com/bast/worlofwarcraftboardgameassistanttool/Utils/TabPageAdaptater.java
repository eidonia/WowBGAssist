package com.bast.worlofwarcraftboardgameassistanttool.Utils;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.bast.worlofwarcraftboardgameassistanttool.Cardspage.ImageFragment;
import com.bast.worlofwarcraftboardgameassistanttool.Cardspage.InfoFragment;

public class TabPageAdaptater extends FragmentPagerAdapter {
    public TabPageAdaptater(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = ImageFragment.newInstance();
                break;
            case 1:
                fragment = InfoFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
