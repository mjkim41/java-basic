package chap1_5.library;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("해리포토");
        System.out.println("book1 = " + book1);

        Book book2 = new Book("판지의게왕", "뽀로로", 1999);
        System.out.println("book2 = " + book2);
    }
}