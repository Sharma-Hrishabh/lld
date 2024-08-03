package org.lld.logger;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);

    }

    @Override
    public void log(int level, String msg) {
        if(level==LogProcessor.ERROR) {
            System.err.println("ERROR " + msg);
        }else {
            if(super.nextProcessor!=null) super.nextProcessor.log(level, msg);
        }
    }
}
