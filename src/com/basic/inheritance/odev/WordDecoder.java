package com.basic.inheritance.odev;

public class WordDecoder extends OfficeDecoder {
	
	@Override
	public void decode() {
		super.decode();
		System.out.println("Word is being decoded.");
	}
	
	@Override
	public void close() {
		System.out.println("Word is being closed.");
	}

}