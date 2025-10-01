package structural.facade;

public class PaymentGatewayFacade {
    private StripePayment stripe;
    private PayPalPayment paypal;
    private RazorpayPayment razorpay;

    public PaymentGatewayFacade() {
        this.stripe = new StripePayment();
        this.paypal = new PayPalPayment();
        this.razorpay = new RazorpayPayment();
    }

    public String processPayment(String provider, double amount) {
        switch (provider.toLowerCase()) {
            case "stripe":
                return stripe.processPayment(amount);
            case "paypal":
                return paypal.executePayment(amount);
            case "razorpay":
                return razorpay.initiateTransaction(amount);
            default:
                return "Invalid payment provider";
        }
    }
}
