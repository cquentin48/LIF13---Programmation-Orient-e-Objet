package com.lyon1.lif13.jeu;

public class JoueurAleatoire extends Joueur{
    public JoueurAleatoire(int _id) {
        super(_id);
    }

    public Coup getCoup(Plateau etatJeu)throws Exception{
        int i = Tool.randomAttempt(etatJeu.getLongueur(),0);
        int j = Tool.randomAttempt(etatJeu.getLargeur(),0);
        while(etatJeu.caseOccupe(i,j) == false){
            i = Tool.randomAttempt(etatJeu.getLongueur(),0);
            j = Tool.randomAttempt(etatJeu.getLargeur(),0);
        }
        return new Coup(i,j);
    }

}
