package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import android.util.Pair;

import java.util.ArrayList;

public class Event extends Cards {

    int description;
    ArrayList<Pair<Integer, String>> monstersDescription;
    int goldEvent;
    int expEvent;
    int stuffEvent;
    int intGoldEvent;
    int intExpEvent;
    int intStuffEvent;
    int uniqueStuffReward;

    Event(int ID, int Name, int CardImage, int description, ArrayList monstersDescription, int goldEvent, int expEvent, int uniqueStuffReward, int intGoldEvent, int intExpEvent, int intStuffEvent) {
        super(ID, Name, CardImage);
        this.description = description;
        this.monstersDescription = monstersDescription;
        this.goldEvent = goldEvent;
        this.expEvent = expEvent;
        this.uniqueStuffReward = uniqueStuffReward;
        this.intGoldEvent = intGoldEvent;
        this.intExpEvent = intExpEvent;
        this.intStuffEvent = intStuffEvent;

    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
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

    public int getintGoldEvent() {
        return intGoldEvent;
    }

    public void setintGoldEvent(int intGoldEvent) {
        this.intGoldEvent = intGoldEvent;
    }

    public int getintExpEvent() {
        return intExpEvent;
    }

    public void setintExpEvent(int intExpEvent) {
        this.intExpEvent = intExpEvent;
    }

    public int getintStuffEvent() {
        return intStuffEvent;
    }

    public void setintStuffEvent(int intStuffEvent) {
        this.intStuffEvent = intStuffEvent;
    }

    public int getUniqueStuffReward() {
        return uniqueStuffReward;
    }

    public void setUniqueStuffReward(int uniqueStuffReward) {
        this.uniqueStuffReward = uniqueStuffReward;
    }
}
