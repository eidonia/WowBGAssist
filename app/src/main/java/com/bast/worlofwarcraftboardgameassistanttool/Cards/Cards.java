package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import android.media.Image;

public class Cards {

    int ID;
    int Name;
    int CardImage;

    Cards(int ID, int Name, int CardImage) {
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

    public int getName() {
        return Name;
    }

    public void setName(int name) {
        Name = name;
    }

    public int getCardImage() {
        return CardImage;
    }

    public void setCardImage(int cardImage) {
        CardImage = cardImage;
    }
}
