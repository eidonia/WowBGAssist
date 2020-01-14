package com.bast.worlofwarcraftboardgameassistanttool.Cardspage;

import android.content.Intent;
import android.os.Bundle;

import com.bast.worlofwarcraftboardgameassistanttool.Cards.Stuff;
import com.bast.worlofwarcraftboardgameassistanttool.DataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.Di.Di;
import com.bast.worlofwarcraftboardgameassistanttool.R;
import com.bast.worlofwarcraftboardgameassistanttool.Utils.TabPageAdaptater;
import com.bast.worlofwarcraftboardgameassistanttool.databinding.ActivityCardPagesDescBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;

public class CardPagesDesc extends AppCompatActivity {

    List<Stuff> mCards;
    CardApiService apiService;
    Stuff stuff;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabs;

    public TabPageAdaptater tabPageAdaptater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_pages_desc);

        Intent intent = getIntent();
        int itemPos = intent.getIntExtra("POS", 0);
        apiService = Di.getCardApiService();
        mCards = apiService.getCards();
        //stuff = new Stuff(45, "COUCOU", 2, "blop", false, null, "Kointe", "2", "Green", "5", "10" );
        stuff = mCards.get(itemPos);

        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.container);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(stuff.getName());
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CardPagesDesc.this.finish();
            }
        });

        tabPageAdaptater = new TabPageAdaptater(getSupportFragmentManager());
        viewPager.setAdapter(tabPageAdaptater);
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener(tabs));
        tabs.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));



        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}