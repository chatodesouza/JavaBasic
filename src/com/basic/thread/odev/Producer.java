package com.basic.thread.odev;

public class Producer extends Thread {
	private int baslangic;
	private int bitis;
	
	public Producer(int baslangic, int bitis) {
		this.baslangic = baslangic;
		this.bitis = bitis;
	}
	
	@Override
	public void run() {
		for (int i = baslangic; i < bitis; i++) {
			System.out.println(i);
		}
}

}
