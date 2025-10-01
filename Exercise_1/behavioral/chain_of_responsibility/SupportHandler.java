package behavioral.chain_of_responsibility;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public abstract String handle(Ticket ticket);
}
