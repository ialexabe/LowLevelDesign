package design.patterns.behavioral.strategy.without;

import java.util.logging.Logger;

public class DriftVehicle implements Vehicle{
    final Logger logger = Logger.getLogger(getClass().getName());
    @Override
    public void driveTrain() {
        logger.info("RWD");
    }
}
