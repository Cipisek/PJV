package cz.cvut.fel.pjv.simulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Configures and provides an application-wide logger.
 * First logger implementation found on the internet, might use different one.
 */
public class AppLogger {
    private static final Logger logger = LoggerFactory.getLogger(AppLogger.class);

    public static Logger getLogger() {
        return logger;
    }
}
