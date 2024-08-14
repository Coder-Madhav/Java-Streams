package com.codermadhav.designpatterns.factory.restaurant;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Veggie Burger");
    }
}
