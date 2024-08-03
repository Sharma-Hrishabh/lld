package org.lld.logger;

public abstract class LogProcessor {

    public static int ERROR = 0;
    public static int DEBUG = 1;
    public static int INFO = 2;


    LogProcessor nextProcessor;
    public LogProcessor(LogProcessor logProcessor){
        this.nextProcessor = logProcessor;
    }

    public abstract void log(int level, String msg);
}
