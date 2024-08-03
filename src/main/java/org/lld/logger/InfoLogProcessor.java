package org.lld.logger;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int level, String msg) {
        if(level==LogProcessor.INFO) {
            System.err.println("INFO " + msg);
        }else {
            if(super.nextProcessor!=null) super.nextProcessor.log(level, msg);
        }
    }
}
