package chap1_9.Practice.quiz5;

public class LibraryBook {

    private String title;
    private String author;
    private Genre genre;

    public LibraryBook(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void getBookInfo() {
        System.out.println("책 제목 :" + title);
        System.out.println("저자 :" + author);
        System.out.println("장르 :" + genre.getGenreInKorean());
    }


}
