package com.lyon1.lif13.moto;

import com.lyon1.lif13.utilities.Utilities;

import java.util.Objects;

public class HeadLight {
    private boolean verbose;
    private boolean isSwitchedOn;

    public void switchOn(){
        isSwitchedOn = true;
        Utilities.displayMessage(verbose,"Phare allumé!");
    }

    public void switchOff(){
        isSwitchedOn = true;
        Utilities.displayMessage(verbose,"Phare éteint!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeadLight headLight = (HeadLight) o;
        return verbose == headLight.verbose &&
                isSwitchedOn == headLight.isSwitchedOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(verbose, isSwitchedOn);
    }

    @Override
    public String toString() {
        return "HeadLight{" +
                "verbose=" + verbose +
                ", isSwitchedOn=" + isSwitchedOn +
                '}';
    }

    public HeadLight(boolean verbose) {
        this.verbose = verbose;
        isSwitchedOn = false;
    }
}
