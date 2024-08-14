package com.codermadhav.lambdas;

import java.util.Collections;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> books = Book.getBooksList();

        Collections.sort(books, ( o1,  o2) -> o2.getName().compareTo(o1.getName()));

        /*
         Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
         */

        System.out.println(books);


    }
}

/*class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}*/
