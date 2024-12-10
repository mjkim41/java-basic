package chap2_6.inner;

public class Main {

    // 내부 클래스 (inner class)
    /*
        나는 뺄셈 계산기가 필요한데 아무래도 여기서만 쓰고
        다른데서는 안쓸 것 같다.
     */

    private static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        Calculator addCal = new AddCalculator();
        int result1 = addCal.operate(50, 30);
        System.out.println("result1 = " + result1);

        SubCalculator subCal = new SubCalculator();
        int result2 = subCal.operate(100, 25);
        System.out.println("result2 = " + result2);


        /*
        - 익명 클래스 (anonymous class)
            나는 곱셈 계산기가 필요한데
            여기서만 쓰고 안 쓸거 같다.
            근데 한번 객체 생성한 후에는 안 쓸 것같다.
         */
        Calculator multiCal =  new Calculator() {
            // 클래스 블록 내부
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };




        int result3 = multiCal.operate(6, 11);
        System.out.println("result3 = " + result3);


        Calculator divCal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 / n2;
            }
        };


        Restaurant italian = new Restaurant() {
            private String ownerChefName;

            public void makePasta() {

            }

            @Override
            public void reserve() {
                System.out.println("이탈리안 레스토랑 예약을 받습니다");
            }

            @Override
            public void cook() {
                System.out.println("이탈리안 요리를 만듭니다.");
            }
        };

        italian.cook();
        italian.reserve();
    }
}
