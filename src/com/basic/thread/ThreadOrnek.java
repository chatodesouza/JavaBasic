package com.basic.thread;

public class ThreadOrnek extends Thread { //extends OfficeDecoder implements Runnable > Runnable Thread'in Interface Hali
	
	private int baslangic;
	private int bitis;
	
	public ThreadOrnek(int baslangic, int bitis) {
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
