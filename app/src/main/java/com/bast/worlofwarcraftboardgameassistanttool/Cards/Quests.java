package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import android.util.Pair;

import java.util.ArrayList;

public class Quests extends Cards {

    String levelColor;
    String levelRequired;
    ArrayList<Pair<Integer, String>> monstersDescription;
    String description;
    int goldQuest;
    int expQuest;
    int stuffQuest;
    String stringGoldQuest;
    String stringExpQuest;
    String stringStuffQuest;
    String uniqueRewardStuff;

    Quests(int ID, String Name, int CardImage, String levelColor, String levelRequired, ArrayList monstersDescription, String description, int goldQuest, int expQuest, int stuffQuest, String stringGoldQuest, String stringExpQuest, String stringStuffQuest, String uniqueRewardStuff) {
        super(ID, Name, CardImage);
        this.levelColor = levelColor;
        this.levelRequired = levelRequired;
        this.monstersDescription = monstersDescription;
        this.description = description;
        this.goldQuest = goldQuest;
        this.expQuest = expQuest;
        this.stuffQuest = stuffQuest;
        this.stringGoldQuest = stringGoldQuest;
        this.stringExpQuest = stringExpQuest;
        this.stringStuffQuest = stringStuffQuest;
        this.uniqueRewardStuff = uniqueRewardStuff;
    }

    public String getLevelColor() {
        return levelColor;
    }

    public void setLevelColor(String levelColor) {
        this.levelColor = levelColor;
    }

    public String getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(String levelRequired) {
        this.levelRequired = levelRequired;
    }

    public ArrayList<Pair<Integer, String>> getMonstersDescription() {
        return monstersDescription;
    }

    public void setMonstersDescription(ArrayList<Pair<Integer, String>> monstersDescription) {
        this.monstersDescription = monstersDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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

    public String getStringGoldQuest() {
        return stringGoldQuest;
    }

    public void setStringGoldQuest(String stringGoldQuest) {
        this.stringGoldQuest = stringGoldQuest;
    }

    public String getStringExpQuest() {
        return stringExpQuest;
    }

    public void setStringExpQuest(String stringExpQuest) {
        this.stringExpQuest = stringExpQuest;
    }

    public String getStringStuffQuest() {
        return stringStuffQuest;
    }

    public void setStringStuffQuest(String stringStuffQuest) {
        this.stringStuffQuest = stringStuffQuest;
    }

    public String getUniqueRewardStuff() {
        return uniqueRewardStuff;
    }

    public void setUniqueRewardStuff(String uniqueRewardStuff) {
        this.uniqueRewardStuff = uniqueRewardStuff;
    }
}
