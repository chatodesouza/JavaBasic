package com.basic.paket;

public class IlkSinif {
	
	public int age = 5;
	protected double kilo = 65;
	char sex = 'm'; // no-modifier, package-private
	private int yas = 6;
	
	public static void main(String[] args) {
		IlkSinif i = new IlkSinif();
		i.ekranaYaz(args[0], args[1]);
		
		HesapMakinesi.topla(15, 20);
		HesapMakinesi.topla(5.2, 10.5);
	}
	
	private void ekranaYaz(String name, String surname) {
		System.out.println(name);
		System.out.println(surname);
	}
	
}