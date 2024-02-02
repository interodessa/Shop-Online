package app;

public class Order {
    static String[] data = View.getOrderInfo();
    static int quantity = Integer.parseInt(data[0]);
    static double price = Double.parseDouble(data[1]);
    static int delivery = Integer.parseInt(data[2]);

    public static int getDelivery() {
        return delivery;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
