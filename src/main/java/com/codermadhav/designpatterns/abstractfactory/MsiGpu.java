package com.codermadhav.designpatterns.abstractfactory;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Msi Gpu");
    }
}
