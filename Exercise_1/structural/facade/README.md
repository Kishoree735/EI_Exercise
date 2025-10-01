# Facade

## Pattern
The Facade pattern provides a unified interface to a set of subsystems.

## Use Case
Integrating multiple payment gateways (Stripe, PayPal, Razorpay) can be complex.  
Clients should interact with a simple, consistent API instead of each subsystem.

## What It Solves
It hides the complexity of multiple APIs behind one class, making usage simple and consistent.

## Structure
- Subsystems: `StripePayment`, `PayPalPayment`, `RazorpayPayment`.  
- `PaymentGatewayFacade` → Provides one interface for all payments.  
- `FacadeDemo` → Demonstrates payment processing through the facade.

## What Each Class Does
- **StripePayment / PayPalPayment / RazorpayPayment** → Process payments independently.  
- **PaymentGatewayFacade** → Combines all payment methods into one interface.  
- **FacadeDemo** → Shows client using the unified facade.

