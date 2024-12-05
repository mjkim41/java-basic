package chap2_2.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        // 자바 8 이전
        Date date = new Date();
        System.out.println("date = " + date);

        // 자바 8 이후
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // 특정 날짜정보 생성
        LocalDate futureDate = LocalDate.of(2025, 3, 15);
        System.out.println("futureDate = " + futureDate);

        // 날짜 연산
        LocalDateTime targetDate = now.plusDays(67);
        System.out.println("targetDate = " + targetDate);

        LocalDateTime targetDate2 = now.plusYears(1).plusMonths(3).plusDays(20);
        System.out.println("targetDate2 = " + targetDate2);

        int monthValue = now.getMonthValue();
        System.out.println("monthValue = " + monthValue);


        // 날짜 포맷 변경
        DateTimeFormatter pattern
                = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");

        String formatDate = now.format(pattern);
        System.out.println("formatDate = " + formatDate);

        // 사이연도 구하기
        LocalDate birthDate = LocalDate.of(2004, 10, 3);
        Period period = Period.between(birthDate, nowDate);
        int years = period.getYears();


        // 사이날짜 구하기
        long betweenDays = ChronoUnit.DAYS.between(birthDate, nowDate);

        System.out.println("==============");
        System.out.println("years = " + years);
        System.out.println("betweenDays = " + betweenDays);

    }
}