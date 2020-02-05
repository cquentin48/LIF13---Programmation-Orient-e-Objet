package com.lyon1.lif13.moto;

import com.lyon1.lif13.utilities.Utilities;

import java.util.Objects;

public class Wheel {
    private boolean verbose;
    private float rotation;

    public void turn(float newRotation){
        rotation = newRotation%360;
        Utilities.displayMessage(verbose,"Roue tournée à "+rotation+"°.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Float.compare(wheel.rotation, rotation) == 0 &&
                verbose == wheel.verbose;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rotation, verbose);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "rotation=" + rotation +
                ", verbose=" + verbose +
                '}';
    }

    public Wheel(boolean verbose) {
        this.verbose = verbose;
        this.rotation = 0;
    }

    public float getRotation() {
        return rotation;
    }
}
