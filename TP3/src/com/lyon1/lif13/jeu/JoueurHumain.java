package com.lyon1.lif13.jeu;

public class JoueurHumain extends Joueur {

    public JoueurHumain(int id, String name, String symbol) {
        super(id, name, symbol);
    }

    public static JoueurHumain initialisePlayer() {
        return new JoueurHumain(0,"Humain","X");
    }

    @Override
    public Coup getCoup(Plateau etatJeu) throws Exception {throw new Exception("Un joueur humain jouera par une autre fonction!");}

    @Override
    public String displayCurrentPlayer() {
        return "Joueur n°"+id+" : "+name + "(Humain)";
    }
}
