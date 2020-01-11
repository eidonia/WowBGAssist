package com.bast.worlofwarcraftboardgameassistanttool.Cards;

public class Spell extends Cards {
    String levelRequiredSpell;
    String Description;
    int imageCost;
    int imageEnergyCost;
    String stringCost;
    String stringEnergyCost;


    public Spell(int ID, String Name, int CardImage, String levelRequiredSpell, String Description, int imageCost, int imageEnergyCost, String stringCost, String stringEnergyCost) {
        super(ID, Name, CardImage);
        this.levelRequiredSpell = levelRequiredSpell;
        this.Description = Description;
        this.imageCost = imageCost;
        this.imageEnergyCost = imageEnergyCost;
        this.stringCost = stringCost;
        this.stringEnergyCost = stringEnergyCost;
    }

    public String getLevelRequiredSpell() {
        return levelRequiredSpell;
    }

    public void setLevelRequiredSpell(String levelRequiredSpell) {
        this.levelRequiredSpell = levelRequiredSpell;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImageCost() {
        return imageCost;
    }

    public void setImageCost(int imageCost) {
        this.imageCost = imageCost;
    }

    public int getImageEnergyCost() {
        return imageEnergyCost;
    }

    public void setImageEnergyCost(int imageEnergyCost) {
        this.imageEnergyCost = imageEnergyCost;
    }

    public String getStringCost() {
        return stringCost;
    }

    public void setStringCost(String stringCost) {
        this.stringCost = stringCost;
    }

    public String getStringEnergyCost() {
        return stringEnergyCost;
    }

    public void setStringEnergyCost(String stringEnergyCost) {
        this.stringEnergyCost = stringEnergyCost;
    }
}
