package logger.base;

import logger.ifaces.ILogPrinter;

public abstract class Logger {
    
    protected abstract ILogPrinter createLogger();
    
    public void log(String message){
        createLogger().print(message);
    }
}
