package design.patterns.behavioral.strategy.with.vehicle;

import design.patterns.behavioral.strategy.with.drivetrainstrategy.FWDStrategy;

public class EuropeVehicle extends Vehicle{
    public EuropeVehicle(){
        super(new FWDStrategy());
    }

}
