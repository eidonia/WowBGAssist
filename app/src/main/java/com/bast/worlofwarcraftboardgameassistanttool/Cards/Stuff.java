package com.bast.worlofwarcraftboardgameassistanttool.Cards;

public class Stuff extends Cards {

    boolean stuffBase;
    String rarity;
    String classStuffBase;
    String description;
    String levelRequired;
    String typeStuff;
    String stringCostStuff;
    String stringEnergyStuff;

    public Stuff(int ID, String Name, int CardImage, String rarity, boolean stuffBase, String classStuffBase, String description, String levelRequired, String typeStuff, String stringCostStuff, String stringEnergyStuff) {
        super(ID, Name, CardImage);
        this.rarity = rarity;
        this.stuffBase = stuffBase;
        this.classStuffBase = classStuffBase;
        this.description = description;
        this.levelRequired = levelRequired;
        this.typeStuff = typeStuff;
        this.stringCostStuff = stringCostStuff;
        this.stringEnergyStuff = stringEnergyStuff;
    }


    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public boolean isStuffBase() {
        return stuffBase;
    }

    public void setStuffBase(boolean stuffBase) {
        this.stuffBase = stuffBase;
    }

    public String getClassStuffBase() {
        return classStuffBase;
    }

    public void setClassStuffBase(String classStuffBase) {
        this.classStuffBase = classStuffBase;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(String levelRequired) {
        this.levelRequired = levelRequired;
    }

    public String getTypeStuff() {
        return typeStuff;
    }

    public void setTypeStuff(String typeStuff) {
        this.typeStuff = typeStuff;
    }

    public String getStringCostStuff() {
        return stringCostStuff;
    }

    public void setStringCostStuff(String stringCostStuff) {
        this.stringCostStuff = stringCostStuff;
    }

    public String getStringEnergyStuff() {
        return stringEnergyStuff;
    }

    public void setStringEnergyStuff(String stringEnergyStuff) {
        this.stringEnergyStuff = stringEnergyStuff;
    }
}
