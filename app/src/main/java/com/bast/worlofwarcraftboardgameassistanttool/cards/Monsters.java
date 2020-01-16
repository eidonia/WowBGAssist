package com.bast.worlofwarcraftboardgameassistanttool.cards;

public class Monsters {

    int ID;
    int Name;
    int description;
    int greenMonsters;
    int blueMonsters;
    int redMonsters;

    int greenThreat;
    int blueThreat;
    int redThreat;

    int greenAttack;
    int blueAttack;
    int redAttack;

    int greenHealth;
    int blueHealth;
    int redHealth;

    public Monsters(int ID, int Name, int description, int greenMonsters, int blueMonsters, int redMonsters, int greenThreat, int blueThreat, int redThreat, int greenAttack, int blueAttack, int redAttack, int greenHealth, int blueHealth, int redHealth) {
        this.ID = ID;
        this.Name = Name;
        this.description = description;
        this.greenMonsters = greenMonsters;
        this.blueMonsters = blueMonsters;
        this.redMonsters = redMonsters;
        this.greenThreat = greenThreat;
        this.blueThreat = blueThreat;
        this.redThreat = redThreat;
        this.greenAttack = greenAttack;
        this.blueAttack = blueAttack;
        this.redAttack = redAttack;
        this.greenHealth = greenHealth;
        this.blueHealth = blueHealth;
        this.redHealth = redHealth;

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

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }


    public int getGreenMonsters() {
        return greenMonsters;
    }

    public void setGreenMonsters(int greenMonsters) {
        this.greenMonsters = greenMonsters;
    }

    public int getBlueMonsters() {
        return blueMonsters;
    }

    public void setBlueMonsters(int blueMonsters) {
        this.blueMonsters = blueMonsters;
    }

    public int getRedMonsters() {
        return redMonsters;
    }

    public void setRedMonsters(int redMonsters) {
        this.redMonsters = redMonsters;
    }

    public int getGreenThreat() {
        return greenThreat;
    }

    public void setGreenThreat(int greenThreat) {
        this.greenThreat = greenThreat;
    }

    public int getBlueThreat() {
        return blueThreat;
    }

    public void setBlueThreat(int blueThreat) {
        this.blueThreat = blueThreat;
    }

    public int getRedThreat() {
        return redThreat;
    }

    public void setRedThreat(int redThreat) {
        this.redThreat = redThreat;
    }

    public int getGreenAttack() {
        return greenAttack;
    }

    public void setGreenAttack(int greenAttack) {
        this.greenAttack = greenAttack;
    }

    public int getBlueAttack() {
        return blueAttack;
    }

    public void setBlueAttack(int blueAttack) {
        this.blueAttack = blueAttack;
    }

    public int getRedAttack() {
        return redAttack;
    }

    public void setRedAttack(int redAttack) {
        this.redAttack = redAttack;
    }

    public int getGreenHealth() {
        return greenHealth;
    }

    public void setGreenHealth(int greenHealth) {
        this.greenHealth = greenHealth;
    }

    public int getBlueHealth() {
        return blueHealth;
    }

    public void setBlueHealth(int blueHealth) {
        this.blueHealth = blueHealth;
    }

    public int getRedHealth() {
        return redHealth;
    }

    public void setRedHealth(int redHealth) {
        this.redHealth = redHealth;
    }
}
