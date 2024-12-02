package chap1_6.practice.q3;

public class Main {

    public static void main(String[] args) {

        MovieTicket ticket1 = new MovieTicket("시드니", "A1");
        MovieTicket ticket2 = new MovieTicket("멜버른", "B3");
        MovieTicket ticket3 = new MovieTicket("멜버른", "D2");

        ticket1.cancelBooking();
        ticket2.bookSeat();
        ticket2.bookSeat();
    }
}
