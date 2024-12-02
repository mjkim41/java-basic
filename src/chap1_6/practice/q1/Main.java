package chap1_6.practice.q1;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        LibraryMember test = new LibraryMember("midol41", "미돌");
        test.displayMemberInfo();
        test.borrowBook();
        test.borrowBook();
        test.borrowBook();
        test.returnBook();
    }
}
