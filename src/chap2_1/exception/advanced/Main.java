package chap2_1.exception.advanced;

public class Main {

    public static void main(String[] args) {

        LoginUser user = new LoginUser("midoldol41", "12345");

        try {
            user.loginValidate("midolsdfsdsfddol41", "1sss2345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
