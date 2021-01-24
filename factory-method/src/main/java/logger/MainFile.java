package logger;

import logger.base.Logger;
import logger.file.FileLogCreator;

public class MainFile {
    
    public static void main(String[] args) {
        Logger logger = new FileLogCreator();
        logger.log("Logando mensagem no arquivo");
    }
}
