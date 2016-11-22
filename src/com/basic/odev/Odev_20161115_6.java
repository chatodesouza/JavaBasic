package com.basic.odev;

//Number of digits into a number given
public class Odev_20161115_6 {

	private static int digitedNumber = 0;

	private static int basamak(int value) {
		if (value / 10 < 1) {
			return 1;
		}
		return 1 + basamak(value / 10);
	}

	public static void main(String[] args) {
		digitedNumber = Math.abs(-42142131);
		System.out.print("Your number has ");
		System.out.print(Odev_20161115_6.basamak(digitedNumber));
		System.out.println(" digits.");

	}

}
