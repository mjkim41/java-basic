package chap1_7.inherit.example.order;

public class Main {

    public static void main(String[] args) {

        OnlineOrder order1 = new OnlineOrder("A13", 2000, 4500);
        double totalAmount = order1.calculateTotalAmount();
        System.out.println(totalAmount);
    }
}
