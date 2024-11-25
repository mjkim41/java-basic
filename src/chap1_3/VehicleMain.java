package chap1_3;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle grandeur = new Vehicle("그랜져");
        grandeur.powerOn();
        System.out.println("==========");

        Vehicle panamera = new Vehicle("폭스바겐");
        panamera.powerOff();
        panamera.accelerate();
        panamera.accelerate();
        panamera.accelerate();

        grandeur.accelerate();
    }

}
