package com.basic.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFromFile {
	
	public static void main(String[] args) {

		
		/*
		 * �DEV : Dosya veya dizin arama
		 * 
		 * Parametre olarak belirtilen dosya veya dizini, yine parametre olarak
		 * belirtilen klas�r i�erisinde rek�rsif bir bi�imde aray�p bulan
		 * fonksiyonu yaz�n�z.
		 * 
		 * �rne�in : 
		 * find("C:\\", "dosya.txt")
		 * �rnek ��kt� : 
		 * 2 adet dosya.txt bulundu.
		 * C:\Windows\dosya.txt
		 * C:\Program Files\Sierra\dosya.txt
		 * 
		 * �rne�in : 
		 * find("D:\\", "Oyunlar")
		 * �rnek ��kt� :
		 * 
		 * 
		 */
		File file = new File("C:" + File.separator + "Users" + File.separator + "cagdas.kose" + File.separator
				+ "Desktop" + File.separator + "develop");
		File ioFolder = new File(file, "IOSamples");
		
		File targetFile = new File(ioFolder, "IOSample.txt");
		
		if (!targetFile.exists()) {
			try {
				targetFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		BufferedOutputStream bufferedOutputStream = null;
		try {
			bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(targetFile, true));
			
			bufferedOutputStream.write('e');
			bufferedOutputStream.write('a');
			bufferedOutputStream.write(0160);
			bufferedOutputStream.write('a');
			bufferedOutputStream.write(244);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileInputStream fileInputStream = new FileInputStream(targetFile);
			
			int read;
			while ((read = fileInputStream.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}