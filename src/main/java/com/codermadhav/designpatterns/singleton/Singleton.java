package com.codermadhav.designpatterns.singleton;

public class Singleton {
    private volatile static Singleton instance;
    private int data;

    private Singleton(int data) {
        this.data = data;
    }

    public static Singleton getInstance(int data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null)
                    instance = result = new Singleton(data);
            }
        }

        return result;
    }

}
