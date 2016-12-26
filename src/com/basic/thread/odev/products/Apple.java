package com.basic.thread.odev.products;

public class Apple extends Product {
	private Integer numberOfApples;

	public void fillInApples() {
		this.numberOfApples = super.getNumberOfItemsForEachProduct();
	}

	public synchronized Integer getNumberOfApples() {
		return this.numberOfApples;
	}

	public Apple(){
		if(numberOfApples==null){
		this.numberOfApples = super.getNumberOfItemsForEachProduct();
		}
	}
	public Apple(String a){
		System.out.println(a + "started to produce.");
	}

	@Override
	public boolean buyProduct(int boughtItemNumber) {
		if(numberOfApples != null && numberOfApples > 0){
			this.numberOfApples=numberOfApples-boughtItemNumber;
			System.out.println("You have succesfully bought products");
			return true;
			
		}
		else if(numberOfApples<super.getNumberOfItemsForEachProduct()){
			System.out.println("We're so sorry...\nNo more " + super.prodType[0] + " left. Try again later...");
			return false;
		}
		else {
			System.out.println("Error. Try to buy again.");
			return false;
		}
		
	}
}
