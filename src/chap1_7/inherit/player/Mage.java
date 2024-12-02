package chap1_7.inherit.player;

public class Mage extends Player {

    int mana; //  마력 게이지


    public Mage(String nickname) {
        super(nickname);
        this.mana = 60;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("mana: " + mana);
    }

    // 마법사 스킬
    public void fireBall() {

    }
}
