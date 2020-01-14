package com.bast.worlofwarcraftboardgameassistanttool.Cards;

public class Spell extends Cards {
    int levelRequiredSpell;
    int Description;
    int imageCost;
    int imageEnergyCost;
    int intCost;
    int intEnergyCost;


    public Spell(int ID, int Name, int CardImage, int levelRequiredSpell, int Description, int imageCost, int imageEnergyCost, int intCost, int intEnergyCost) {
        super(ID, Name, CardImage);
        this.levelRequiredSpell = levelRequiredSpell;
        this.Description = Description;
        this.imageCost = imageCost;
        this.imageEnergyCost = imageEnergyCost;
        this.intCost = intCost;
        this.intEnergyCost = intEnergyCost;
    }

    public int getLevelRequiredSpell() {
        return levelRequiredSpell;
    }

    public void setLevelRequiredSpell(int levelRequiredSpell) {
        this.levelRequiredSpell = levelRequiredSpell;
    }

    public int getDescription() {
        return Description;
    }

    public void setDescription(int description) {
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

    public int getintCost() {
        return intCost;
    }

    public void setintCost(int intCost) {
        this.intCost = intCost;
    }

    public int getintEnergyCost() {
        return intEnergyCost;
    }

    public void setintEnergyCost(int intEnergyCost) {
        this.intEnergyCost = intEnergyCost;
    }
}
