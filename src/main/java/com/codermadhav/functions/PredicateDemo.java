package com.codermadhav.functions;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {


    public static void main(String[] args) {
//        Predicate<Integer> predicate = num -> num % 2 == 0;
//        System.out.println(predicate.test(7));

        Stream.of(1, 2, 3, 4, 5).filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
