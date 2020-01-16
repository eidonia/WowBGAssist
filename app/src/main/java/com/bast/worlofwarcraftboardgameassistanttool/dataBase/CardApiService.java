package com.bast.worlofwarcraftboardgameassistanttool.dataBase;

import com.bast.worlofwarcraftboardgameassistanttool.cards.Monsters;
import com.bast.worlofwarcraftboardgameassistanttool.cards.Stuff;

import java.util.List;

public interface CardApiService {

    List<Stuff> getCards();

    List<Monsters> getMonsters();



}
