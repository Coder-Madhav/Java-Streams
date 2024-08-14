package com.codermadhav.lambdas;

public interface Animal {
    default void doEat(){
        System.out.println("Animal EAT method");
    }
}
