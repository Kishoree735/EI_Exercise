package commands;

import rocket.Rocket;
import java.util.Scanner;

public class LaunchCommand implements Command 
{
    private final Rocket rocket;

    public LaunchCommand(Rocket rocket) { this.rocket = rocket; }

    @Override
    public void execute() {
        if (!"Ready".equals(rocket.getStatus())) {
            rocket.notifyObservers("Error: Cannot launch. Run start_checks first.");
            return;
        }
        if ("Orbit".equals(rocket.getStatus())) {
            rocket.notifyObservers("Rocket already completed mission.");
            return;
        }

        rocket.setStatus("Launched");
        rocket.notifyObservers("Launch initiated! Press Enter to continue step-by-step, or type fast_forward X");

        Scanner scanner = new Scanner(System.in);

        while (rocket.canContinue()) {
            rocket.simulateStepWithFastForward();

            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.toLowerCase().startsWith("fast_forward")) {
                String[] parts = input.split("\\s+");
                if (parts.length == 2) {
                    try { int seconds = Integer.parseInt(parts[1]); rocket.requestFastForward(seconds); }
                    catch (NumberFormatException e) { System.out.println("Invalid number. Usage: fast_forward X"); }
                } else System.out.println("Usage: fast_forward X");
            }
        }

        rocket.notifyObservers("Rocket mission ended. You can reset or start a new launch.");
    }
}
