package com.bast.worlofwarcraftboardgameassistanttool.Cards;

public class Stuff extends Cards {

    boolean stuffBase;
    String classStuffBase;
    String description;
    String levelRequired;
    String typeStuff;
    int imageCostStuff;
    int imageCostEnergyStuff;
    String stringCostStuff;
    String stringEnergyStuff;

    Stuff(int ID, String Name, int CardImage, boolean stuffBase, String classStuffBase, String description, String levelRequired, String typeStuff, int imageCostStuff, int imageCostEnergyStuff, String stringCostStuff, String stringEnergyStuff) {
        super(ID, Name, CardImage);
        this.stuffBase = stuffBase;
        this.classStuffBase = classStuffBase;
        this.description = description;
        this.levelRequired = levelRequired;
        this.typeStuff = typeStuff;
        this.imageCostStuff = imageCostStuff;
        this.imageCostEnergyStuff = imageCostEnergyStuff;
        this.stringCostStuff = stringCostStuff;
        this.stringEnergyStuff = stringEnergyStuff;
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

    public int getImageCostStuff() {
        return imageCostStuff;
    }

    public void setImageCostStuff(int imageCostStuff) {
        this.imageCostStuff = imageCostStuff;
    }

    public int getImageCostEnergyStuff() {
        return imageCostEnergyStuff;
    }

    public void setImageCostEnergyStuff(int imageCostEnergyStuff) {
        this.imageCostEnergyStuff = imageCostEnergyStuff;
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
