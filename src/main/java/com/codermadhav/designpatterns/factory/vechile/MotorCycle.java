package com.codermadhav.designpatterns.factory.vechile;

public class MotorCycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
