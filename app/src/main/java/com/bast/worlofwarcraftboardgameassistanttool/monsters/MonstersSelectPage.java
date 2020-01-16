package com.bast.worlofwarcraftboardgameassistanttool.monsters;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bast.worlofwarcraftboardgameassistanttool.R;
import com.bast.worlofwarcraftboardgameassistanttool.cards.Monsters;
import com.bast.worlofwarcraftboardgameassistanttool.dataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.databinding.ActivityMonstersSelectPageBinding;
import com.bast.worlofwarcraftboardgameassistanttool.di.Di;

import java.util.List;

public class MonstersSelectPage extends AppCompatActivity {

    ActivityMonstersSelectPageBinding binding;
    CardApiService mDatabase;
    List<Monsters> mMonsters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMonstersSelectPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mDatabase = Di.getCardApiService();
        binding.rvMonsters.setLayoutManager(new LinearLayoutManager(this));
        binding.rvMonsters.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        getSupportActionBar().setTitle(R.string.MonsterSelectPage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initlist();

    }

    private void initlist() {
        mMonsters = mDatabase.getMonsters();
        binding.rvMonsters.setAdapter(new MonsterRViewAdapter(mMonsters));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
