package com.example.commandpattern.commandpattern.businessLayer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractCmd {
    protected IReceiver compress = new CompressReceiver();
    protected IReceiver uncompress = new UncompressReceiver();

    public abstract boolean execute(String source, String to);
}