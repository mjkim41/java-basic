package chap1_3.practice;

import java.util.Arrays;

public class Book {

    String[] bookList;

    Book(String...books) {
        bookList = books;
    }

    void printtest() {
        System.out.println(Arrays.toString((bookList)));
    }

}
