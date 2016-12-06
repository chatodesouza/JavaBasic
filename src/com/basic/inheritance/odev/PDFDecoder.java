package com.basic.inheritance.odev;

public class PDFDecoder implements Decoder {

	@Override
	public void decode() {
		System.out.println("PDF is being decoded.");
	}

	@Override
	public void close() {
		System.out.println("Pdf decoder is being closed.");
	}

}
