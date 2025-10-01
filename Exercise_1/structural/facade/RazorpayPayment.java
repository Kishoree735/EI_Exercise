package structural.facade;

public class RazorpayPayment {
    public String initiateTransaction(double amount) {
        return "Razorpay: Transaction initiated for ₹" + (amount * 83);
    }
}
