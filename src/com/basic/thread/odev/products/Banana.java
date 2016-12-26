package com.basic.thread.odev.products;

public class Banana extends Product{
	private Integer numberOfBananas;
	
	public void fillInBananas() {
		this.numberOfBananas = super.getNumberOfItemsForEachProduct();
	}

	public synchronized Integer getNumberOfBananas() {
		return this.numberOfBananas;
	}

	
	public Banana(){
		if(numberOfBananas==null){
		this.numberOfBananas = super.getNumberOfItemsForEachProduct();
		}
	}
	public Banana(String a){
		System.out.println(a + "started to produce.");
	}

	@Override
	public boolean buyProduct(int boughtItemNumber) {
		if(numberOfBananas!=super.getNumberOfItemsForEachProduct() && numberOfBananas!=null){
			this.numberOfBananas=numberOfBananas-boughtItemNumber;
			System.out.println("You have succesfully bought products");
			return true;
			
		}
		else if(numberOfBananas<super.getNumberOfItemsForEachProduct()){
			System.out.println("We're so sorry...\nNo more " + super.prodType[1] + " left. Try again later...");
			return false;
		}
		else {
			System.out.println("Error. Try to buy again.");
			return false;
		}
		
	}
}
