package com.bast.worlofwarcraftboardgameassistanttool.cards;

public class Talent extends Cards {

    int levelRequired;
    int description;

    Talent(int ID, int Name, int CardImage, int levelRequired, int description) {
        super(ID, Name, CardImage);
         this.levelRequired = levelRequired;
         this.description = description;
    }
}
