package org.lld.logger;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);

    }

    @Override
    public void log(int level, String msg) {
        if(level==LogProcessor.DEBUG) {
            System.err.println("DEBUG " + msg);
        }else {
            if(super.nextProcessor!=null) super.nextProcessor.log(level, msg);
        }
    }
}

