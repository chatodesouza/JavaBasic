package com.basic.odev;

//sorting array ASC & DESC
public class Odev_20161115_1 {

	int[] arr = new int[] { 1, 3, 7, 2, -7, 5, 4, 0 };
	int global = 1;

	// Sorting array ASC
	private void minToMax() {
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
	}

	// Sorting array DESC
	private void maxToMin() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = global; j < arr.length; j++) {
				if (arr[i] < arr[j] && (i != j)) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
			global = i + 1;
		}
		global = 1;
	}

	public static void main(String[] args) {
		Odev_20161115_1 odev1 = new Odev_20161115_1();
		System.out.print("default arr: ");
		for (int i = 0; i < odev1.arr.length; i++) {
			System.out.print(odev1.arr[i] + " ");
		}
		System.out.println("\n");
		odev1.minToMax();
		System.out.print("minToMax arr: ");
		for (int i = 0; i < odev1.arr.length; i++) {
			System.out.print(odev1.arr[i] + " ");
		}
		System.out.println("\n");
		odev1.maxToMin();
		System.out.print("maxToMin arr: ");
		for (int i = 0; i < odev1.arr.length; i++) {
			System.out.print(odev1.arr[i] + " ");
		}

	}

}
