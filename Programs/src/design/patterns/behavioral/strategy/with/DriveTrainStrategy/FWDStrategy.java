package design.patterns.behavioral.strategy.with.DriveTrainStrategy;

public class FWDStrategy implements DriveTrainStrategy{
    @Override
    public void getDriveTrain() {
        System.out.print("FWD");
    }
}
