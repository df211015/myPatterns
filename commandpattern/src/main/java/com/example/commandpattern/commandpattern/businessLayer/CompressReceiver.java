package com.example.commandpattern.commandpattern.businessLayer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class CompressReceiver implements IReceiver {
    public boolean gzipExec(String source, String to) {
        System.out.println(source + " --> " + to + " GZIP压缩成功!");
        return true;
    }

    public boolean zipExec(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP压缩成功!");
        return true;
    }
}
