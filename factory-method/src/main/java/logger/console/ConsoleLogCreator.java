package logger.console;

import logger.ifaces.ILogPrinter;
import logger.base.Logger;

public class ConsoleLogCreator extends Logger {
    
    @Override
    protected ILogPrinter createLogger() {
        return new ConsoleLogPrinter();
    }
}
