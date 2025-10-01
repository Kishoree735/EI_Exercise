# Prototype

## Pattern
The Prototype pattern creates new objects by cloning an existing one.

## Use Case
In a document management system, templates like contracts or invoices are reused often.  
Instead of building them from scratch every time, they can be cloned and customized.

## What It Solves
It avoids the cost and repetition of creating complex objects multiple times.  
Cloning allows efficient creation of new instances.

## Structure
- `DocumentPrototype` → Interface defining the clone method.  
- `Contract` and `Invoice` → Concrete prototypes.  
- `DocumentTemplateManager` → Stores templates and returns clones.  
- `PrototypeDemo` → Shows cloning and customization.

## What Each Class Does
- **DocumentPrototype** → Defines clone and customization methods.  
- **Contract** → Template for contracts.  
- **Invoice** → Template for invoices.  
- **DocumentTemplateManager** → Holds templates and returns cloned instances.  
- **PrototypeDemo** → Demonstrates creating customized documents from templates.

