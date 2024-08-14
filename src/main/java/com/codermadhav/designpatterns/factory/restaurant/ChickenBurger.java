package com.codermadhav.designpatterns.factory.restaurant;

public class ChickenBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Chicken Burger");
    }
}
