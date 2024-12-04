package chap1_10.practice.quiz1;

public class EBook extends Book {

    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("==== Ebook 정보 =====");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("fileSize = " + fileSize);
    }
}
