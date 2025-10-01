# Command

## Pattern
The Command pattern turns a request into an object, allowing execution to be parameterized, queued, or logged.

## Use Case
In a restaurant, a waiter takes an order and passes it to the kitchen.  
The waiter doesn’t need to know how the food is cooked, only how to relay the order.

## What It Solves
Decouples the invoker (waiter) from the receiver (kitchen).  
Commands allow flexible, extendable requests without changing core classes.

## Structure
- `OrderCommand` → Interface for commands.  
- `PlaceOrderCommand` → Concrete command that calls the kitchen.  
- `Kitchen` → Receiver that executes orders.  
- `Waiter` → Invoker that triggers commands.  
- `CommandDemo` → Shows placing and undoing orders.

## What Each Class Does
- **Kitchen** → Prepares or cancels dishes.  
- **OrderCommand** → Defines `execute`, `undo`, `getDescription`.  
- **PlaceOrderCommand** → Stores order and calls Kitchen.  
- **Waiter** → Accepts commands, maintains history, can undo.  
- **CommandDemo** → Demonstrates order placement.

