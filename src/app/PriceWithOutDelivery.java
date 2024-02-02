package app;

public class PriceWithOutDelivery implements OrderPrice {
    @Override
    public double calcPrice() {
        int quantity = Order.getQuantity();
        double price = Order.getPrice();
        return quantity * price;
    }
}
