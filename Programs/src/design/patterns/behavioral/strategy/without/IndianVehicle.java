package design.patterns.behavioral.strategy.without;

public class IndianVehicle implements Vehicle{
    @Override
    public void driveTrain() {
        System.out.print("FWD");
    }
}
