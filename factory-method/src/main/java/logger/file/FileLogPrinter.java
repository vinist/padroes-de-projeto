package logger.file;

import logger.ifaces.ILogPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogPrinter implements ILogPrinter {
    
    @Override
    public void print(String message) {
        try {
            FileWriter arq = new FileWriter("log.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(message);
            arq.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
