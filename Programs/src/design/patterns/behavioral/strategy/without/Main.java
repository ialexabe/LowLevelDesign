package design.patterns.behavioral.strategy.without;

public class Main {
    static void main() {
        Vehicle vehicle = new DriftVehicle();
        vehicle.driveTrain();
    }
}
