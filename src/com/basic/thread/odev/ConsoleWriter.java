package com.basic.thread.odev;

import java.util.Scanner;

public class ConsoleWriter {
	private String lineSeperator = "  --- /// --- ... --- /// ---  GREENY SHOP  --- /// --- ... --- /// ---  ";
	private static Integer bucketCapacity;
	private static Scanner input = new Scanner(System.in);
	private static Integer prodSelect;
	private static String[] prodType = { "Apple", "Banana", "Cherry", "Watermelon" };
	Product product;

	public ConsoleWriter() {
		System.out.println("Welcome to our GREENY SHOP!");
		System.out.println(lineSeperator);

		this.bucketCapacity(-1);
	}

	public int bucketCapacity(int a) {
		try {
			if (a == -1) {
				System.out.println(" Tell us our bucket capacity:");
				this.bucketCapacity(input.nextInt());
			} else {
				if (a >= 0 && a <= 1000) {
					bucketCapacity = a;
					//product = new Product(bucketCapacity);
					// TODO: sorulacak
					this.firstMenuWriter();
					prodSelect = input.nextInt();
					this.firstMenuSwitch(prodSelect);

				} else {
					System.out.println(lineSeperator);
					System.out
							.println("---(HINT: Capacity should be:\n1- Between 0 and 1000\n2- An integer number)---");
					System.out.println(" Re-tell us our bucket capacity:");
					return bucketCapacity(input.nextInt());
				}
			}

		} catch (Exception e) {
			System.out.println(
					"We do not let any letters, symbols, big numbers etc. yet.\n  Until Mustafa helps us;\n    System will shut down itself!");
		}
		return -1;

	}

	public void firstMenuWriter() {
		System.out.println(lineSeperator);
		System.out.println("  Tell us what you want to buy as products listed below:");
		System.out.println("(Press the product number matched with the required product)");
		System.out.println("1- " + prodType[0]);
		System.out.println("2- " + prodType[1]);
		System.out.println("3- " + prodType[2]);
		System.out.println("4- " + prodType[3]);
		System.out.println("\n0- QUIT");
	}

	public int firstMenuSwitch(int a) {
		switch (prodSelect) {
		case 0:
			System.out.println("GOOD BYE, THEN...");
			System.exit(0);
		case 1:
			this.numberOfPurchasedProduct(new Apple(), prodType[0]);
			break;
		case 2:
			this.numberOfPurchasedProduct(new Banana(), prodType[1]);
			break;
		case 3:
			this.numberOfPurchasedProduct(new Cherry(), prodType[2]);
			break;
		case 4:
			this.numberOfPurchasedProduct(new Watermelon(), prodType[3]);
			break;
		default:
			System.out.println("We have no other products. Please, try to purchase listed products.\n---");
			this.firstMenuWriter();
			prodSelect = input.nextInt();
			return firstMenuSwitch(prodSelect);
		}
		return -1;
	}

	public void numberOfPurchasedProduct(Product a, String productionTypePurchased) {
		productionTypePurchased.toLowerCase();
		if (productionTypePurchased.endsWith("y")) {
			int lastY = productionTypePurchased.lastIndexOf("y");
			productionTypePurchased = productionTypePurchased.substring(0, lastY) + "ies";
			System.out.println("How many " + productionTypePurchased + " do you want?");
		} else {
			System.out.println("How many " + productionTypePurchased + "s do you want?");
		}
		

	}

}
