# Abstract Factory

## Pattern
The Abstract Factory pattern creates families of related objects without specifying their exact classes.

## Use Case
In cloud computing, different providers like AWS and Azure offer their own services.  
A system should be able to switch providers without rewriting client code.

## What It Solves
It hides the complexity of choosing concrete classes and ensures that related objects from the same family are used together.

## Structure
- `CloudFactory` → Abstract factory interface.  
- `AWSFactory` and `AzureFactory` → Concrete factories.  
- `VirtualMachine`, `Database`, `Storage` → Abstract products.  
- Provider-specific classes → Concrete products.  
- `AbstractFactoryDemo` → Demonstrates resource creation.

## What Each Class Does
- **VirtualMachine / Database / Storage** → Abstract product interfaces.  
- **AWSVirtualMachine / AWSDatabase / AWSStorage** → AWS-specific implementations.  
- **AzureVirtualMachine / AzureDatabase / AzureStorage** → Azure-specific implementations.  
- **CloudFactory** → Factory interface to create VMs, DBs, and storage.  
- **AWSFactory / AzureFactory** → Concrete factories for each cloud provider.  
- **AbstractFactoryDemo** → Demonstrates provisioning resources on AWS and Azure.


