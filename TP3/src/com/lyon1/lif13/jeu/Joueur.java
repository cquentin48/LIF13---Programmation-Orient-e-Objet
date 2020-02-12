package com.lyon1.lif13.jeu;

public abstract class Joueur {
    private int id;

    public Joueur(int _id){
        id = _id;
    }

    public int getId() {return id;}

    public abstract Coup getCoup(Plateau etatJeu)throws Exception;
}
