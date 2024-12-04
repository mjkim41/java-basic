package chap1_10.practice.quiz1;

public class PrintedBook extends Book {

    private int pageCount;

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("==== 종이책 정보 =====");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("pageCount = " + pageCount);
    }
}
