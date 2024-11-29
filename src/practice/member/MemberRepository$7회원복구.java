package practice.member;

// 회원 객체를 여러개 모아서 관리할 설계도
public class MemberRepository$7회원복구 {

    Member[] memberList; // 가입된 회원 배열
    Member[] restoreList; // 복구를 위한 배열

    MemberRepository$7회원복구() {
        // [ {회원1}, {회원2}, {회원3} ]
        this.memberList = new Member[] {
                new Member("abc123@def.com", "1234", "콩벌레", Gender.MALE, 15),
                new Member("fff@ggg.com", "5678", "팥죽이", Gender.FEMALE, 25),
                new Member("xxx@ccc.com", "9876", "카레빵", Gender.FEMALE, 35)
        };

        this.restoreList = new Member[] {};
    }

    // 모든 회원 정보를 가져오는 메서드
    Member[] getMembers() {
        return this.memberList;
    }

    // 회원 목록에 새로운 회원 1명을 추가하는 메서드
    void addMember(Member newMember) {
        // push
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;

        // 숫자 배열 : [ 10, 20, 30, 40 ]
        // 객체 배열 : [ 주소1, 주소2, 주소3 ]
    }

    /**
     * 이메일 중복 여부를 확인하는 메서드
     * @param targetEmail - 이메일 검사 대상 문자열
     * @return - 이메일이 중복이면 true, 중복이 아니면 false
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        } // end for
        return false;
    }

    /**
     * 이메일을 통해 회원 목록 배열에서 해당 이메일을 가진
     * 객체를 찾아 리턴하는 메서드
     *
     * @param targetEmail - 탐색 대상의 이메일
     * @return - 이메일이 일치하는 회원을 반환, 일치하는 회원이 없다면
     *           null을 반환한다.
     * @author - 미스터홍
     * @since - 2024.11.27
     */
    Member findMemberByEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return m;
            }
        }
        return null;
    }

    void updatePassword(String inputEmail, String newPassword) {
        // 탐색
        Member foundMember = findMemberByEmail(inputEmail);
        // 변경
        foundMember.password = newPassword;
    }


    public boolean isPasswordMatch(String storedPassword, String inputPassword) {
        return storedPassword.equals(inputPassword);
    }

    void removeMember(String inputEmail) {

        // 삭제 대상의 인덱스를 알아내야 함.
        int index = findIndexByEmail(inputEmail); // 새로 함수 생성

        // 복구배열에 삭제된 회원 추가하기
        addRestore(memberList[index]);

        // 삭제 대상부터 앞으로 한칸씩 땡기기
        for (int i = 0; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];
        }
        Member[] temp = new Member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
    }

    int findIndexByEmail(String inputEmail) {
        for (int i = 0; i < memberList.length; i++) {
            String storedEmail = memberList[i].email;
            if (inputEmail.equals(storedEmail)) {
                return i;
        }
    }
    return -1;
        }


// 회원 목록에 새로운 회원 1명을 추가하는 메서드
void addRestore(Member newMember) {
    // push
    Member[] temp = new Member[restoreList.length + 1];
    for (int i = 0; i < restoreList.length; i++) {
        temp[i] = restoreList[i];
    }
    temp[temp.length - 1] = newMember;
    restoreList = temp;

    // 숫자 배열 : [ 10, 20, 30, 40 ]
    // 객체 배열 : [ 주소1, 주소2, 주소3 ]
}

    public boolean restore(String inputEmail) {
        // 복구대상을 탐색하여 복구배열에서 인덱스를 확인한 후
        int index = -1;
        for (int i = 0; i < restoreList.length; i++) {
            if (inputEmail.equals(restoreList[i].email)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }

        // 원본 회원 배열에 추가
        addMember(restoreList[index]);

        // 복구배열에서 제거 후
        for (int i = index; i < restoreList.length - 1; i++) {
            restoreList[i] = restoreList[i + 1];
        }
        Member[] temp = new Member[restoreList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = restoreList[i];
        }
        restoreList = temp;
        return true;
    }

}
