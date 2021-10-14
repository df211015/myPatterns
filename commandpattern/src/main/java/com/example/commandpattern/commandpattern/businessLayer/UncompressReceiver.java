package com.example.commandpattern.commandpattern.businessLayer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UncompressReceiver implements IReceiver {
    public boolean gzipExec(String source, String to) {
        System.out.println(source + " --> " + to + " GZIP解压成功!");
        return true;
    }

    public boolean zipExec(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP解压成功!");
        return true;
    }
}
