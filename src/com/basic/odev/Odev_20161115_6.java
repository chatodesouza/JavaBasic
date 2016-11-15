package com.basic.odev;

public class Odev_20161115_6 {

	private static int basamak(int value) {
		if (value / 10 < 1) {
			return 1;
		}
		return 1 + basamak(value / 10);
	}

	public static void main(String[] args) {
		Odev_20161115_6 odev6 = new Odev_20161115_6();
		System.out.println(odev6.basamak(23131));

	}

}
