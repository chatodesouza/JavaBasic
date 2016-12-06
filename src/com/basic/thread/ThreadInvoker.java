package com.basic.thread;

public class ThreadInvoker {
	
	public static void main(String[] args) {
		
		ThreadOrnek threadOrnek = new ThreadOrnek(0, 250);
		ThreadOrnek threadOrnek2 = new ThreadOrnek(251, 500);
		ThreadOrnek threadOrnek3 = new ThreadOrnek(501, 7500);
		ThreadOrnek threadOrnek4 = new ThreadOrnek(7501, 7600);
		
		threadOrnek.start();
		threadOrnek2.start();
		threadOrnek3.start();
		threadOrnek4.start();
	}

}
