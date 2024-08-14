package com.codermadhav.designpatterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(100);
        Singleton singleton1 = Singleton.getInstance(100);
        Singleton singleton2= Singleton.getInstance(100);

        System.out.println(singleton.toString());
        System.out.println(singleton1.toString());
        System.out.println(singleton2.toString());
    }
}
