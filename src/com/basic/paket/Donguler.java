package com.basic.paket;

public class Donguler {
	
	public static void main(String[] args) {
		
/*		for (int i=0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("------");
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		System.out.println("While");
		
		int counter = 0;
		while (counter < args.length) {
			System.out.println("selam");
			++counter;
		}
		
		System.out.println("do while");
		counter = 0;
		do {
			System.out.println(counter);
			++counter;
		} while (counter < args.length);
		
		
		String arrayLength;
		if (args.length == 9) {
			arrayLength = "dokuz";
		} else {
			arrayLength = "dokuz de�il";
		}
		
		arrayLength = args.length == 9 ? "dokuz" : args.length == 8 ? "sekiz" : "sekiz de�il";*/

		
		
		int counterTersArgs = -1;
		String[] tersArgs = new String[args.length];
		while(counterTersArgs < args.length-1) {
			tersArgs[++counterTersArgs] = args[counterTersArgs];
		}
		
		
		/**
		 * &&(ve) ve ||(veya) operat�rleri �ift karakterli olarak
		 * kullan�ld�klar�nda ilk �art� kontrol etmeleri cevap i�in yeterliyse
		 * ikinci �art kontrol edilmez. Yani ve i�lemi i�in ilk �art false ise
		 * ikinci �arta bak�lmaz, nedeni ikinci �art true olsa dahi if i�erisine
		 * girilmeyecektir.
		 * 
		 * Ama tek & kullan�ld���nda her iki durum da kontrol edlir. Nedeni
		 * tekli ve (&) bitwise operat�rd�r.
		 */
		if (fonksiyon1() && fonksiyon2()) {
			System.out.println("do�ru");
		}
		
		
	}
	
	public static boolean fonksiyon1() {
		System.out.println("fonksiyon1 �a�r�ld�");
		return false;
	}
	
	public static boolean fonksiyon2() {
		System.out.println("fonksiyon2 �a�r�ld�");
		return true;
	}

}
