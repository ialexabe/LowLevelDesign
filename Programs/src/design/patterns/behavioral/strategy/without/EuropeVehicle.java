package design.patterns.behavioral.strategy.without;

public class EuropeVehicle implements Vehicle{
    @Override
    public void driveTrain() {
        System.out.print("FWD");
    }
}
