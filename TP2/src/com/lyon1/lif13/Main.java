package com.lyon1.lif13;

import com.lyon1.lif13.data.*;

public class Main {

    public static void main(String[] args) {
        CreneauHoraireComparable creneauHoraireComparable = new CreneauHoraireComparable(1,1,3,60);
        CreneauHoraire c = creneauHoraireComparable;
        System.out.println(creneauHoraireComparable.compareTo(c));
    }
}
