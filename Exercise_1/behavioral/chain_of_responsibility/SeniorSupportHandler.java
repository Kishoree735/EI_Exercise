package behavioral.chain_of_responsibility;

public class SeniorSupportHandler extends SupportHandler {
    @Override
    public String handle(Ticket ticket) {
        if (ticket.getPriority() == Priority.HIGH) {
            return "[SENIOR SUPPORT] Resolved: " + ticket.getIssue() + " - Escalated and resolved";
        } else if (nextHandler != null) {
            return nextHandler.handle(ticket);
        }
        return "No handler available";
    }
}
