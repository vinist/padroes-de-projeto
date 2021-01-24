package logger.file;

import logger.ifaces.ILogPrinter;
import logger.base.Logger;

public class FileLogCreator extends Logger {
    
    @Override
    protected ILogPrinter createLogger() {
        return new FileLogPrinter();
    }
}
