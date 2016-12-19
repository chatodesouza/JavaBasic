package com.basic.thread.odev;

import java.util.TimerTask;

public class Producer extends TimerTask {
	Apple apple = new Apple("Apple");
	Banana banana = new Banana("Banana");
	Cherry cherry = new Cherry("Cherry");
	Watermelon watermelon = new Watermelon("Watermelon");

	@Override
	public void run() {
		if(apple.getNumberOfApples()!=watermelon.numberOfItemsForEachProduct&&apple.getNumberOfApples()!=null){
			apple.fillInApples();
		}
		if(banana.getNumberOfBananas()!=watermelon.numberOfItemsForEachProduct&&apple.getNumberOfApples()!=null){
			banana.fillInBananas();
		}
		if(cherry.getNumberOfCherries()!=watermelon.numberOfItemsForEachProduct&&apple.getNumberOfApples()!=null){
			cherry.fillInCherries();
		}
		if(watermelon.getNumberOfWatermelons()!=watermelon.numberOfItemsForEachProduct&&apple.getNumberOfApples()!=null){
			watermelon.fillInWatermelons();
		}
	}
	

}
