package design.patterns.behavioral.strategy.with.DriveTrainStrategy;

public class AWDStrategy implements DriveTrainStrategy{
    @Override
    public void getDriveTrain() {
        System.out.print("AWD");
    }
}
