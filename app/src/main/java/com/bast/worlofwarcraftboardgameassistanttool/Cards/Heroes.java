package com.bast.worlofwarcraftboardgameassistanttool.Cards;

import java.util.ArrayList;

public class Heroes extends Cards{
    int classHero;
    ArrayList stuff;
    int boardGame;

    Heroes(int ID, int Name, int CardImage, int classHero, ArrayList stuff, int boardGame) {
        super(ID, Name, CardImage);
        this.classHero = classHero;
        this.stuff = stuff;
        this.boardGame = boardGame;
    }

    public int getClassHero() {
        return classHero;
    }

    public void setClassHero(int classHero) {
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
