package structural.facade;

public class Main{
    public static void main(String[] args) {
        PaymentGatewayFacade paymentGateway = new PaymentGatewayFacade();

        System.out.println(paymentGateway.processPayment("stripe", 99.99));
        System.out.println(paymentGateway.processPayment("paypal", 149.50));
        System.out.println(paymentGateway.processPayment("razorpay", 50.00));
    }
}
