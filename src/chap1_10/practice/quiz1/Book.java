package chap1_10.practice.quiz1;

public abstract class Book {

    // !! 필드에는 abstract 사용 불가
    public String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void displayInfo();

}
