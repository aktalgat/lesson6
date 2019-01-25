package kg.geektech;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        new Person();
        logger.debug("Пример debug сообщения");
        logger.info("Пример info сообщения");
        logger.warn("Пример warn сообщения");
        logger.warn("Пример warn сообщения");
        logger.error("Пример error сообщения");
        logger.fatal("Пример fatal сообщения");
    }
}