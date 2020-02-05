package com.lyon1.lif13;

import com.lyon1.lif13.moto.Motorbike;

public class Main {

    public static void main(String[] args) {
        //sum(Integer.parseInt(args[0]));
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

    public static void sum(int sumNumber){
        double result = 1;
        for(int i = 2;i<=sumNumber;i++){
            float number = i;
            result = result + (1/number);
        }
        System.out.println("Somme : "+result);
    }
}
