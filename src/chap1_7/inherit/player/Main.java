package chap1_7.inherit.player;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("최고의전투사");
        Mage mage = new Mage("최고의 마법사");
        Hunter hunter = new Hunter("최고의 사냥꾼");


        warrior.dash();
        warrior.showStatus();
        mage.showStatus();
        hunter.showStatus();


        System.out.println("==============");
        mage.fireBall(warrior);

        System.out.println("==============");
        mage.thunderbolt(warrior,
                hunter,
                new Mage("냠냠이"),
                new Warrior("막띠려"),
                new Hunter("원생이"),
                mage
        );
    }

}
