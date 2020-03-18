package com.lyon1.lif13.jeu;

import java.util.Arrays;

public class Plateau {
    private int longueur;
    private int largeur;
    private char[][] etatPlateau;

    public Plateau(int _longueur, int _largeur) throws Exception {
        if(_largeur<=0 || _longueur<= 0){
            throw new Exception("Un plateau doit avoir une longeur et une largeur strictement positive!");
        }
        longueur = _longueur;
        largeur = _largeur;
        etatPlateau = new char[longueur][largeur];
        for(char[] line : etatPlateau){
            for(char singleCase : line){
                singleCase = ' ';
            }
        }
    }

    public void appliquerCoup(Coup coup, char symbol){
        etatPlateau[coup.getX()][coup.getY()] = symbol;
    }

    public void displayPlateau(){
        for(char[] line : etatPlateau){
            for(char cell:line){
                System.out.print(" "+cell+" ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println();
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public boolean caseOccupe(int i, int j){return etatPlateau[i][j] == ' ';}

    @Override
    public String toString() {
        return "Plateau{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", etatPlateau=" + Arrays.toString(etatPlateau) +
                '}';
    }

    public int playingMoveHuman(int x, int y, char playerSymbol) {
        if(!caseOccupe(x,y)){
            try {
                appliquerCoup(new Coup(x,y),playerSymbol);
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                return 1;
            }
        }else{
            System.out.println("Cette case est déjà occupée!");
            return 1;
        }
    }

    public char[][] getBoard() {
        return etatPlateau;
    }
}
