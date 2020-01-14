package com.bast.worlofwarcraftboardgameassistanttool.Cards;

public class Talent extends Cards {

    int levelRequired;
    int description;

    Talent(int ID, int Name, int CardImage, int levelRequired, int description) {
        super(ID, Name, CardImage);
         this.levelRequired = levelRequired;
         this.description = description;
    }
}
