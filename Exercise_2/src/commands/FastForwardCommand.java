package commands;
import java.util.Scanner;
import rocket.Rocket;

public class FastForwardCommand implements Command {
    private final Rocket rocket;
    private final int seconds;

    public FastForwardCommand(Rocket rocket, int seconds) {
        this.rocket = rocket;
        this.seconds = seconds;
    }

    @Override
    public void execute() {
        if (!rocket.canContinue()) {
            rocket.notifyObservers("Error: Cannot fast-forward. Rocket not in flight.");
            return;
        }

        if (seconds <= 0) {
            rocket.notifyObservers("Error: Invalid time value. Must be positive.");
            return;
        }

        rocket.requestFastForward(seconds);
    }
}
