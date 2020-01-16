package com.bast.worlofwarcraftboardgameassistanttool.monsters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.bast.worlofwarcraftboardgameassistanttool.R;
import com.bast.worlofwarcraftboardgameassistanttool.cards.Monsters;
import com.bast.worlofwarcraftboardgameassistanttool.dataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.di.Di;
import com.bast.worlofwarcraftboardgameassistanttool.utils.TabPageAdaptater;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class MonstersPage extends AppCompatActivity {

    Toolbar toolbar;
    CardApiService apiService;
    List<Monsters> mMonsters;
    Monsters monster;
    ViewPager viewPager;
    TabLayout tabs;
    TabPageAdaptater tabPageAdaptater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters_page);
        Intent intent = getIntent();
        int itemPos = intent.getIntExtra("POSMON", 0);
        apiService = Di.getCardApiService();
        mMonsters = apiService.getMonsters();
        monster = mMonsters.get(itemPos);

        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.container);
        tabs = findViewById(R.id.tabs);

        toolbar.setTitle(monster.getName());
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MonstersPage.this.finish();
            }
        });

        tabPageAdaptater = new TabPageAdaptater(getSupportFragmentManager(), "Monsters");
        viewPager.setAdapter(tabPageAdaptater);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
        tabs.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
    }
}