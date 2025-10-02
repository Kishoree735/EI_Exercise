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

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/41f94f67-2319-4193-b872-74fbd9261c48" />

## OUTPUT SCREENSHOTS

### Start_checks command
<img width="1155" height="158" alt="image" src="https://github.com/user-attachments/assets/07b4b770-5383-49d9-87c9-ade2e49e85bc" />

### Launch command with fast_forwarding
<img width="907" height="225" alt="image" src="https://github.com/user-attachments/assets/ce493b7e-269e-4e56-a3ce-846d44a7be80" />

### Stage 1 to Stage 2 transition
<img width="637" height="180" alt="image" src="https://github.com/user-attachments/assets/f30dd630-c98f-445e-a36a-772c842fb964" />

### File Logging
<img width="967" height="572" alt="image" src="https://github.com/user-attachments/assets/694501ab-9499-4b00-8ca7-71d4b5e0fccb" />

### Reset Command
<img width="607" height="257" alt="image" src="https://github.com/user-attachments/assets/86349dd0-6924-4bec-a33d-2856a323a24a" />

### Exit Command
<img width="467" height="72" alt="image" src="https://github.com/user-attachments/assets/a9feae33-a786-4e77-8099-fb6e2c8bfe6b" />




