package structural.facade;

public class PayPalPayment {
    public String executePayment(double amount) {
        return "PayPal: Executed payment of $" + amount;
    }
}
