package design.patterns.behavioral.strategy.without;

public class DriftVehicle implements Vehicle{
    @Override
    public void driveTrain() {
        System.out.print("RWD");
    }
}
