package com.basic.paket;

public class Recursive {

	public static int fibonnaci(int value) {
		if (value == 1 || value == 0) {
			return value;
		}

		return fibonnaci(value - 1) + fibonnaci(value - 2);
	}

	public static int factorial(int value) {
		if (value == 0) {
			return 1;
		}
		return value * factorial(value - 1);
	}


	public static void main(String[] args) {
		System.out.println(Recursive.fibonnaci(5));
		System.out.println(Recursive.factorial(30));
	}

}