package chap1_6.practice.q3;

public class MovieTicket {

    public String movieTitle;
    private String seatNumber;
    private boolean isBooked;

    public MovieTicket(String movieTitle, String seatNumber) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
//        this.isBooked = false;
    }

    public void bookSeat() {
        if (!isBooked) {
            isBooked = true;
            System.out.println(seatNumber + " 좌석이 예매되었습니다.");
        } else {
            System.out.println(seatNumber + " 좌석은 이미 예매되었습니다.");
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println(seatNumber + " 좌석의 예매가 취소되었습니다.");
        } else {
            System.out.println(seatNumber + " 좌석은 예약 상태가 아닙니다.");
        }
    }

    public void displayTicketInfo() {
        System.out.println("movieTitle = " + movieTitle);
        System.out.println("seatNumber = " + seatNumber);
        System.out.println("isBooked = " + isBooked);
    }

}
