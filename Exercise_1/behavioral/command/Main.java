package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        OrderCommand order1 = new PlaceOrderCommand(kitchen, "Pizza");
        OrderCommand order2 = new PlaceOrderCommand(kitchen, "Pasta");

        waiter.takeOrder(order1);
        waiter.takeOrder(order2);
        waiter.showOrderHistory();

        System.out.println("\nCustomer changed mind, undoing last order:");
        waiter.undoLastOrder();
        waiter.showOrderHistory();
    }
}
