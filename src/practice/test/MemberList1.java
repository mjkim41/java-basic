package practice.test;

import java.util.Arrays;

public class MemberList1 {

    public Member1[] memberList;

    public MemberList1() {
        this.memberList = new Member1[]{
                new Member1("미돌", 13, "여성"),
                new Member1("미순", 13, "여성"),
                new Member1("미정", 13, "여성")
        };
    }

    public void printMembers() {
        System.out.println(Arrays.deepToString(memberList));
    }
}
