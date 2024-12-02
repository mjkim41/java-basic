package chap1_7.inherit.player;
// 상속을 위한 공통 속성과 기능을 가진 부모 클래스
// !! 다중 상속 불가 알아보기
public class Player extends Object{

    String nickname;
    int level;
    int hp;

    public Player(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
    }

    public void showStatus() {
        System.out.println("===== Player's Info =====");
        System.out.println("# 닉네임: " + nickname);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
}
