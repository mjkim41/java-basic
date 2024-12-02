package chap1_7.inherit.example.book;

public class Ebook extends Book{

    protected double fileSize;

    public Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void read() {
        System.out.println("전자책을 읽습니다.");
    }

    public void displayFileSize() {
        System.out.println(fileSize + "MB");
    }
}
