package behavioral.chain_of_responsibility;

public class ChatbotHandler extends SupportHandler {
    @Override
    public String handle(Ticket ticket) {
        if (ticket.getPriority() == Priority.LOW) {
            return "[CHATBOT] Resolved: " + ticket.getIssue() + " - Auto-response sent";
        } else if (nextHandler != null) {
            return nextHandler.handle(ticket);
        }
        return "No handler available";
    }
}
