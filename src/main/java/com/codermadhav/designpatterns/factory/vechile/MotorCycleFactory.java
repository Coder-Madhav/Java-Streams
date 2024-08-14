package com.codermadhav.designpatterns.factory.vechile;

public class MotorCycleFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorCycle();
    }
}
