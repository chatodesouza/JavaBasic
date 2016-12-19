package com.basic.thread.odev;

public class Watermelon extends Product{
	private Integer numberOfWatermelons;
	
	public void fillInWatermelons() {
		this.numberOfWatermelons = super.numberOfItemsForEachProduct;
	}

	public synchronized Integer getNumberOfWatermelons() {
		return this.numberOfWatermelons;
	}
	
	public Watermelon(){
		if(numberOfWatermelons==null){
		this.numberOfWatermelons = super.numberOfItemsForEachProduct;
		}
	}
	
	public Watermelon(String a){
		System.out.println(a + "started to produce.");
	}

	@Override
	public boolean buyProduct(int boughtItemNumber) {
		if(numberOfWatermelons!=super.numberOfItemsForEachProduct && numberOfWatermelons!=null){
			this.numberOfWatermelons=numberOfWatermelons-boughtItemNumber;
			System.out.println("You have succesfully bought products");
			return true;
			
		}
		else if(numberOfWatermelons<super.numberOfItemsForEachProduct){
			System.out.println("We're so sorry...\nNo more " + super.prodType[3] + " left. Try again later...");
			return false;
		}
		else {
			System.out.println("Error. Try to buy again.");
			return false;
		}
		
	}

}
