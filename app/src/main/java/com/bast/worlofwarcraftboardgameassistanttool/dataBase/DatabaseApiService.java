package com.bast.worlofwarcraftboardgameassistanttool.dataBase;

import com.bast.worlofwarcraftboardgameassistanttool.cards.Monsters;
import com.bast.worlofwarcraftboardgameassistanttool.cards.Stuff;

import java.util.List;

public class DatabaseApiService implements CardApiService {

    private List<Stuff> cards = Database.generateCards();
    private List<Monsters> monsters = Database.generateMonsters();

    @Override
    public List<Stuff> getCards() {
        return cards;
    }

    @Override
    public List<Monsters> getMonsters() {
        return monsters;
    }
}
