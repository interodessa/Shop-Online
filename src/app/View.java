package app;
import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);
    public static String[] getOrderInfo() {
        System.out.print("Enter product quantity: ");
        String quantity = scanner.nextLine().trim();
        System.out.print("Enter product price: ");
        String price = scanner.nextLine().trim();
        System.out.print("Delivery:\n1) Yes\n2) No\n");
        String deliv = scanner.nextLine().trim();
        return new String[]{quantity, price, deliv};
    }
    public static void getOutput(double output) {

        System.out.println("final cost :" + output);
    }
}
