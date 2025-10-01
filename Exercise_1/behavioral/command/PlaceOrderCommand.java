package behavioral.command;

public class PlaceOrderCommand implements OrderCommand {
    private Kitchen kitchen;
    private String item;

    public PlaceOrderCommand(Kitchen kitchen, String item) {
        this.kitchen = kitchen;
        this.item = item;
    }

    @Override
    public void execute() {
        kitchen.prepareOrder(item);
    }

    @Override
    public void undo() {
        kitchen.cancelOrder(item);
    }

    @Override
    public String getDescription() {
        return "Order: " + item;
    }
}
