package com.sbproj.springdatarest.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    public void logMethodExecution() {
        // Implement logging logic here
        logger.info("Method executed");
    }
}
