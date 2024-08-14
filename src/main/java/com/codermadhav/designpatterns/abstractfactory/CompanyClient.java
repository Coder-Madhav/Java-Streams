package com.codermadhav.designpatterns.abstractfactory;

public class CompanyClient {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();
        msiGpu.assemble();
        msiMonitor.assemble();


        Company asus = new AsusManufacturer();
        Monitor asusMonitor = asus.createMonitor();
        Gpu asusGpu = asus.createGpu();
        asusGpu.assemble();
        asusMonitor.assemble();

    }
}
