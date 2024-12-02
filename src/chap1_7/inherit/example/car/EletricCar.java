package chap1_7.inherit.example.car;

public class EletricCar extends Car{

    private double batteryCapacity;

    public EletricCar(String manufacturer, String model, String date, double batteryCapacity) {
        super(manufacturer, model, date);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println("전기차가 조용히 시동을 겁니다.");
    }

    public void displayRange() {
        System.out.println("예상 주행 거리: " + (batteryCapacity * 5) + "km");
        // 배터리 용량에 따른 예상 주행 거리 : (배터리 용랑 * 1,000) / 에너지 소비율
    }



}
