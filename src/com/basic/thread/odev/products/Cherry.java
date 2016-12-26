package com.basic.thread.odev.products;

public class Cherry extends Product{
	private Integer numberOfCherries;
	
	public void fillInCherries() {
		this.numberOfCherries = super.getNumberOfItemsForEachProduct();
	}

	public synchronized Integer getNumberOfCherries() {
		return this.numberOfCherries;
	}

	
	public Cherry(){
		if(numberOfCherries==null){
		this.numberOfCherries = super.getNumberOfItemsForEachProduct();
		}
	}
	
	public Cherry(String a){
		System.out.println(a + "started to produce.");
	}

	@Override
	public boolean buyProduct(int boughtItemNumber) {
		if(numberOfCherries!=super.getNumberOfItemsForEachProduct() && numberOfCherries!=null){
			this.numberOfCherries=numberOfCherries-boughtItemNumber;
			System.out.println("You have succesfully bought products");
			return true;
		}
		else if(numberOfCherries<super.getNumberOfItemsForEachProduct()){
			System.out.println("We're so sorry...\nNo more " + super.prodType[2] + " left. Try again later...");
			return false;
		}
		else {
			System.out.println("Error. Try to buy again.");
			return false;
		}
		
	}

}
