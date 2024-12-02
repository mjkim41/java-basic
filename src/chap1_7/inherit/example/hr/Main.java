package chap1_7.inherit.example.hr;

public class Main {

    public static void main(String[] args) {

        Manager kw = new Manager("KW", 170000, 10000);
        String totalCompensation = kw.getTotalCompensation();
        System.out.println(totalCompensation);
    }
}
