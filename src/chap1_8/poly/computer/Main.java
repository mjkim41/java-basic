package chap1_8.poly.computer;

public class Main {

    public static void main(String[] args) {


        Computer myCom = new Computer();
        // 초기에 내 키보드를 세팅
        myCom.keyboard = new SamsungKeyboard();
        myCom.changeKeyboard(new LgKeyboard());


    }

}
