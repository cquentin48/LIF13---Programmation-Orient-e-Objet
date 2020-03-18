package com.lyon1.lif13.controller;

import com.lyon1.lif13.jeu.Model;

/**
 * Base controller class used for the project
 */
public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void playingMoveHuman(int x, int y, int currentPlayer) {
        model.playingMoveHuman(x,y,currentPlayer);
    }

    public void playingMoveAI(int currentPlayer) {
        model.playingMoveIA(currentPlayer);
    }

    public String displayCurrentPlayer() {
        return model.displayCurrentPlayer();
    }

    public char[][] getBoard() {
        return model.getBoard();
    }
}
