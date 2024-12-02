package chap1_6.practice.q1;

import java.util.UUID;

public class LibraryMember {

    public String memberId; // public으로 하는 이유 : 교안대로
    private String name;
    private int borrowedBooks;

    // 기본 생성자: 파라미터가 없는 생성자
    // 클래스 안에 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어짐
    LibraryMember() {}
    LibraryMember (String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        // !! 초기화하라고 따로  명시 안해도, 알아서 값을 초기화 해야 함
        //    => 근데 값을 따로 초기화 안하면 기본으로 0으로 세팅되므로, 따로 아래 구문 안 적어도 되긴 함
        this.borrowedBooks = 0;
    }

    public void borrowBook() {
        if (borrowedBooks < 5) {
            borrowedBooks++;
            System.out.printf("%s님이 책을 한 권 빌렸습니다. 현재 빌린 책의 수: %d\n", name, borrowedBooks);
        } else {
            System.out.printf("%님은 이미 5권의 책을 빌리셨습니다. 더 이상 빌릴 수 없습니다.\n", name);
        }
    }

    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.printf("%s님이 책을 한 권 반납하셨습니다. 현재 빌린 책의 수: %d\n", name, borrowedBooks);
        } else {
            System.out.printf("%s님은 반납할 책이 없습니다.\n", name);
        }
    }

    public void displayMemberInfo() {
        System.out.println("memberId = " + memberId);
        System.out.println("name = " + name);
        System.out.println("현재 대출 도서 수 = " + borrowedBooks);
    }





}
