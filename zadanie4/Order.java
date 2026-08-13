package practice_14.zadanie4;

public class Order {

    String orderId;
    double price;
    String email;
    String productName;

    public Order(String orderId, String productName, double price, String email) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
        this.email = email;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getPrice() {
        return price;
    }

    public String getEmail() {
        return email;
    }

    public String getProductName() {
        return productName;
    }

    public void processOrder() {
        System.out.println("Обрабатываем заказ " + getOrderId());
    }
}
