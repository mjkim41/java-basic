package chap1_8.poly.computer;

/*
       const computer = {
            keyboard: {}
        }
 */
public class Computer {

    // 필드: 객체의 속성 - 객체를 이루고 있는 데이터
    KeyBoard keyboard;

    // 키보드를 교체하는 기능
    public void changeKeyboard(KeyBoard keyboard) {
        this.keyboard = keyboard;
        System.out.println("키보드가 교체되었습니다.");
    }
}
