# Exercise 1

## Overview
This exercise demonstrates **Behavioral, creational and structural design patterns** in Java.  
Each pattern is implemented in a separate folder with its own `main` method for testing and a README describing the pattern.

The exercise covers:

1. **Chain of Responsibility (Behavioral)**  
2. **Command (Behavioral)**  
3. **Abstract Factory (Creational)**  
4. **Prototype (Creational)**  
5. **Facade (Structural)**  
6. **Proxy (Structural)**

# Exercise 2

## Overview
This exercise is a **Rocket Launch Simulator** in Java, demonstrating the **Command** , **Observer** and **Singleton** patterns with **file logging**.  
It allows step-by-step rocket simulation, fast-forwarding, and resetting, while logging all events to `logs/rocket_log.txt`.

## Commands
- `start_checks` – Run pre-launch checks  
- `launch` – Start rocket launch (step-by-step)  
- `fast_forward X` – Skip X seconds  
- `reset` – Reset rocket for a new launch  
- `exit` – Exit simulator

## Logging
All rocket events are printed to the console and saved in `logs/rocket_log.txt`.
