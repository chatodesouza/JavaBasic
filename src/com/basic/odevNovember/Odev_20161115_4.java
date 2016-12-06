package com.basic.odevNovember;

public class Odev_20161115_4 {
	Integer aminus2 = null;
	Integer aminus1 = null;
	public int fibonacci2(int value) {
		int[] A = new int[value];//YANLIÞ!!! burada her seferinde yeni bir array yaratýyor.


		if (value == 1 || value == 0) {
			A[value]=value;
			return value;
		}

		if (A[value - 2] != 0) {
			aminus1 = A[value - 1];
		} else {
			A[value-2]=value-1;
			aminus1 = fibonacci2(value - 1);
		}
		if (A[value - 3] != 0) {
			aminus2 = A[value - 2];
		} else {
			A[value-3]=value-2;
			aminus2 = fibonacci2(value - 2);
		}

		return aminus1 + aminus2;

		// Dizi(ARRAY) oluþturup tüm deðerleri o diziye kaydederek ikinci bir
		// dönüþ yerine diziden varolan deðerleri almasýný saðlýyoruz.
	}

	public static void main(String[] args) {
		Odev_20161115_4 odev4 = new Odev_20161115_4();
		System.out.println(odev4.fibonacci2(4));

	}

}
