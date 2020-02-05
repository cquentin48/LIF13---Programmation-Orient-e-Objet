package com.lyon1.lif13.moto;
import com.lyon1.lif13.utilities.Utilities;

import java.util.Objects;

public class Motorbike implements MotorbikeFactory{
    private boolean verbose;
    private boolean isSwitchedOn;
    private Motor motor;
    private Wheel wheel;
    private HeadLight headLight;

    @Override
    public void switchOnMotorBike() {
        isSwitchedOn = true;
        Utilities.displayMessage(verbose,"Moto allumée!");
    }

    @Override
    public void switchOffMotorBike() {
        isSwitchedOn = true;
        Utilities.displayMessage(verbose,"Moto éteinte!");
    }

    @Override
    public void honkBike() {
        isSwitchedOn = true;
        Utilities.displayMessage(verbose,"Tut tut!");
    }

    @Override
    public void switchOnMotor() {
        motor.turnOnMotor();
    }

    @Override
    public void switchOffMotor() {
        motor.turnOffMotor();
    }

    @Override
    public void changeSpeed(int newSpeed) throws Exception {
        motor.updateSpeed(newSpeed);
    }

    @Override
    public void turnWheel(float degree) {
        if(motor.isMotorSwitchedOn()) {
            wheel.turn(degree);
        }else{
            Utilities.displayMessage(verbose,"Le moteur est éteint!");
        }
    }

    @Override
    public void switchOnHeadLight() {
        headLight.switchOn();
    }

    @Override
    public void switchOffHeadLight() {
        headLight.switchOff();
    }

    public Motorbike(boolean verbose) {
        this.verbose = verbose;
        wheel = new Wheel(verbose);
        motor = new Motor(verbose);
        headLight = new HeadLight(verbose);
        isSwitchedOn = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorbike motorbike = (Motorbike) o;
        return verbose == motorbike.verbose &&
                isSwitchedOn == motorbike.isSwitchedOn &&
                Objects.equals(motor, motorbike.motor) &&
                Objects.equals(wheel, motorbike.wheel) &&
                Objects.equals(headLight, motorbike.headLight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verbose, isSwitchedOn, motor, wheel, headLight);
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "verbose=" + verbose +
                ", isSwitchedOn=" + isSwitchedOn +
                ", motor=" + motor +
                ", wheel=" + wheel +
                ", headLight=" + headLight +
                '}';
    }
}
