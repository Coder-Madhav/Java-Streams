package com.codermadhav.functions;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> System.out.println("Printing: " + t);

        Arrays.asList(1,2,3,4,5).stream().forEach(consumer);

    }
}
