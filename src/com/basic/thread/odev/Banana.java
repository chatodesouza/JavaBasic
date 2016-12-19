package com.basic.thread.odev;

public class Banana extends Product{
	private Integer numberOfBananas;
	
	public void fillInBananas() {
		this.numberOfBananas = super.numberOfItemsForEachProduct;
	}

	public synchronized Integer getNumberOfBananas() {
		return this.numberOfBananas;
	}

	
	public Banana(){
		if(numberOfBananas==null){
		this.numberOfBananas = super.numberOfItemsForEachProduct;
		}
	}
	public Banana(String a){
		System.out.println(a + "started to produce.");
	}

	@Override
	public boolean buyProduct(int boughtItemNumber) {
		if(numberOfBananas!=super.numberOfItemsForEachProduct && numberOfBananas!=null){
			this.numberOfBananas=numberOfBananas-boughtItemNumber;
			System.out.println("You have succesfully bought products");
			return true;
			
		}
		else if(numberOfBananas<super.numberOfItemsForEachProduct){
			System.out.println("We're so sorry...\nNo more " + super.prodType[1] + " left. Try again later...");
			return false;
		}
		else {
			System.out.println("Error. Try to buy again.");
			return false;
		}
		
	}
}
