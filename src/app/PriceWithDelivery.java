package app;
import app.Order;
public class PriceWithDelivery implements OrderPrice {
    @Override
    public double calcPrice() {
        int quantity = Order.getQuantity();
        double price = Order.getPrice();
        double addPrice = quantity * price * 0.03;
        return quantity * price + addPrice;
    }
}
