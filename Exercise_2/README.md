# Rocket Launch Simulator

## Overview
A terminal-based Java application simulating a rocket launch to place a satellite into orbit.  
The simulator works in **discrete time steps**, showing real-time **fuel, altitude, speed, and stage**. Users can **pause, step, or fast-forward** the simulation.

---

## Features
- **Step-by-Step Simulation:** Launch progresses one step at a time.  
- **Fast Forward:** Advance multiple steps with `fast_forward X`.  
- **Pre-Launch Checks:** Validate readiness with `start_checks`.  
- **Telemetry Logging:** Real-time updates logged via observers.  
- **Stage Separation:** Automatic handling of multi-stage rockets.  
- **Mission Outcomes:** Success or failure due to fuel depletion.  
- **Resettable:** Reset the rocket at any point.  

---

## Classes

| Class | Responsibility |
|-------|----------------|
| `Rocket` | Singleton managing rocket state and simulation. |
| `LaunchCommand` | Command to start step-by-step launch. |
| `FastForwardCommand` | Command to fast-forward the rocket. |
| `StartChecksCommand` | Command for pre-launch checks. |
| `Simulator` | Main loop handling user input and commands. |
| `RocketObserver` / `FileLogger` | Observer pattern; logs telemetry updates. |

---

## Design Patterns
- **Singleton:** Only one rocket instance (`Rocket`).  
- **Observer:** Observers get rocket updates (`FileLogger`).  
- **Command:** Encapsulates launch, fast-forward, and checks.  
- **Step-Based Control:** Interactive, pausable simulation.  

---

## Commands

| Command | Description |
|---------|------------|
| `start_checks` | Run pre-launch checks |
| `launch` | Start step-by-step launch |
| `fast_forward X` | Skip X steps |
| `reset` | Reset rocket to pre-launch state |
| `exit` | Exit the simulator |

---

## Visual Flow Diagram

```text
          +----------------+
          |    Simulator   |
          +--------+-------+
                   |
                   v
         +---------+---------+
         |   User Input      |
         | start_checks,     |
         | launch,           |
         | fast_forward X,   |
         | reset             |
         +---------+---------+
                   |
    +--------------+--------------+
    |                             |
    v                             v
+------------+             +------------------+
|StartChecks |             | LaunchCommand    |
| Command    |             +--------+---------+
+------------+                      |
                   +----------------+
                   |
                   v
          +------------------+
          |    Rocket        |
          |----------------- |
          | - fuel, altitude |
          | - speed, stage   |
          | - status         |
          | - simulateStep() |
          | - fastForward()  |
          +--------+---------+
                   |
                   v
          +----------------+
          | RocketObservers|
          | (FileLogger)   |
          +----------------+

```
## OUTPUT SCREENSHOTS
### Initial Launch command with fast forwarding 
![alt text](image.png)

### File Logging
![alt text](image-1.png)

### Reset Command
![alt text](image-2.png)


