package app;
import app.Order;
import app.PriceWithDelivery;
import app.PriceWithOutDelivery;
import app.OrderPrice;
import app.View;

public class Controller {

    public static void setOrder(){
        //String[] data = View.getOrderInfo();
        int deliv = Order.getDelivery();
        double finalPrice = 0;
        if(deliv == 1){
            PriceWithDelivery order = new PriceWithDelivery();
            finalPrice = order.calcPrice();
            View.getOutput(finalPrice);
        }
        if(deliv == 2){
            PriceWithOutDelivery order = new PriceWithOutDelivery();
            finalPrice = order.calcPrice();
            View.getOutput(finalPrice);
        }
    }
}
