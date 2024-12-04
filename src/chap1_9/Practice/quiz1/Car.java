package chap1_9.Practice.quiz1;

public class Car {

    private String model;
    private int year;
    private static int count;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        count++;
    }

    public void getCarInfo() {
        System.out.printf("모델명 : %s\n", model);
        System.out.printf("제조연도 : %d\n", year);
    }

    public static void getTotalCars() {
        System.out.printf("총 생산 차 대수: %d", count);
    }

}
