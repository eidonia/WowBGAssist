package com.bast.worlofwarcraftboardgameassistanttool;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bast.worlofwarcraftboardgameassistanttool.cardspage.Cardspage;
import com.bast.worlofwarcraftboardgameassistanttool.databinding.ActivityMainBinding;
import com.bast.worlofwarcraftboardgameassistanttool.monsters.MonstersSelectPage;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, Cardspage.class);
                context.startActivity(intent);
            }
        });

        binding.btnMonsters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, MonstersSelectPage.class);
                context.startActivity(intent);
            }
        });
    }
}
