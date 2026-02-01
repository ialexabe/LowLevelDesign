package design.patterns.behavioral.strategy.with.vehicle;

import design.patterns.behavioral.strategy.with.DriveTrainStrategy.AWDStrategy;

public class RallyVehicle extends Vehicle{
    public RallyVehicle(){
        super(new AWDStrategy());
    }

}
