package package6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerWork {

    private static final Logger LOGGER = LogManager.getLogger(LoggerWork.class);

    public static void main(String[] args) {
        // message/log-data --> Logger --> Filter --> Formatter --> Appender
        LOGGER.fatal("This is a message from logger.fatal");
        LOGGER.warn("This is a message from logger.warn");
        LOGGER.info("This is a message from logger.info");
        LOGGER.debug("This is a message from logger.debug");
        LOGGER.trace("This is a message from logger.trace");
    }
}

