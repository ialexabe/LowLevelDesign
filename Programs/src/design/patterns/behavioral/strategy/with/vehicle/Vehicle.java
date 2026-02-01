package design.patterns.behavioral.strategy.with.vehicle;

import design.patterns.behavioral.strategy.with.drivetrainstrategy.DriveTrainStrategy;

public class Vehicle {
    final DriveTrainStrategy strategy;
     Vehicle(DriveTrainStrategy strategy){
        this.strategy = strategy;
    }

    public void getDriveTrain(){
        strategy.getDriveTrain();
    }
}
