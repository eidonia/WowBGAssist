package com.bast.worlofwarcraftboardgameassistanttool.cardspage;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.bast.worlofwarcraftboardgameassistanttool.R;
import com.bast.worlofwarcraftboardgameassistanttool.cards.Stuff;
import com.bast.worlofwarcraftboardgameassistanttool.dataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.databinding.ActivityCardspageBinding;
import com.bast.worlofwarcraftboardgameassistanttool.di.Di;

import java.util.List;

public class Cardspage extends AppCompatActivity {

    private CardApiService mDatabase; // J'initialise l'interface de la db
    private List<Stuff> mCards;

    public ActivityCardspageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCardspageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mDatabase = Di.getCardApiService();
        binding.rvCards.setLayoutManager(new GridLayoutManager(this, 5));
        getSupportActionBar().setTitle(R.string.CardsPage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        initlist();

    }

    public void initlist() {
        mCards = mDatabase.getCards();
        binding.rvCards.setAdapter(new RecyclerViewEveryCards(mCards, this));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
