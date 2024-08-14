package com.codermadhav.lambdas;

public class Test implements Animal,Person{
    @Override
    public void doEat() {
        Animal.super.doEat();
    }

    public static void main(String[] args) {
        new Test().doEat();
    }
}
