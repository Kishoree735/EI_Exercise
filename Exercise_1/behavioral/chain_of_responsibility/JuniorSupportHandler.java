package behavioral.chain_of_responsibility;

public class JuniorSupportHandler extends SupportHandler {
    @Override
    public String handle(Ticket ticket) {
        if (ticket.getPriority() == Priority.MEDIUM) {
            return "[JUNIOR SUPPORT] Resolved: " + ticket.getIssue() + " - Ticket closed by agent";
        } else if (nextHandler != null) {
            return nextHandler.handle(ticket);
        }
        return "No handler available";
    }
}
