package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import android.media.Image;

public class Cards {

    int ID;
    String Name;
    int CardImage;

    Cards(int ID, String Name, int CardImage) {
        this.ID = ID;
        this.Name = Name;
        this.CardImage = CardImage;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCardImage() {
        return CardImage;
    }

    public void setCardImage(int cardImage) {
        CardImage = cardImage;
    }
}
