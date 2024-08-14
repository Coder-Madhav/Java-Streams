package com.codermadhav.designpatterns.factory.vechile;

public class FactoryClientTest {
    public static void main(String[] args) {
        MotorVehicleFactory factory = new MotorCycleFactory();
        factory.create();

        MotorVehicleFactory carFactory = new CarFactory();
        carFactory.create();
    }
}
