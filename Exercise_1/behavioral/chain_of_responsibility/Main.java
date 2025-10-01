package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        ChatbotHandler chatbot = new ChatbotHandler();
        JuniorSupportHandler junior = new JuniorSupportHandler();
        SeniorSupportHandler senior = new SeniorSupportHandler();
        EngineeringHandler engineering = new EngineeringHandler();

        chatbot.setNext(junior);
        junior.setNext(senior);
        senior.setNext(engineering);

        Ticket t1 = new Ticket("Password reset", Priority.LOW);
        Ticket t2 = new Ticket("Billing inquiry", Priority.MEDIUM);
        Ticket t3 = new Ticket("System outage", Priority.CRITICAL);

        System.out.println(chatbot.handle(t1));
        System.out.println(chatbot.handle(t2));
        System.out.println(chatbot.handle(t3));
    }
}
