package practice.test;

public enum Gender1 {
    FEMALE, MALE;

    public static Gender1 fromString(String gender) {
        while (true) {
            switch (gender) {
                case "남성":
                    return MALE;
                case "여성":
                    return FEMALE;
                default:
                    System.out.println("다시 입력하세요");
            }
        }
    }
}
