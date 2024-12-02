package chap1_7.inherit.player;

    // 하위(자식) 클래스 - sub class
    // 상위 클래스로부터 필드와 메서드를 상속받는 클래스
public class Warrior extends Player{

    int rage; // 분노게이지

    public Warrior(String nickname) {
    // 상속에서는 자식 객체를 생서하게 되면 부모의 객체도 함꼐 만들어야 한다. (메모리 구조 상)
    // 자바는 자동으로 상속 메모리 구조를 구현하기 위해
    // 자식 생성자의 맨 첫출에 super()를 삽입하여 부모를 강제 호출한다.
        super(nickname);
        this.rage = 100;
    }

        // !! Overriding : 부모가 물려준 메서드가 자식에게 적합하지 않아 자식이 고쳐쓰는 행위
    // !! 단, 부모가 물려준 모양(접근제한자, return type, 이름, 파라미터)은 유지해야 함
    // !!  Override : 안전하게 오버라이딩 할 수 있게 룰을 체크해줌
        @Override
        public void showStatus() {
            super.showStatus();
            System.out.println("# 분노: " + rage);
        }

    // 전사 스킬
    public void dash() {

    }

}
