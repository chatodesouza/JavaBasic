package com.basic.thread.odev.products;

public class Product{
	//public Integer numberOfItems;
	public static Integer numberOfItems;
	public final String[] prodType = { "Apple", "Banana", "Cherry", "Watermelon" };
	//private int numberOfItemsForEachProduct;
	private static int numberOfItemsForEachProduct;

	public Product() {

	}

	public Product(int a) {
		if (numberOfItems == null) {
			this.setNumberOfItems(a);
			System.out.println("OK. Your bucket size is " + a + "\n");
			this.setNumberOfItemsForEachProduct(numberOfItems/prodType.length);
			
		}
	}

	public int getNumberOfItemsForEachProduct() {
		return numberOfItemsForEachProduct;
	}

	public void setNumberOfItemsForEachProduct(int numberOfItemsForEachProduct) {
		this.numberOfItemsForEachProduct = numberOfItemsForEachProduct;
	}

	private void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public boolean buyProduct(int boughtItemNumber){
		//hocam burada bu class'� abstract yapamad���m i�in/ConsoleWriter'da abstract nesnesi tan�mlayamad���m i�in method'un i�i bo� kald�
		return false;
	}

}
