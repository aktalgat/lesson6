package kg.geektech;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {

    static final Logger logger = LogManager.getLogger(Person.class);

    public Person() {
        logger.debug("Degug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
        logger.fatal("Fatal message");

    }
}
