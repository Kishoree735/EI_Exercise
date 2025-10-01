package rocket;

import logging.RocketObserver;
import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private static Rocket instance;

    private int fuel, altitude, speed, stage;
    private String status;
    private final List<RocketObserver> observers = new ArrayList<>();

    private boolean fastForwardRequested = false;
    private int fastForwardSeconds = 0;

    private Rocket() { reset(); }

    public static synchronized Rocket getInstance() {
        if (instance == null) instance = new Rocket();
        return instance;
    }

    public void attach(RocketObserver observer) {
        if (observer != null && !observers.contains(observer)) observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (RocketObserver o : observers) o.update(message);
    }

    public synchronized void requestFastForward(int seconds) {
        fastForwardRequested = true;
        fastForwardSeconds += seconds;
    }

    public boolean canContinue() {
        return !"Orbit".equals(status) && !"Failed".equals(status);
    }

    // One simulation step
    public void simulateStep() {
        int stage1Fuel = 10, stage2Fuel = 3;
        int stage1Alt = 9, stage2Alt = 8;
        int stage1Speed = 700, stage2Speed = 600;

        if (fuel <= 0) { fuel = 0; status = "Failed"; notifyObservers("Mission Failed: Out of fuel"); return; }
        if (altitude >= 100) { altitude = 100; status = "Orbit"; notifyObservers("Orbit achieved! Mission Successful."); return; }

        if (stage == 1) { fuel = Math.max(0, fuel - stage1Fuel); altitude += stage1Alt; speed += stage1Speed; }
        else { fuel = Math.max(0, fuel - stage2Fuel); altitude += stage2Alt; speed += stage2Speed; }

        if (stage == 1 && altitude >= 50) { stage = 2; notifyObservers("Stage 1 complete. Entering Stage 2."); }

        notifyObservers("Stage: " + stage + ", Fuel: " + fuel + "%, Altitude: " + altitude + " km, Speed: " + speed + " km/h");
    }

    // Step simulation with fast-forward
    public void simulateStepWithFastForward() {
        int steps = 1;
        synchronized(this) {
            if (fastForwardRequested) { steps += fastForwardSeconds; fastForwardRequested = false; fastForwardSeconds = 0;
                notifyObservers("Fast-forwarding " + steps + " seconds..."); }
        }
        for (int i = 0; i < steps; i++) { if (!canContinue()) break; simulateStep(); }
    }

    public void reset() {
        fuel = 100; altitude = 0; speed = 0; stage = 1; status = "Pre-Launch";
        fastForwardRequested = false; fastForwardSeconds = 0;
        notifyObservers("Rocket reset to initial state.");
    }

    // Getters
    public int getFuel() { return fuel; }
    public int getAltitude() { return altitude; }
    public int getSpeed() { return speed; }
    public int getStage() { return stage; }
    public String getStatus() { return status; }
    public void setStatus(String status) { if (status != null && !status.isBlank()) this.status = status; }
}
