package design.patterns.behavioral.strategy.without;

public class RallyVehicle implements Vehicle{
    @Override
    public void driveTrain() {
        System.out.print("AWD");
    }
}
