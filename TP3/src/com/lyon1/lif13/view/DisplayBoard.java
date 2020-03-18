package com.lyon1.lif13.view;

import com.lyon1.lif13.controller.Controller;

/**
 * Display board view class
 * @author quentin
 * @version 0.5
 */
public class DisplayBoard {

    /**
     * Controller used to manage view functions linked model
     */
    private Controller controller;

    /**
     * Displaying board
     */
    private void displayBoard(){
        char[][] board = controller.getBoard();
        for (char[] boardLine : board) {
            int length = boardLine.length;
            System.out.print("*");
            for(int i = 0;i<length;i++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
            System.out.print("|");
            for (char attempt : boardLine) {
                System.out.print(attempt+"|");
            }
        }
        int length = board[0].length;
        System.out.print("*");
        for(int i = 0;i<length;i++){
            System.out.print("-");
        }
        System.out.print("*");
        System.out.println();
        System.out.print("|");
    }

    /**
     * Function managing players move
     * @param x line clicked by the user
     * @param y column clicked by the user
     * @param currentPlayer 0 -> human
     * @param currentPlayer 1..n -> AI
     */
    private void playingMove(int x, int y, int currentPlayer){
        if(currentPlayer != 0){
            controller.playingMoveAI(currentPlayer);
        }else {
            controller.playingMoveHuman(x, y, currentPlayer);
        }
    }

    public void managingAction(){
        int action = -1;
        while(action != 4) {
            System.out.println("Joueur en cours : "+controller.displayCurrentPlayer());
            System.out.println("*----------[Actions possibles]-------------*");
            System.out.println("1->Afficher le plateau");
            System.out.println("2->Jouer un coup");
            System.out.println("3->Nouvelle partie...");
            System.out.println("4->Quitter...");

            switch (action) {
                case 1: {

                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    System.out.println("Fin de la partie!");
                    break;
                }
            }
        }
    }

    public DisplayBoard(Controller controller) {
        this.controller = controller;
    }
}
