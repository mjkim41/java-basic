package chap1_8.practice.q1;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
//      super();
        this.radius = radius;
    }

    // 원의 넓이 : PI * radius * 제곱
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    // 원의 둘레 : PI * 반지름 * 2
    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }
}
