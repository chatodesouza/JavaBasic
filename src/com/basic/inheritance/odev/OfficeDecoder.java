package com.basic.inheritance.odev;

public abstract class OfficeDecoder implements Decoder {
	
	@Override
	public void decode() {
		System.out.println("Office document is being decoded!");
	}

}
