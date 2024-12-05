package chap2_3.generic;

public class Apple implements Fruit {

    private int sweet;

    public Apple(int sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "sweet=" + sweet +
                '}';
    }

  
}
