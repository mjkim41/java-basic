package chap1_9.enum_.travel;

public enum Cities {

    SEOUL("서울"), BARCELONA("바르셀로나"), CDMX("멕시코시티");

    // !! Cities가 Barcelona면 '바르셀로나', CDMX면 '멕시코시티'라고 출력하고 싶다?
    //   => 이 말은 즉, enum Cities의 인스턴스 객체인 Barcelona, CDMX 객체에 특정한 값을 저장하고 싶다는 뜻.
    //   => 어떻게 구현 하냐?
    //   => 각 enum 인스턴스 객체를 만들 때 출력하고자 하는 값이 각 객체에 저장되도록,
    //      enum 클래스에 변수를 생성하고 생성자에서 그 파라미터 값을 줌.
    private String cityInKorean;

    // !! 이 때 enum 생성자는 사용자가 부르는 것이 아니라 자동으로 호출되는 것이므로 private 사용
    private Cities(String cityInKorean) {
        this.cityInKorean = cityInKorean;
    }

    // 값 반환
    public String getCityInKorean() {
        return cityInKorean;
    }
}
