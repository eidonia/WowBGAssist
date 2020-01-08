package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import android.util.Pair;

import java.util.ArrayList;

public class Event extends Cards {

    String description;
    ArrayList<Pair<Integer, String>> monstersDescription;
    int goldEvent;
    int expEvent;
    int stuffEvent;
    String stringGoldEvent;
    String stringExpEvent;
    String stringStuffEvent;
    String uniqueStuffReward;

    Event(int ID, String Name, int CardImage, String description, ArrayList monstersDescription, int goldEvent, int expEvent, String uniqueStuffReward, String stringGoldEvent, String stringExpEvent, String stringStuffEvent) {
        super(ID, Name, CardImage);
        this.description = description;
        this.monstersDescription = monstersDescription;
        this.goldEvent = goldEvent;
        this.expEvent = expEvent;
        this.uniqueStuffReward = uniqueStuffReward;
        this.stringGoldEvent = stringGoldEvent;
        this.stringExpEvent = stringExpEvent;
        this.stringStuffEvent = stringStuffEvent;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Pair<Integer, String>> getMonstersDescription() {
        return monstersDescription;
    }

    public void setMonstersDescription(ArrayList<Pair<Integer, String>> monstersDescription) {
        this.monstersDescription = monstersDescription;
    }

    public int getGoldEvent() {
        return goldEvent;
    }

    public void setGoldEvent(int goldEvent) {
        this.goldEvent = goldEvent;
    }

    public int getExpEvent() {
        return expEvent;
    }

    public void setExpEvent(int expEvent) {
        this.expEvent = expEvent;
    }

    public int getStuffEvent() {
        return stuffEvent;
    }

    public void setStuffEvent(int stuffEvent) {
        this.stuffEvent = stuffEvent;
    }

    public String getStringGoldEvent() {
        return stringGoldEvent;
    }

    public void setStringGoldEvent(String stringGoldEvent) {
        this.stringGoldEvent = stringGoldEvent;
    }

    public String getStringExpEvent() {
        return stringExpEvent;
    }

    public void setStringExpEvent(String stringExpEvent) {
        this.stringExpEvent = stringExpEvent;
    }

    public String getStringStuffEvent() {
        return stringStuffEvent;
    }

    public void setStringStuffEvent(String stringStuffEvent) {
        this.stringStuffEvent = stringStuffEvent;
    }

    public String getUniqueStuffReward() {
        return uniqueStuffReward;
    }

    public void setUniqueStuffReward(String uniqueStuffReward) {
        this.uniqueStuffReward = uniqueStuffReward;
    }
}
