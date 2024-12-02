package chap1_7.overloading;

public class Example {

    // 정수 2개를 더하는 메서드
    public int add(int n1, int n2) {
        return n1 + n2;
    }


    public double add(double n1, double n2) {
        return n1 + n2;
    }


    public static void main(String[] args) {

        Example ex = new Example();
        ex.add(10,20);
        ex.add(10.1, 20.1);
    }

}
