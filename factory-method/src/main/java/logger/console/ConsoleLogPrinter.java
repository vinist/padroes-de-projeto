package logger.console;

import logger.ifaces.ILogPrinter;

public class ConsoleLogPrinter implements ILogPrinter {
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
