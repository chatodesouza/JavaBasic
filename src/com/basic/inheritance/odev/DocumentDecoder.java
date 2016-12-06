package com.basic.inheritance.odev;

public class DocumentDecoder {
	
	public static Object getDecoder(String fileName) {
		if (fileName.endsWith(".xlsx")) {
			return new ExcelDecoder();
		} else if (fileName.endsWith(".docx")) {
			return new WordDecoder();
		} else if (fileName.endsWith(".pdf")) {
			return new PDFDecoder();
		} else if (fileName.endsWith(".zdf")) {
			return new String("zdf");
		}
		return null;
	}
	
	public static void main(String[] args) {
		Object decoder = DocumentDecoder.getDecoder("mustafa.zdf");
		
		if (decoder instanceof Decoder) { 
			Decoder decoder2 = (Decoder) decoder;
			decoder2.decode();
		} else if (decoder instanceof String) {
			String decoder2 = (String) decoder;
			System.out.println(decoder2);
		}
		
		try {
			Decoder documentDecoder = (Decoder) DocumentDecoder.getDecoder("mustafa.zdf");
		}catch (ClassCastException e) {
			e.printStackTrace();
			System.out.println("Decoder türünden deðil!");
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}