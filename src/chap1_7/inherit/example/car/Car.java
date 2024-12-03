package chap1_7.inherit.example.car;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Car {

    public String manufacturer;
    public String model;
    protected int year;

    // 생성자 (!! year 받아오는 것 주목)
    public Car(String manufacturer, String model, String dateString) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = dateToYear(dateString);
    }

    // !! 사용자가 날짜를 "yyyy-mm-dd" 형식으로 입력하면, 날짜 형식으로 인식하여 year만 추출하는 함수
    public int dateToYear(String dateString) {
        try {
            /* 1. 날짜로 인식하게 해준다.
                  1-1) LocalDate.parse(parse할 것, formatter)을 사용할 건데,
                       formatter는 그냥 형식만 가져오는 것이 아니라 DateTimeFormmater 객체를 가져 와야 하므로
                       DateTimeFormatter.ofPattern("형식") 사용하여 객체 생성한다. */
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            //    1-2) LocalDate.parse로 날짜로 인식
            LocalDate date = LocalDate.parse(dateString, formatter);

            // 2. 1에서 연도만 가져온다. (LocalDate.getYear() 사용)
            return date.getYear();
            // 3. 예외 처리 위해서 try, catch 로 감싸고, DateTimePraseException e 처리한다.
        } catch(DateTimeParseException e) {
            return 0;
        }
    }



    public void showDetail() {
        System.out.println("Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}');
    }

    public void start() {
        System.out.println("시동을 겁니다.");
    }

}
