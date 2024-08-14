package com.codermadhav.functions;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return null;
    }

    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "Coder-Madhav";
//        System.out.println(supplier.get());

        System.out.println(Stream.of(/*"Madhav", "Roja"*/).findAny().orElseGet(() -> "Madhav"));
    }
}
