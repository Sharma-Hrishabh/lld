package org.lld.logger;

public class LoggingClient {
    public LoggingClient(){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR,"Error msg");
        logProcessor.log(LogProcessor.DEBUG,"Debug msg");
        logProcessor.log(LogProcessor.INFO,"Info msg");

    }
}
