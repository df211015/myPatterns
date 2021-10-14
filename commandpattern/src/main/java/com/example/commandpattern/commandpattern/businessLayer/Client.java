package com.example.commandpattern.commandpattern.businessLayer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractCmd cmd = new ZipCompressCmd();
		/*
		 *
		 * AbstractCmd cmd = new ZipUncompressCmd();
		 */
		Invoker invoker = new Invoker(cmd);
		System.out.println("================");
		invoker.execute("c:\\windows", "d:\\windows.zip");
	}
}
