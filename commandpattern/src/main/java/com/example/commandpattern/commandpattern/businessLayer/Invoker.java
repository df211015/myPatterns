package com.example.commandpattern.commandpattern.businessLayer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Invoker {
    private AbstractCmd cmd;

    public Invoker(AbstractCmd _cmd) {
        this.cmd = _cmd;
    }

    public boolean execute(String source, String to) {
        return cmd.execute(source, to);
    }
}
