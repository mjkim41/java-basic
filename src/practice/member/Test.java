package practice.member;

public class Test {

    public static void main(String[] args) {

        // 멤버 저장소 객체 생성
        MemberRepository$이전 mr = new MemberRepository$이전();

        // 멤버 추가
        mr.addMember(new Member("midol4@naver.com", "9999", "하몽덕후", Gender.THEY, 30));;

        // 전체 회원 데이터 조회
        Member[] members = mr.getMembers();
        for (Member m : members) {
            m.inform();
        }

        // 이메일 중복 검사
        boolean flag = mr.isDuplicateEmail("abc123@def.com");
        System.out.println("flag = " + flag);


    }
}
