package com.bast.worlofwarcraftboardgameassistanttool.DataBase;

import com.bast.worlofwarcraftboardgameassistanttool.Cards.Stuff;

import java.util.List;

public class DatabaseApiService implements CardApiService {

    private List<Stuff> cards = Database.generateCards();

    @Override
    public List<Stuff> getCards() {
        return cards;
    }
}
