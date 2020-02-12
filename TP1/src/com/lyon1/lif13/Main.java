package com.lyon1.lif13;

import com.lyon1.lif13.moto.Motorbike;

public class Main {

    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(true);
        motorbike.switchOnMotor();
        try {
            motorbike.changeSpeed(-36);
        }catch (Exception e){
            e.printStackTrace();
        }
        Motorbike motorbike2 = motorbike;
        System.out.println(motorbike.toString());
    }
}
