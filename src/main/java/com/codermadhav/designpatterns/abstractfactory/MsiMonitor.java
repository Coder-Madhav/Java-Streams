package com.codermadhav.designpatterns.abstractfactory;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Msi Monitor");
    }
}
