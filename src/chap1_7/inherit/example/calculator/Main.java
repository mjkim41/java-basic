package chap1_7.inherit.example.calculator;

public class Main {

    public static void main(String[] args) {

        ScientificCalculator cal1 = new ScientificCalculator();
        double powerResult = cal1.power(2, 3);
        System.out.println(powerResult);

        double addResult = cal1.add(2, 3);
        System.out.println(addResult);
    }
}
