package design.patterns.behavioral.strategy.without;

public class Main {
    private Main(){}
    static void main() {
        Vehicle vehicle1 = new DriftVehicle();
        Vehicle vehicle2 = new EuropeVehicle();
        Vehicle vehicle3 = new IndianVehicle();
        Vehicle vehicle4 = new RallyVehicle();
        vehicle1.driveTrain();
        vehicle2.driveTrain();
        vehicle3.driveTrain();
        vehicle4.driveTrain();
    }
}
