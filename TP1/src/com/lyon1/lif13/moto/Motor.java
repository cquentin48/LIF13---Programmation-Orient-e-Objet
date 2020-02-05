package com.lyon1.lif13.moto;

import com.lyon1.lif13.utilities.Utilities;

import java.util.Objects;

public class Motor {
    private boolean verbose;
    private boolean motorStatus;
    private int speed;

    public void turnOnMotor(){
        motorStatus = true;
        Utilities.displayMessage(verbose, "Moteur allumé!");
    }

    public void turnOffMotor(){
        motorStatus = true;
        Utilities.displayMessage(verbose, "Moteur éteint!");
    }

    public void updateSpeed(int newSpeed) throws Exception {
        if(motorStatus) {
            if (speed < 0) {
                throw new Exception("La vitesse est négative!");
            } else {
                speed = newSpeed;
                Utilities.displayMessage(verbose, "Vitesse mise à jour!");
            }
        }else{
            Utilities.displayMessage(verbose,"Le moteur est éteint!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isMotorSwitchedOn() {
        return motorStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return verbose == motor.verbose &&
                motorStatus == motor.motorStatus &&
                speed == motor.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(verbose, motorStatus, speed);
    }

    @Override
    public String toString() {
        return "Motor{" +
                "verbose=" + verbose +
                ", motorStatus=" + motorStatus +
                ", speed=" + speed +
                '}';
    }

    public Motor(boolean verbose) {
        this.verbose = verbose;
    }
}
