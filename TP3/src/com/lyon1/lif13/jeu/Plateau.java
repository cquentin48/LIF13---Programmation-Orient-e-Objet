package com.lyon1.lif13.jeu;

import java.util.Arrays;

public class Plateau {
    private int longueur;
    private int largeur;
    private int[][] etatPlateau;

    public Plateau(int _longueur, int _largeur) throws Exception {
        if(_largeur<=0 || _longueur<= 0){
            throw new Exception("Un plateau doit avoir une longeur et une largeur strictement positive!");
        }
        longueur = _longueur;
        largeur = _largeur;
        etatPlateau = new int [longueur][largeur];
        for(int[] line : etatPlateau){
            for(int singleCase : line){
                singleCase = 0;
            }
        }
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public boolean caseOccupe(int i, int j){return etatPlateau[i][j]==0;}

    @Override
    public String toString() {
        return "Plateau{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", etatPlateau=" + Arrays.toString(etatPlateau) +
                '}';
    }
}
