package com.basic.thread.odev;

public class Product{
	public Integer numberOfItems;
	public final String[] prodType = { "Apple", "Banana", "Cherry", "Watermelon" };
	protected int numberOfItemsForEachProduct;

	public Product() {

	}

	public Product(int a) {
		if (numberOfItems == null) {
			this.setNumberOfItems(a);
			System.out.println("OK. Your bucket size is " + a + "\n");
			this.numberOfItemsForEachProduct = numberOfItems/prodType.length;
			
		}
	}

	private void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public boolean buyProduct(int boughtItemNumber){
		//hocam burada bu class'� abstract yapamad���m i�in/ConsoleWriter'da abstract nesnesi tan�mlayamad���m i�in method'un i�i bo� kald�
		return false;
	}

}
