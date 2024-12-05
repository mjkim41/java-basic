package chap1_9.enum_.travel;

public class Travel {

    public String travelerName;
    public Cities city;

    public Travel(String travelerName, Cities city) {
        this.travelerName = travelerName;
        this.city = city;
    }

    public void printCity() {
        System.out.printf("%s으로 여행", city.getCityInKorean());
    }


}
