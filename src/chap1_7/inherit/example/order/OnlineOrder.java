package chap1_7.inherit.example.order;

public class OnlineOrder extends Order{

    public double deliveryFee;

    public OnlineOrder(String orderId, double amount, double deliveryFee) {
        super(orderId, amount);
        this.deliveryFee = deliveryFee;
    }

    @Override
    public void process() {
        System.out.println("온라인 주문 처리 완료");
    }

    public double calculateTotalAmount() {
        return this.amount + this.deliveryFee;
    }
}
