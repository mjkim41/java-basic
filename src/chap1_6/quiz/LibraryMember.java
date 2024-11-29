package chap1_6.quiz;

import java.util.Arrays;
import java.util.Scanner;

class LibraryMember {

    public String memberId;
    private String name;
    private int borrowedBooks;
    private Scanner sc;
    public String[] bookList = {"How to Make: Dumpling", "How to Make: Egg tart", "How to Make: Onion", "How to Make: Aussie Latte"};
    public int totalBorrowedBooks;
    public int totalBorrowedBooksLimit = 5;
    private String[] menuItems = {
            "1. View my Account",
            "2. Book Checkout",
            "3. Check Out Our Book Recommendations"
    };
    private String[] borrwoedBookList = {
            "My Favorite Color: Yellow",
            "Consistency Is The Key: Successful Duolingo Learner History",
            "Never Settle Down: How to be a Digital Nomad"
    };

    //  ## 생성자 ##
    public LibraryMember() {
        this("K.Williams", "Kristian Williams");
    }

    public LibraryMember(String memberId, String name) {

        sc = new Scanner(System.in);

        this.memberId = memberId;
        this.name = name;
        borrowedBooks = 0;
        totalBorrowedBooks = 3;
    }

    // ## 시작 ##
    public void start() {
        System.out.println(">> Welcome to MJ's library.");
        while (true) {
            mainView();
            String selectedMenu = prompt(">> Please select the menu you want to execute.");
            System.out.printf(">>>>>>>>> Moving to the Menu \"%s\"\n", menuItems[Integer.parseInt(selectedMenu) - 1]);
            navigateToMenu(selectedMenu); // 선택 메뉴로 이동
        }
    }

    // ## 메인 메뉴 출력 ###
    private void mainView() {
        for (String menu : menuItems) {
            System.out.println(menu);
        }
    }

    // ## 해당 메뉴로 이동 ##
    private void navigateToMenu(String selectedMenu) {
        switch (selectedMenu) {
            case "1":
                inform();
                exitTheMenu();
                break;
            case "2":
                borrowBook();
                exitTheMenu();
                break;
            case "3":
                inform();
                break;
            default:
                System.out.println(">> Please select correct menu.");
                break;
        }
    }



    //  ## 회원 정보 페이지 ##
    public void inform() {
        System.out.printf(
                ">> [%s's Info]         \n   Member ID : %s          \n   Total Borrowed Books: %d\n   Borrowed Books: %s\n"
               , name, memberId, totalBorrowedBooks, Arrays.toString(borrwoedBookList));
    }


    // ## 공통 ##
    // 1. (메인) 메뉴 나가시겠습니까?
    public void exitTheMenu() {
        while (true) {
            Boolean UserAnswerForExitTheMenu = isExitRequested();
            if (UserAnswerForExitTheMenu) {
                return;
            } else {
                System.out.println(">> WTF!!! ");
            }
        }
    }
    // 1-1. (서브) 메뉴 탈출 희망여부 boolean
    private boolean isExitRequested() {
        String userAnswer = prompt(">> Do you want to execute the menu?\n>> Press 1 for executing the menu. Press 2 if are gonna be stubborn and do whatever you want.");
        if (userAnswer.equals("1")) {
            return true;
        } else {
            return false;
        }
    }


            // ## 대출 관련 (메인 : borrowBook()) ##
            public void borrowBook() {
                while (true) {
                    // 희망 대출 도서 이름 받아오기
                    String loanRequestBook = prompt(">> Please write the name of the book you want to borrow");
                    // 도서관에 현재 있는 책인지 확인
                    boolean flag = isBookinLibrary(loanRequestBook);
                    // 있는 책일 때, 없는 책일 때 대응
                    if (flag) {
                        // 있는 책일 때 : 기 대출 도서 5권 이상인지 확인
                        if (totalBorrowedBooks == 5) {
                            System.out.printf(
                                    """
                                    The maximum number of books that can be borrowed from our library is %d
                                    Please return the books you have already borrowed and borrow new ones.
                                    """, totalBorrowedBooksLimit);
                        } else {
                            totalBorrowedBooks++;
                            System.out.printf(">> %s, you've borrowed \"%s\"\n", name, loanRequestBook);
                            System.out.printf(" Total Borrowed Books: %d\n", totalBorrowedBooks);
                            return;
                        } // end if(책이 없을 때)
                    } else {
                        System.out.println("The book requested is not in the library.");
                    } // end if(책이 있을 때)
                }
            }

            // 보유도서 여부 확인
            public boolean isBookinLibrary(String inputBookName) {
                for (String book : bookList) {
                    if (inputBookName.equals(book)) return true;
                }
                return false;
            }


            private String prompt(String message) {
                System.out.println(message);
                return sc.nextLine();
            }




        }
