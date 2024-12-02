package chap1_7.inherit.player;

public class Hunter extends Player{



    int concentrate; // 집중 게이지


    public Hunter(String nickname) {
        // !! 부모 생성자 호출. 제일 윗 줄에 써야 함
        super(nickname);
        this.concentrate = 90;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("concentrate: " + concentrate);
    }

    // 사냥꾼 스킬
    public void summonBeast() {

    }

}
