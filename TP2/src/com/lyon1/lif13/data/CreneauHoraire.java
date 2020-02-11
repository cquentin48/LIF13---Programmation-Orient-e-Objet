package com.lyon1.lif13.data;

import java.util.Objects;
import java.util.Scanner;

public class CreneauHoraire implements Cloneable {
    private int dayNumber;
    private int startHour;
    private int startMinute;
    private int minutesDuration;

    public CreneauHoraire(int dayNumber, int startHour, int startMinute, int minutesDuration) {
        this.dayNumber = dayNumber;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.minutesDuration = minutesDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreneauHoraire that = (CreneauHoraire) o;
        return dayNumber == that.dayNumber &&
                startHour == that.startHour &&
                startMinute == that.startMinute &&
                minutesDuration == that.minutesDuration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayNumber, startHour, startMinute, minutesDuration);
    }

    @Override
    public String toString() {
        return "CreneauHoraire{" +
                "dayNumber=" + dayNumber +
                ", startHour=" + startHour +
                ", startMinute=" + startMinute +
                ", minutesDuration=" + minutesDuration +
                '}';
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    public static CreneauHoraire input(){
        Scanner sc = new Scanner(System.in);
        CreneauHoraire newCreneauHoraire = new CreneauHoraire(0,0,0,0);
        int ok = 0;
        while(ok == 0) {
            System.out.println("Veuillez entrer le jour du créneau :");
            int day = sc.nextInt();
            System.out.println("Veuillez entrer l'heure du créneau : ");
            int hour = sc.nextInt();
            System.out.println("Veuillez entrer la minute du créneau : ");
            int minute = sc.nextInt();
            System.out.println("Veuillez entrer la durée en minutes : ");
            int minutesDuration = sc.nextInt();
            newCreneauHoraire = new CreneauHoraire(day,hour,minute,minutesDuration);
            System.out.println("Voici le créneau horaire : \n"+newCreneauHoraire);
            System.out.println("Est-ce que cela vous convient? (0 -> Non, 1 -> Oui)");
            ok = sc.nextInt();
        }
        return newCreneauHoraire;
    }

    @Override
    public CreneauHoraire clone(){
        CreneauHoraire cloned = new CreneauHoraire(dayNumber,startHour,startMinute,minutesDuration);
        return cloned;
    }
}
