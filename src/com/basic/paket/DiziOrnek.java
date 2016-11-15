package com.basic.paket;

public class DiziOrnek {
	
	public static void main(String[] args) {
		int[] numericArray = new int[5];
		
		int[] numericArray2 = new int[] {
				4, 5, 6
		};
		
		Integer[][] numericArray3 = new Integer[][] {
			{4, 5, null, null}, {2, 3, 7, 8}
		};
		
		System.out.println("numericArray.length = " + numericArray.length);
		System.out.println("numericArray3.length = " + numericArray3[1].length);
	}

}
