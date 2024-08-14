package com.codermadhav.lambdas;

public interface Person {
    default void doEat(){
        System.out.println("Person EAT method");
    }
}
