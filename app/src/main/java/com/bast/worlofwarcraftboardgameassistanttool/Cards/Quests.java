package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import android.util.Pair;

import java.util.ArrayList;

public class Quests extends Cards {

    int levelColor;
    int levelRequired;
    ArrayList<Pair<Integer, String>> monstersDescription;
    int description;
    int goldQuest;
    int expQuest;
    int stuffQuest;
    int intGoldQuest;
    int intExpQuest;
    int intStuffQuest;
    int uniqueRewardStuff;

    Quests(int ID, int Name, int CardImage, int levelColor, int levelRequired, ArrayList monstersDescription, int description, int goldQuest, int expQuest, int stuffQuest, int intGoldQuest, int intExpQuest, int intStuffQuest, int uniqueRewardStuff) {
        super(ID, Name, CardImage);
        this.levelColor = levelColor;
        this.levelRequired = levelRequired;
        this.monstersDescription = monstersDescription;
        this.description = description;
        this.goldQuest = goldQuest;
        this.expQuest = expQuest;
        this.stuffQuest = stuffQuest;
        this.intGoldQuest = intGoldQuest;
        this.intExpQuest = intExpQuest;
        this.intStuffQuest = intStuffQuest;
        this.uniqueRewardStuff = uniqueRewardStuff;
    }

    public int getLevelColor() {
        return levelColor;
    }

    public void setLevelColor(int levelColor) {
        this.levelColor = levelColor;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(int levelRequired) {
        this.levelRequired = levelRequired;
    }

    public ArrayList<Pair<Integer, String>> getMonstersDescription() {
        return monstersDescription;
    }

    public void setMonstersDescription(ArrayList<Pair<Integer, String>> monstersDescription) {
        this.monstersDescription = monstersDescription;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getGoldQuest() {
        return goldQuest;
    }

    public void setGoldQuest(int goldQuest) {
        this.goldQuest = goldQuest;
    }

    public int getExpQuest() {
        return expQuest;
    }

    public void setExpQuest(int expQuest) {
        this.expQuest = expQuest;
    }

    public int getStuffQuest() {
        return stuffQuest;
    }

    public void setStuffQuest(int stuffQuest) {
        this.stuffQuest = stuffQuest;
    }

    public int getintGoldQuest() {
        return intGoldQuest;
    }

    public void setintGoldQuest(int intGoldQuest) {
        this.intGoldQuest = intGoldQuest;
    }

    public int getintExpQuest() {
        return intExpQuest;
    }

    public void setintExpQuest(int intExpQuest) {
        this.intExpQuest = intExpQuest;
    }

    public int getintStuffQuest() {
        return intStuffQuest;
    }

    public void setintStuffQuest(int intStuffQuest) {
        this.intStuffQuest = intStuffQuest;
    }

    public int getUniqueRewardStuff() {
        return uniqueRewardStuff;
    }

    public void setUniqueRewardStuff(int uniqueRewardStuff) {
        this.uniqueRewardStuff = uniqueRewardStuff;
    }
}
