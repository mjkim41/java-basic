package chap2_3.generic;

// F을 담을 건데, F는 Basket이 생성될 때 결정할거다
public class Basket<F extends Fruit>  {

    // F : 제네릭 타입 - 아직 설계 당시에는 정확한 타입이 없는 상태
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }

}
