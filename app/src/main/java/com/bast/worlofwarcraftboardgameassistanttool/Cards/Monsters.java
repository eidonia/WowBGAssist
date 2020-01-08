package com.bast.worlofwarcraftboardgameassistanttool.Cards;

public class Monsters extends Cards {

    int greenMonsters;
    int blueMonsters;
    int redMonsters;

    String greenThreat;
    String blueThreat;
    String redThreat;

    String greenAttack;
    String blueAttack;
    String redAttack;

    String greenHealth;
    String blueHealth;
    String redHealth;

    Monsters(int ID, String Name, int CardImage, int greenMonsters, int blueMonsters, int redMonsters, String greenThreat, String blueThreat, String redThreat, String greenAttack, String blueAttack, String redAttack, String greenHealth, String blueHealth, String redHealth) {
        super(ID, Name, CardImage);
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

    public String getGreenThreat() {
        return greenThreat;
    }

    public void setGreenThreat(String greenThreat) {
        this.greenThreat = greenThreat;
    }

    public String getBlueThreat() {
        return blueThreat;
    }

    public void setBlueThreat(String blueThreat) {
        this.blueThreat = blueThreat;
    }

    public String getRedThreat() {
        return redThreat;
    }

    public void setRedThreat(String redThreat) {
        this.redThreat = redThreat;
    }

    public String getGreenAttack() {
        return greenAttack;
    }

    public void setGreenAttack(String greenAttack) {
        this.greenAttack = greenAttack;
    }

    public String getBlueAttack() {
        return blueAttack;
    }

    public void setBlueAttack(String blueAttack) {
        this.blueAttack = blueAttack;
    }

    public String getRedAttack() {
        return redAttack;
    }

    public void setRedAttack(String redAttack) {
        this.redAttack = redAttack;
    }

    public String getGreenHealth() {
        return greenHealth;
    }

    public void setGreenHealth(String greenHealth) {
        this.greenHealth = greenHealth;
    }

    public String getBlueHealth() {
        return blueHealth;
    }

    public void setBlueHealth(String blueHealth) {
        this.blueHealth = blueHealth;
    }

    public String getRedHealth() {
        return redHealth;
    }

    public void setRedHealth(String redHealth) {
        this.redHealth = redHealth;
    }
}
