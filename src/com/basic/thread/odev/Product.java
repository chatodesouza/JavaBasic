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
		//hocam burada bu class'ý abstract yapamadýðým için/ConsoleWriter'da abstract nesnesi tanýmlayamadýðým için method'un içi boþ kaldý
		return false;
	}

}
