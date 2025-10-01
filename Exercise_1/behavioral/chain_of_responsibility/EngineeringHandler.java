package behavioral.chain_of_responsibility;

public class EngineeringHandler extends SupportHandler {
    @Override
    public String handle(Ticket ticket) {
        if (ticket.getPriority() == Priority.CRITICAL) {
            return "[ENGINEERING] Resolved: " + ticket.getIssue() + " - Critical bug fixed";
        }
        return "No handler available";
    }
}
