package com.basic.paket;

public class Person {
	
	private String name;
	private String surname;
	
	private static String nation;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
		nation = "T.C.";
	}
	
	public Person(String surname) {
		this("Mr.", surname);
	}
	
	public static void main(String[] args) {
		Person kisi = new Person("Öztürk");
		Person kisi2 = kisi;
		Person kisi3 = new Person("Çaðdaþ", "Köse");
		
		kisi2.name = "Mehmet";
		kisi3.name = "Deniz";
		
		kisi.nation = "U.K.";
		
		System.out.println(kisi.name);
		System.out.println(kisi.nation);
		System.out.println(kisi2.name);
		System.out.println(kisi2.nation);
		System.out.println(kisi3.name);
		System.out.println(kisi3.nation);
		
	}

}