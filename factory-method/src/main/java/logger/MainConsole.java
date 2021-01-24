package logger;

import logger.base.Logger;
import logger.console.ConsoleLogCreator;

public class MainConsole {
    
    public static void main(String[] args) {
        Logger logger = new ConsoleLogCreator();
        logger.log("Logando mensagem no console");
    }
}
