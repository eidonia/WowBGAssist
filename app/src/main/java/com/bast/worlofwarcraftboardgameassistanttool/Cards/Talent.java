package com.bast.worlofwarcraftboardgameassistanttool.Cards;

public class Talent extends Cards {

    String levelRequired;
    String description;

    Talent(int ID, String Name, int CardImage, String levelRequired, String description) {
        super(ID, Name, CardImage);
         this.levelRequired = levelRequired;
         this.description = description;
    }
}
