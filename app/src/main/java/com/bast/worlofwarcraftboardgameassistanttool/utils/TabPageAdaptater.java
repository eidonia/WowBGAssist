package com.bast.worlofwarcraftboardgameassistanttool.utils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.bast.worlofwarcraftboardgameassistanttool.cardspage.ImageFragment;
import com.bast.worlofwarcraftboardgameassistanttool.cardspage.InfoFragment;
import com.bast.worlofwarcraftboardgameassistanttool.monsters.MonsterFragment;

public class TabPageAdaptater extends FragmentPagerAdapter {

    String type;

    public TabPageAdaptater(FragmentManager fm, String type) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.type = type;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (type == "Cards") {
            switch (position) {
                case 0:
                    fragment = ImageFragment.newInstance();
                    break;
                case 1:
                    fragment = InfoFragment.newInstance();
                    break;
            }
        } else if (type == "Monsters") {
            switch (position) {
                case 0:
                    fragment = MonsterFragment.newInstance("Green");
                    break;
                case 1:
                    fragment = MonsterFragment.newInstance("Red");
                    break;
                case 2:
                    fragment = MonsterFragment.newInstance("Blue");
                    break;
            }
        }
        return fragment;
    }

    @Override
    public int getCount() {
        int count = 0;
        if (type == "Cards") {
            count = 2;
        } else if (type == "Monsters") {
            count = 3;
        }
        return count;
    }
}
