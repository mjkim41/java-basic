package chap1_3.practice;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 3);
        double area = rectangle1.calculateArea();
        double perimeter = rectangle1.calculatePerimeter();
        System.out.printf("넓이 : %1.1f \n둘레 : %1.1f", area, perimeter);
    }
}
