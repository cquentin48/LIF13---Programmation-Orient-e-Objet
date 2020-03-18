package com.lyon1.lif13.jeu;

public class JoueurAleatoire extends Joueur{
    public JoueurAleatoire(int id, String name, String symbol) {
        super(id, name, symbol);
    }

    public static JoueurAleatoire[] initialiseAI(int nbAI) {
        return new JoueurAleatoire[0];
    }

    public Coup getCoup(Plateau etatJeu)throws Exception{
        int i = Tool.randomAttempt(etatJeu.getLongueur()-1,0);
        int j = Tool.randomAttempt(etatJeu.getLargeur()-1,0);
        while(etatJeu.caseOccupe(i,j) == false){
            i = Tool.randomAttempt(etatJeu.getLongueur()-1,0);
            j = Tool.randomAttempt(etatJeu.getLargeur()-1,0);
        }
        return new Coup(i,j);
    }

    @Override
    public String displayCurrentPlayer() {
        return "Joueur n°"+id+" : "+name + "(IA)";
    }

}
