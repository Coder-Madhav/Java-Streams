package com.codermadhav.streams;

import com.codermadhav.lambdas.Book;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StreamDemo {
    public static void main(String[] args) {
        List<Book> booksList = Book.getBooksList();

        booksList.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);
        System.out.println("Reverse Order:");
        booksList.stream().sorted(Comparator.comparing(Book::getName).reversed()).forEach(System.out::println);

//        booksList.stream().sorted((b1, b2) -> b2.getName().compareTo(b1.getName())).forEach(System.out::println);

        Map<Book, Integer> booksMap = new TreeMap<>((o1,o2) -> o1.getPages() - o2.getPages());
        booksMap.put(Book.builder().id(10).name("Hibernate").pages(100).build(), 60);
        booksMap.put(Book.builder().id(20).name("Spring Boot").pages(150).build(), 80);
        booksMap.put(Book.builder().id(30).name("Microservices").pages(120).build(), 20);
        booksMap.put(Book.builder().id(40).name("Oracle").pages(140).build(), 40);
        booksMap.put(Book.builder().id(50).name("Postgres").pages(170).build(), 30);

        System.out.println("\nSorting Map based on pages: ");
        booksMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPages).reversed()))
                .forEach(System.out::println);

        System.out.println("\nSorting map based on Names");
        booksMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getName).reversed()))
                .forEach(System.out::println);

        System.out.println("\nSorting map based on value");
        booksMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);


    }
}
