package behavioral.command;

public class Kitchen {
    public void prepareOrder(String item) {
        System.out.println("Kitchen: Preparing " + item);
    }

    public void cancelOrder(String item) {
        System.out.println("Kitchen: Cancelling " + item);
    }
}
