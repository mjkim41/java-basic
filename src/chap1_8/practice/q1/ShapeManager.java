package chap1_8.practice.q1;

public class ShapeManager {

    public void printShapeInfo(Shape shape) {
        System.out.printf("면적 : %.2f", shape.area());
        System.out.printf("둘레 : %.2f", shape.perimeter());
    }
}
