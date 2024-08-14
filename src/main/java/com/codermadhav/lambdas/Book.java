package com.codermadhav.lambdas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private int id;
    private String name;
    private int pages;

    public static List<Book> getBooksList(){
       return Arrays.asList(
               Book.builder().id(10).name("Hibernate").pages(100).build(),
               Book.builder().id(20).name("Spring Boot").pages(150).build(),
               Book.builder().id(30).name("Microservices").pages(120).build(),
               Book.builder().id(40).name("Oracle").pages(140).build(),
               Book.builder().id(50).name("Postgres").pages(170).build()
       );
    }

}
