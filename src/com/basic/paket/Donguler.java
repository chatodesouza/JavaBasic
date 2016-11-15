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
			arrayLength = "dokuz deðil";
		}
		
		arrayLength = args.length == 9 ? "dokuz" : args.length == 8 ? "sekiz" : "sekiz deðil";*/

		
		
		int counterTersArgs = -1;
		String[] tersArgs = new String[args.length];
		while(counterTersArgs < args.length-1) {
			tersArgs[++counterTersArgs] = args[counterTersArgs];
		}
		
		
		/**
		 * &&(ve) ve ||(veya) operatörleri çift karakterli olarak
		 * kullanýldýklarýnda ilk þartý kontrol etmeleri cevap için yeterliyse
		 * ikinci þart kontrol edilmez. Yani ve iþlemi için ilk þart false ise
		 * ikinci þarta bakýlmaz, nedeni ikinci þart true olsa dahi if içerisine
		 * girilmeyecektir.
		 * 
		 * Ama tek & kullanýldýðýnda her iki durum da kontrol edlir. Nedeni
		 * tekli ve (&) bitwise operatördür.
		 */
		if (fonksiyon1() && fonksiyon2()) {
			System.out.println("doðru");
		}
		
		
	}
	
	public static boolean fonksiyon1() {
		System.out.println("fonksiyon1 çaðrýldý");
		return false;
	}
	
	public static boolean fonksiyon2() {
		System.out.println("fonksiyon2 çaðrýldý");
		return true;
	}

}
