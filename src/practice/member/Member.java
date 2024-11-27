package practice.member;

import java.time.LocalDateTime;
import java.util.UUID;

public class Member {

    // 회원정보: 이메일, 비밀번호, 이름, 회원식별번호, 성별, 나이
    String email;
    String password;
    String memberName;
    String id;
    // !! 열거형
    Gender gender = Gender.MALE;
    int age;
    LocalDateTime registerDate;

    public Member(String email, String password, String memberName, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.id = UUID.randomUUID().toString();
        this.gender = gender;
        this.age = age;
        this.registerDate = LocalDateTime.now(); // 회원가입 일시
    }

    // 한 명의 회원 정보를 출력하는 메소드
    void inform() {
            System.out.printf("# %s | %s | %s | %d세\n"
                    , email, memberName, gender, age);
        }
    // 한 명의 회원 정보를 상세하게 출력하는 메서드
    void detailInfo() {
        System.out.printf("========= [%s]님 정보 조회 ========\n", this.memberName);
        System.out.println("# 회원번호: " + this.id);
        System.out.println("# 이메일: " + this.email);
        System.out.println("# 비밀번호: " + this.password);
        System.out.println("# 성별: " + (this.gender == Gender.MALE ? "남성" : "여성"));
        System.out.println("# 나이: " + this.age + "세");
        System.out.println("# 가입일시 : " + this.registerDate);
        System.out.println();
    }

    }



