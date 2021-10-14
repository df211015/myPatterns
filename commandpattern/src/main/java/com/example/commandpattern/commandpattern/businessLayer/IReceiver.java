package com.example.commandpattern.commandpattern.businessLayer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IReceiver {

    boolean zipExec(String source, String to);

    boolean gzipExec(String source, String to);
}
