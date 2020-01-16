package com.bast.worlofwarcraftboardgameassistanttool.cards;

public class Stuff extends Cards {

    boolean stuffBase;
    int rarity;
    int classStuffBase;
    int description;
    int levelRequired;
    int typeStuff;
    int intCostStuff;
    int intEnergyStuff;

    public Stuff(int ID, int Name, int CardImage, int rarity, boolean stuffBase, int classStuffBase, int description, int levelRequired, int typeStuff, int intCostStuff, int intEnergyStuff) {
        super(ID, Name, CardImage);
        this.rarity = rarity;
        this.stuffBase = stuffBase;
        this.classStuffBase = classStuffBase;
        this.description = description;
        this.levelRequired = levelRequired;
        this.typeStuff = typeStuff;
        this.intCostStuff = intCostStuff;
        this.intEnergyStuff = intEnergyStuff;
    }


    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public boolean isStuffBase() {
        return stuffBase;
    }

    public void setStuffBase(boolean stuffBase) {
        this.stuffBase = stuffBase;
    }

    public int getClassStuffBase() {
        return classStuffBase;
    }

    public void setClassStuffBase(int classStuffBase) {
        this.classStuffBase = classStuffBase;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(int levelRequired) {
        this.levelRequired = levelRequired;
    }

    public int getTypeStuff() {
        return typeStuff;
    }

    public void setTypeStuff(int typeStuff) {
        this.typeStuff = typeStuff;
    }

    public int getintCostStuff() {
        return intCostStuff;
    }

    public void setintCostStuff(int intCostStuff) {
        this.intCostStuff = intCostStuff;
    }

    public int getintEnergyStuff() {
        return intEnergyStuff;
    }

    public void setintEnergyStuff(int intEnergyStuff) {
        this.intEnergyStuff = intEnergyStuff;
    }
}
