package design.patterns.behavioral.strategy.with.vehicle;

import design.patterns.behavioral.strategy.with.DriveTrainStrategy.RWDStrategy;

public class DriftVehicle extends Vehicle {
    public DriftVehicle(){
        super(new RWDStrategy());
    }

}
