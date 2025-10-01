package structural.facade;

public class StripePayment {
    public String processPayment(double amount) {
        return "Stripe: Processed $" + amount;
    }
}
