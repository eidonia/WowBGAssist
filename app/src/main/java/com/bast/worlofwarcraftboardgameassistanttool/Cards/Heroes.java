package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import java.util.ArrayList;

public class Heroes extends Cards{
    String classHero;
    ArrayList stuff;
    int boardGame;

    Heroes(int ID, String Name, int CardImage, String classHero, ArrayList stuff, int boardGame) {
        super(ID, Name, CardImage);
        this.classHero = classHero;
        this.stuff = stuff;
        this.boardGame = boardGame;
    }

    public String getClassHero() {
        return classHero;
    }

    public void setClassHero(String classHero) {
        this.classHero = classHero;
    }

    public ArrayList getStuff() {
        return stuff;
    }

    public void setStuff(ArrayList stuff) {
        this.stuff = stuff;
    }

    public int getBoardGame() {
        return boardGame;
    }

    public void setBoardGame(int boardGame) {
        this.boardGame = boardGame;
    }
}
