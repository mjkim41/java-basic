package practice.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberController$5삭제 {

    // 필드 - 의존성 필드 (객체가 일을 하기 위해 다른 객체에 의존(협력))
    Scanner sc;
    MemberRepository$5삭제 mr;

    MemberController$5삭제() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository$5삭제();
    }

    // 프로그램 초기 화면 출력
    void mainView() {
//        int size = mr.size();
        System.out.printf("\n#####  회원 관리 시스템(현재 회원 수: $d명)  #####\n");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 전체 회원 조회하기");
        System.out.println("* 3. 개별 회원 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("================================");
    }

    // 3번 메뉴 개별 조회 입출력
    void showDetails() {
        String email = prompt("# 조회 대상의 이메일: ");

        // 조회 대상을 탐색 -> 탐색 성공시 해당 객체를 받아옴
        Member foundMember = mr.findMemberByEmail(email);

        if (foundMember != null) {
            foundMember.detailInfo();
        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }
    }

    // 프로그램을 실행하는 메서드
    void start() {
        while (true) {
            mainView();
            String menuNum = prompt(">> ");

            switch (menuNum) {
                case "1":
                    signUp();
                    break;
                case "2":
                    showAllMembers();
                    break;
                case "3":
                    showDetails();
                    break;
                case "4":
                    changePassword();
                    break;
                case "5":
                    deleteMember();
                    break;
                case "7":
                    System.out.println("프로그램 종료하기!");
                    return;
            }
        }
    }

    // 회원정보 삭제에 대한 입출력 처리
    void deleteMember() {
        String inputEmail = prompt("# 삭제 대상 이메일: ");
        Member foundMember = mr.findMemberByEmail(inputEmail);
        if (foundMember != null) {
            //삭제 전에 패스워드 검증
            String inputPassword = prompt("# 비밀번호: ");
            // 비밀번호 일치하는지 직관적으로 기능을 알 수 있게 하기 위해 함수 새로 만듬
            if (mr.isPasswordMatch(foundMember.password, inputPassword)) {
                // 실제로 삭제
                mr.removeMember(inputEmail);
                System.out.println("\n 회원 탈퇴 정상 적으로 처리되었습니다. 복구 하시려면 복구 메뉴로 가세요");
                // 비번 틀림
                System.out.println("\n # 비밀번호가 일치하지 않습니다. 삭제를 취소합니다.");
            }
        } else {
            System.out.println("# 조회 결과 없음");
        }
    }

    // 4. 회원정보 수정(비번)에 관한 입출력 처리
    void changePassword() {
        String inputEmail = prompt("# 수정 대상의 이메일: ");
        Member foundMember = mr.findMemberByEmail(inputEmail); // 이메일 있는지 찾아서, 있으면 멤버 반환, 없으면 null 반환
        if (foundMember != null) {
            System.out.printf("\n $s님의 비밀번호를 변경합니다.\n,", foundMember.memberName);
            String newPassword = prompt("# 새 비밀번호: ");
            //  기존 비번과 같을 시
            if (foundMember.password.equals(newPassword)) {
                System.out.println("기존 비밀번호와 같음");
                return;
            }
            // 실질적인 패스워드 변경 처리
            mr.updatePassword(inputEmail, newPassword);
            System.out.println("# 비밀번호 변경 완료");



        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }
    }

    // 이메일을 중복이 안될때까지 입력받고 중복이 안된 이메일을 리턴
    String checkDuplicateEmailInput() {
        while (true) {
            String email = prompt("# 이메일: ");
            if (mr.isDuplicateEmail(email)) {
                System.out.println("# 이메일이 중복되었습니다.");
            } else { // 중복이 안된 경우
                return email;
            }
        }
    }

    Gender checkCorrectGenderInput() {
        while(true) {
            String genderString = prompt("성별 (M/F): ");
            switch (genderString) {
                case "M":
                    return Gender.MALE;
                case "F":
                    return Gender.FEMALE;
                default:
                    System.out.println("# 성별을 M 또는 F로 입력하세요!");
            }
        }
    }

    // 회원가입을 입출력 처리하는 메서드
    void signUp() {
        System.out.println("\n ===== 회원 가입을 시작합니다. =====");

        String email = checkDuplicateEmailInput();
        String password = prompt("# 패스워드: ");
        String name = prompt("# 이름: ");

        Gender gender = checkCorrectGenderInput();

        String age = prompt("# 나이: ");

        // 회원 목록에 추가
        mr.addMember(new Member(email, password, name, gender, Integer.parseInt(age)));

        System.out.println("# 회원가입이 완료되었습니다.");
    }

    // 전체 회원 정보를 화면에 출력하는 메서드
    void showAllMembers() {
        // 전체 회원정보를 가져옴
        Member[] members = mr.getMembers();
        System.out.println("\n========= 전체 회원 정보 ===========");
        for (Member m : members) {
            m.inform();
        }
        System.out.println("\n======== 엔터를 눌러서 계속.... ======");
        // 입력커서를 생성해서 코드를 잠시 중단시킴
        sc.nextLine();
    }


    // 입력을 쉽게 처리해주는 메서드
    String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
