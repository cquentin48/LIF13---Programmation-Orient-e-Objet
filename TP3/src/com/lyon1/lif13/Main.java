package com.lyon1.lif13;

import com.lyon1.lif13.jeu.Plateau;
import com.lyon1.lif13.jeu.Tool;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(Tool.randomAttempt(3,0));
            Plateau plateau = new Plateau(3,3);
            System.out.println(plateau.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
