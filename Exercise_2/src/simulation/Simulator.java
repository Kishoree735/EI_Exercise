package simulation;

import commands.*;
import rocket.Rocket;
import logging.FileLogger;
import java.util.Scanner;

public class Simulator {

    private final Rocket rocket = Rocket.getInstance();
    private final Scanner scanner = new Scanner(System.in);

    public Simulator() {
        rocket.attach(new FileLogger("logs/rocket_log.txt"));
    }

    public void start() {
        System.out.println("Welcome to Rocket Launch Simulator!");
        System.out.println("Commands: start_checks, launch, fast_forward X, reset, exit");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) continue;

            String[] parts = input.split("\\s+");
            String cmd = parts[0].toLowerCase();

            switch (cmd) {
                case "start_checks":
                    new StartChecksCommand(rocket).execute();
                    break;

                case "launch":
                    new LaunchCommand(rocket).execute(); // step-by-step
                    break;

                case "fast_forward":
                    if (parts.length == 2) {
                        try {
                            int seconds = Integer.parseInt(parts[1]);
                            new FastForwardCommand(rocket, seconds).execute();
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Invalid number format. Usage: fast_forward X");
                        }
                    } else {
                        System.out.println("Usage: fast_forward X (where X is seconds)");
                    }
                    break;

                case "reset":
                    rocket.reset();
                    break;

                case "exit":
                    System.out.println("Exiting simulator.");
                    return;

                default:
                    System.out.println("Unknown command. Available: start_checks, launch, fast_forward X, reset, exit");
            }
        }
    }
}
