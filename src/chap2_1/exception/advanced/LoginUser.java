package chap2_1.exception.advanced;

// 로그인 검증을 수행하는 클래스
public class LoginUser {

    private String account; // 가입 시 등록한 계정명
    private String password; // 가입 시 등록말 비밀번호

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    // 아이디가 맞는지 확인

    // 로그인 검증 기능
    public void loginValidate(String inputAccount, String inputPassword)
            // !! 메서드 안에서 throw 구현할 경우, 메서드 시그니처에 'throws Exception' 기입해야 함
            throws Exception {
        // 먼저 아이디가 동일한지 확인
        if (!inputAccount.equals(this.account)) {
            /*
                프로그램에서 예외로 인식하지 않지만
                실제로 비즈니스 상황에서는 예외로 인식시켜야 할 경우
                강제로 에러를 발생시켜야 한다.
             */

            // ! throw new Exception("detailedMessage 내용")으로 Exception 생성
            // ! parameter 값 : Exception 생성자 구현내용에 따라, parameter 값은 detailedMessage에 저장되며,
            //                  이 값은 Exception.getMessage(); 에 저장됨
            throw new LoginInvalidException("아이디가 일치하지 않습니다.");
        }
        // 비밀번호가 그 아이디의 비밀번호인지 확인
        if (!inputPassword.equals(this.password)) {
            throw new LoginInvalidException("비밀번호가 일치하지 않습니다.");
        }

        // 로그인 성공
        System.out.println("로그인 성공쓰~~~");
    }
}
