package com.vruksha.common.logger;

import java.util.logging.*;

public class VLogger {

    private static final Logger logger = Logger.getLogger(VLogger.class.getName());

    public static void main(String[] args) {
    	VLogger loggerWrapper = new VLogger();
        loggerWrapper.logInfo("This is an informational message. ");
        loggerWrapper.logWarning("This is a warning message.");
        loggerWrapper.logError("This is an error message.");
        try {
            int result = 10 / 0; // Division by zero
        } catch (Exception e) {
            loggerWrapper.logException(Level.SEVERE, "An exception occurred.", e);
        }
    }

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
        logger.log(Level.INFO, message);
    }

    public static void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    public static void logError(String message) {
        logger.log(Level.SEVERE, message);
    }

    public static void logException(Level level, String message, Throwable throwable) {
        logger.log(level, message, throwable);
    }
}

