package com.lyon1.lif13.data;

public class CreneauHoraireComparable extends CreneauHoraire implements Comparable<CreneauHoraire> {
    public CreneauHoraireComparable(int dayNumber, int startHour, int startMinute, int minutesDuration) {
        super(dayNumber, startHour, startMinute, minutesDuration);
    }

    /**
     * Fonction de comparaison entre deux créneaux horaire
     *
     * @param creneauHoraire l'autre créneau horaire
     * @return 1 la durée passée en paramètre est supérieure | 0 les durées sont égales | 1 la durée passée en paramètre est inférieure
     * @throws Exception S'il ne s'agit pas d'un créneau horaire
     */
    public int compareTo(CreneauHoraire creneauHoraire) {
        //S'il ne s'agit pas d'un créneau horaire
        if (getMinutesDuration() < ((CreneauHoraire) creneauHoraire).getMinutesDuration()) {
            return 1;
        } else if (getMinutesDuration() == ((CreneauHoraire) creneauHoraire).getMinutesDuration()) {
            return 0;
        } else {
            return -1;
        }
    }
}
