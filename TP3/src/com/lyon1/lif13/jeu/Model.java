package com.lyon1.lif13.jeu;

public class Model {
    private Plateau board;
    private Joueur[] joueurs;
    private int gameType;
    private int currentPlayer;

    public void playingMoveHuman(int x, int y, int currentPlayer) {
        board.playingMoveHuman(x,y,currentPlayer);
    }

    public void playingMoveIA(int id){
        try {
            Coup attempt = joueurs[id].getCoup(board);
            board.appliquerCoup(attempt,id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public Model(int currentGame, JoueurHumain player, JoueurAleatoire[] ia, int boardSize){
        try {
            board = new Plateau(boardSize,boardSize);
            joueurs = new Joueur[1+ia.length];
            joueurs[0] = player;
            System.arraycopy(ia, 0, joueurs, 1, ia.length);
            gameType = currentGame;
            currentPlayer = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String displayCurrentPlayer() {
        return joueurs[currentPlayer].displayCurrentPlayer();
    }

    public char[][] getBoard() {
        return board.getBoard();
    }
}
