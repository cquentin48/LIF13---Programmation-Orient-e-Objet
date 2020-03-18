package com.lyon1.lif13.jeu;

public abstract class Joueur {
    protected int id;
    protected String name;
    protected String symbol;

    public Joueur(int id, String name, String symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public int getId() {return id;}

    public abstract Coup getCoup(Plateau etatJeu)throws Exception;

    public abstract String displayCurrentPlayer();
}
