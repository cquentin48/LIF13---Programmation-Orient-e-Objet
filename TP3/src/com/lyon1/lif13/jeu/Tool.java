package com.lyon1.lif13.jeu;

import java.util.Random;

public class Tool {
    public static int randomAttempt(int max, int min){
        return new Random().nextInt(max+1) + min;
    }
}
