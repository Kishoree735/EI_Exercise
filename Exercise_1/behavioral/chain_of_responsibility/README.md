# Chain of Responsibility

## Pattern
The Chain of Responsibility pattern lets a request pass through a chain of handlers until one of them processes it.

## Use Case
In a support system, not every issue can be solved by the same level.  
A chatbot might resolve basic queries, but more complex issues get escalated to junior support, then senior support, and finally engineering.

## What It Solves
Removes the need for one central class to handle all conditions.  
Each handler focuses only on what it can solve, and the chain handles escalation automatically.

## Structure
- `Ticket` → Represents a customer issue with a priority level.  
- `SupportHandler` → Abstract class defining the link to the next handler.  
- Handlers (`ChatbotHandler`, `JuniorSupportHandler`, `SeniorSupportHandler`, `EngineeringHandler`) → Decide whether to process or pass the ticket.  
- `ChainOfResponsibilityDemo` → Demonstrates the chain in action.

## What Each Class Does
- **Priority** → Enum for severity (LOW, MEDIUM, HIGH, CRITICAL).  
- **Ticket** → Holds the issue and priority.  
- **SupportHandler** → Abstract base class with `setNext`.  
- **ChatbotHandler** → Handles low-priority tickets.  
- **JuniorSupportHandler** → Handles medium-priority tickets.  
- **SeniorSupportHandler** → Handles high-priority tickets.  
- **EngineeringHandler** → Handles critical tickets.  
- **ChainOfResponsibilityDemo** → Runs the example chain.


