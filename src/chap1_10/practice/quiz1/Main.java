package chap1_10.practice.quiz1;

import chap1_7.inherit.example.book.Ebook;

public class Main {
    public static void main(String[] args) {
        EBook eBook = new EBook("이펙티브 자바", "자바팀", 200);
        PrintedBook printedBook = new PrintedBook("클린코드", "로버트 마틴", 500);

        Library library = new Library();
        library.printBookInfo(printedBook);
    }
}
