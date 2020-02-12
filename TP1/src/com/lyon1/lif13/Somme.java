package com.lyon1.lif13;

import com.lyon1.lif13.moto.Motorbike;

public class Somme {
    public static void main(String[] args) {
        if(args.length == 1) {
            sum(10);
        }
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
