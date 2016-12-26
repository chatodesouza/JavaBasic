package com.basic.thread.odev;

import java.util.TimerTask;

import com.basic.thread.odev.products.Apple;
import com.basic.thread.odev.products.Banana;
import com.basic.thread.odev.products.Cherry;
import com.basic.thread.odev.products.Watermelon;

public class Producer extends TimerTask {
	Apple apple = new Apple("Apple");
	Banana banana = new Banana("Banana");
	Cherry cherry = new Cherry("Cherry");
	Watermelon watermelon = new Watermelon("Watermelon");

	@Override
	public void run() {
		if(apple.getNumberOfApples()!=null && apple.getNumberOfApples()!=apple.getNumberOfItemsForEachProduct()){
			apple.fillInApples();
		}
		
		if(banana.getNumberOfBananas() != null && banana.getNumberOfBananas()!=banana.getNumberOfItemsForEachProduct()){
			banana.fillInBananas();
		}
		
		if(cherry.getNumberOfCherries() != null && cherry.getNumberOfCherries()!=cherry.getNumberOfItemsForEachProduct()){
			cherry.fillInCherries();
		}
		
		if(watermelon.getNumberOfWatermelons() != null && watermelon.getNumberOfWatermelons()!=watermelon.getNumberOfItemsForEachProduct()){
			watermelon.fillInWatermelons();
		}
	}
}
