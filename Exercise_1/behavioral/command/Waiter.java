package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<OrderCommand> orderHistory = new ArrayList<>();

    public void takeOrder(OrderCommand command) {
        command.execute();
        orderHistory.add(command);
    }

    public void undoLastOrder() {
        if (!orderHistory.isEmpty()) {
            OrderCommand lastOrder = orderHistory.remove(orderHistory.size() - 1);
            lastOrder.undo();
        }
    }

    public void showOrderHistory() {
        System.out.println("\n=== Order History ===");
        for (OrderCommand cmd : orderHistory) {
            System.out.println(cmd.getDescription());
        }
    }
}
