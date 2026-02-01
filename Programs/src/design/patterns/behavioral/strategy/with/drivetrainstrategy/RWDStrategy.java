package design.patterns.behavioral.strategy.with.drivetrainstrategy;

import java.util.logging.Logger;

public class RWDStrategy implements DriveTrainStrategy {
    final Logger logger = Logger.getLogger(getClass().getName());
    @Override
    public void getDriveTrain() {
        logger.info("RWD");
    }
}
