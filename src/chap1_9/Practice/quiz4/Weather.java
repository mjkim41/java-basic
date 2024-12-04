package chap1_9.Practice.quiz4;

public enum Weather {

    SUNNY("맑음"),
    CLOUDY("구름 낌"),
    RAINY("비가 와요"),
    SNOWY("눈이 와요");

    private final String weatherInKorean;

    private Weather(String weatherInKorean) {
        this.weatherInKorean = weatherInKorean;
    }

    public void getWeatherInKorean() {
        System.out.println(weatherInKorean);
    }

}
