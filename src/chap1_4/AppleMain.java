package chap1_4;

import chap1_4.juice.*;

public class AppleMain {
    public static void main(String[] args) {

        Apple apple1 = new Apple();

        chap1_4.cake.Apple apple2 = new chap1_4.cake.Apple();

        Banana banana = new Banana();
        Grape grape = new Grape();

        java.util.Scanner sc = new java.util.Scanner(System.in);

        /*
            패키지 이름 관례

            1. 전부 소문자로 작성
            2. 변수, 메서드 이름처럼 관례를 지킬 것
            3. 띄어쓰기가 있는 경우 -> 패키지를 쪼갬
             ex) my phone number -> my.phone.number
            4. 웬만하면 java라는 단어 쓰지 말것
              -> 라이브러리랑 헷갈림

         */
    }
}