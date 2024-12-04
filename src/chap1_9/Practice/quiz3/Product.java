package chap1_9.Practice.quiz3;

public class Product {

    private String productName;
    private int price;
    private static final double DISCOUNT_RATE = 0.1;

    public Product(String productName, int price) {
        this.price = price;
        this.productName = productName;
    }

    public void getPrice() {
        System.out.printf("상품명 : %s        \n정가 : %d \n", productName, price);
    }


    public void getdiscountedPrice() {
            int discountedPrice = (int) Math.round(price * DISCOUNT_RATE);
            System.out.printf("상품명 : %s        \n할인가 : %d \n", productName, discountedPrice);
        }

}
