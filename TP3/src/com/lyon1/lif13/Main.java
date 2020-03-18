package com.lyon1.lif13;


import com.lyon1.lif13.controller.Controller;
import com.lyon1.lif13.jeu.JoueurAleatoire;
import com.lyon1.lif13.jeu.JoueurHumain;
import com.lyon1.lif13.jeu.Model;
import com.lyon1.lif13.view.DisplayBoard;

public class Main {
    public static Model managingArgs(String[] args){
        int nbAI = 1;
        int gameType = 1;
        int boardSize = 3;

        for (String singleArgument : args) {
            if(singleArgument.contains("--nb-ai")){
                nbAI = Integer.parseInt(singleArgument.substring("--nb-ai".length()));
            }
            if(singleArgument.contains("--game-type")){
                gameType = Integer.parseInt(singleArgument.substring("--game-type".length()));
            }
            if(singleArgument.contains("--board-size")){
                boardSize = Integer.parseInt(singleArgument.substring("--board-size".length()));
            }
        }
        return new Model(gameType, JoueurHumain.initialisePlayer(), JoueurAleatoire.initialiseAI(nbAI),boardSize);
    }
    public static void main(String[] args) {
        Model model;
        if(args.length<2) {
            model = managingArgs(args);
            /*try {
                Plateau plateau = new Plateau(3, 3);
                JoueurAleatoire j1 = new JoueurAleatoire(1,'X');
                JoueurAleatoire j2 = new JoueurAleatoire(2,'O');
                for (int i = 0; i < 8; i++) {
                    plateau.appliquerCoup(j1.getCoup(plateau),'X');
                    plateau.displayPlateau();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }else{
            model = managingArgs(args);
            /*try {
                Plateau plateau = new Plateau(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                JoueurAleatoire j1 = new JoueurAleatoire(1,'X');
                JoueurAleatoire j2 = new JoueurAleatoire(2,'O');
                System.out.println("Nombre d'essais : "+(Integer.parseInt(args[0])*Integer.parseInt(args[0])-3));
                for (int i = 0; i < Integer.parseInt(args[0])*Integer.parseInt(args[0])-3; i++) {
                    int id = Tool.randomAttempt(j2.getId(), j1.getId());

                    if(id == 1){

                    }
                    plateau.appliquerCoup(j1.getCoup(plateau), Tool.randomAttempt(j2.getId(), j1.getId()));
                    plateau.displayPlateau();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }
        Controller controller = new Controller(model);
        DisplayBoard board = new DisplayBoard(controller);
        board.managingAction();
    }
}
