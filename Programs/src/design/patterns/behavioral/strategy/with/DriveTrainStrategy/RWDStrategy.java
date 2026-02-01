package design.patterns.behavioral.strategy.with.DriveTrainStrategy;

public class RWDStrategy implements DriveTrainStrategy {
    @Override
    public void getDriveTrain() {
        System.out.print("RWD");
    }
}
