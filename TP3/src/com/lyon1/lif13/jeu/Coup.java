package com.lyon1.lif13.jeu;

public class Coup {
    private int x;
    private int y;

    public Coup(int _x, int _y) throws Exception{
        if(_x<0 || _y <0){
            throw new Exception("Un coup doit avoir une abscisse et une ordonnée positive ou nulle!");
        }
        x = _x;
        y = _y;
    }

    public Coup(){
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
