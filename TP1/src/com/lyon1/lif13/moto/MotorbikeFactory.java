package com.lyon1.lif13.moto;

public interface MotorbikeFactory {
    //Motorbike base functions
    void switchOnMotorBike();
    void switchOffMotorBike();
    void honkBike();

    //Motor base function
    void switchOnMotor();
    void switchOffMotor();
    void changeSpeed(int newSpeed) throws Exception;

    //Wheel function
    void turnWheel(float degree);

    //Motorbike headlight functions
    void switchOnHeadLight();
    void switchOffHeadLight();
}
