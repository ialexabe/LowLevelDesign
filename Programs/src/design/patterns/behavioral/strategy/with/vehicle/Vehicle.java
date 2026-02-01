package design.patterns.behavioral.strategy.with.vehicle;

import design.patterns.behavioral.strategy.with.DriveTrainStrategy.DriveTrainStrategy;

public class Vehicle {
    DriveTrainStrategy strategy;
     Vehicle(DriveTrainStrategy strategy){
        this.strategy = strategy;
    }

    public void getDriveTrain(){
        strategy.getDriveTrain();
    }
}
