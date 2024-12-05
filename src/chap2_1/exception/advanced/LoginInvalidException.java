package chap2_1.exception.advanced;

// Exception의 이름 만들기 : Exceptio을 상속받으면 Exception의 기능을 사용 가능
public class LoginInvalidException extends Exception{

    // 기본 생성자 : 에러메시지가 딱히 없는 경우
    public LoginInvalidException() {
    }

    /* Exception.getMessage()하면 반환되는 에러 메시지 저장하는 생성자
           - !! 원리 :
               1) parameter에 넣은 message가 (Throwable 클래스의 생성자 규현 내용에 따라) detailedMessage에 저장됨
               2) Exception.getMessage(); 하면 위에서 저장한 detailedMessage 값을 반환함
      */
    public LoginInvalidException(String message) {
        super(message);
    }
}
