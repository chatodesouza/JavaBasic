package com.basic.thread.odev;

import java.util.Timer;

public class Consumer {
	private static ConsoleWriter cW;
	private static Producer producer = new Producer();

	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(producer, 5000, 10000);
		cW = new ConsoleWriter();

	}

}
