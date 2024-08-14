package com.codermadhav.designpatterns.factory.vechile;

public class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
