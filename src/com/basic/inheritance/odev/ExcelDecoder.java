package com.basic.inheritance.odev;

public class ExcelDecoder extends OfficeDecoder {
	
	@Override
	public void decode() {
		super.decode();
		System.out.println("Excel is being decoded.");
	}

	@Override
	public void close() {
		System.out.println("Excel decoder is being closed.");
	}
}
