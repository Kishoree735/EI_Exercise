package commands;

import rocket.Rocket;

public class StartChecksCommand implements Command 
{
    private Rocket rocket;

    public StartChecksCommand(Rocket rocket) 
    {
        this.rocket = rocket;
    }

   @Override
public void execute() 
{
    if (rocket == null) {
        System.out.println("Error: Rocket instance is null.");
        return;
    }

    if ("Launched".equals(rocket.getStatus()) || "In-Flight".equals(rocket.getStatus())) {
        rocket.notifyObservers("Error: Cannot run checks. Rocket already launched.");
        return;
    }

    if (rocket.getFuel() < 10) {
        rocket.notifyObservers("Warning: Fuel level critically low (" + rocket.getFuel() + "%). Refueling recommended.");
    }

    rocket.setStatus("Ready");
    rocket.notifyObservers("All systems are 'Go' for launch.");
}    
    
}