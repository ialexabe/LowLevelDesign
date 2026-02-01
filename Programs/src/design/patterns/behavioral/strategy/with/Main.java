package design.patterns.behavioral.strategy.with;

import design.patterns.behavioral.strategy.with.vehicle.DriftVehicle;
import design.patterns.behavioral.strategy.with.vehicle.EuropeVehicle;
import design.patterns.behavioral.strategy.with.vehicle.RallyVehicle;
import design.patterns.behavioral.strategy.with.vehicle.Vehicle;

public class Main {
    private Main(){}
    static void main() {
        Vehicle driftVehicle = new DriftVehicle();
        Vehicle rallyVehicle = new RallyVehicle();
        Vehicle europeVehicle = new EuropeVehicle();
        driftVehicle.getDriveTrain();
        rallyVehicle.getDriveTrain();
        europeVehicle.getDriveTrain();
    }

}
