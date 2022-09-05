package com.jindo.core.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author ManhKM on 9/5/2022
 * @project spring-boot-log4j2
 */
public class LogFactory {

    public static Logger getLogger(){

        Logger logger = Logger.getLogger("Fresher Academy");
        FileHandler fileHandler = null;

        try {
            fileHandler = new FileHandler("logs/login/page-visitor.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.WARNING);         // Set Level in ra là WARNING -> cấp bé hơn WARNING sẽ in ra
            logger.setUseParentHandlers(false);     // Chỉ in ra file, không in ra console
        } catch (IOException e) {
            e.printStackTrace();
        }

        return logger;
    }
}
