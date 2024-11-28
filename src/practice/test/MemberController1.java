package practice.test;

import java.util.Scanner;

public class MemberController1 {

    MemberList1 ml;
    Scanner sc;

    MemberController1() {
        this.sc = new Scanner(System.in);
        this.ml = new MemberList1();
    }

    void mainView() {
        System.out.println("1. 전체 회원보기");
        System.out.println("2. 개별 회원보기");
        System.out.println("3. 회원 추가하기");
        System.out.println("7. 종료 추가하기");
    }

    void start() {
        mainView();
        String menu = checkAndInputMenu();
        switch (menu) {
            case "1":
                showAllMembers();
                break;
            case "7":
                return;
        };
        System.out.println("7은 오면 안됨");
    }

    void showAllMembers() {
        ml.printMembers();
    }

    String checkAndInputMenu() {
       while (true) {
           String selectedMenu = prompt("원하는 메뉴의 번호를 입력하세요.");
           String[] menuNums = {"1", "2", "3", "4", "5", "7"};
           for (String menuNum : menuNums) {
               if (selectedMenu.equals(menuNum)) {
                   System.out.println(selectedMenu + "번 메뉴를 선택하셨습니다.");
                   return selectedMenu;
               }
           }
           System.out.println("유효한 메뉴 번호가 아닙니다. 다시 입력하세요.");
       }
    }


    String prompt(String message) {
        System.out.println(message);
        return sc.nextLine();
    }


}

