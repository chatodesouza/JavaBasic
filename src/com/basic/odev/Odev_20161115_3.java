package com.basic.odev;

import java.util.ArrayList;

// Separating an Array into two ArrayLists according to Greatness compared with PIVOT number given
public class Odev_20161115_3 {

	private int[] arr = new int[] { 3, 1, 7, -7, 5, 4 };
	ArrayList<Integer> smallers = new ArrayList<Integer>();
	ArrayList<Integer> biggers = new ArrayList<Integer>();
	private int global = 1;
	private int countEquals = 0;

	private void seperateArray(int pivot) {
		// Sorting default array ASC
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = global; j < arr.length; j++) {
				if (arr[i] > arr[j] && (i != j)) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
			global = i + 1;
		}
		global = 1;

		// Filling ArrayLists according to numbers SMALLER than || BIGGER than
		// || Equals to PIVOT
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				smallers.add(arr[i]);
			} else if (arr[i] > pivot) {
				biggers.add(arr[i]);
			} else {
				countEquals++;
			}
		}

		// If Array is NOT full of pivot value
		if (countEquals != arr.length) {
			// Output as numbers SMALLER than PIVOT into sorted ASC array
			System.out.print("smaller arr: ");
			for (int i = 0; i < this.smallers.size(); i++) {
				System.out.print(smallers.get(i) + " ");
			}
			System.out.println("\n");

			// Output as numbers BIGGER than PIVOT into sorted ASC array
			System.out.print("bigger arr: ");
			for (int i = 0; i < this.biggers.size(); i++) {
				System.out.print(this.biggers.get(i) + " ");
			}
			System.out.println("\n");
		}

		// Output as number of numbers EQUAL to PIVOT
		if (countEquals == 0) {
			System.out.println("Array includes no same numbers as your pivot.");
		} else if (countEquals != arr.length && countEquals == 1) {
			System.out.println("Array includes " + countEquals + " same number as your pivot.");
		} else if (countEquals == arr.length) {
			System.out.println("Array is full of your pivot.");
		} else {
			System.out.println("Array includes " + countEquals + " same numbers as your pivot.");
		}
	}

	public static void main(String[] args) {
		Odev_20161115_3 odev3 = new Odev_20161115_3();
		System.out.print("default arr: ");
		for (int i = 0; i < odev3.arr.length; i++) {
			System.out.print(odev3.arr[i] + " ");
		}
		System.out.println("\n");
		odev3.seperateArray(3);

	}

}
