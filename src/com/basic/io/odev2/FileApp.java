package com.basic.io.odev2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ÖDEV : Dosya veya dizin arama
 * 
 * Parametre olarak belirtilen dosya veya dizini, yine parametre olarak
 * belirtilen klasör içerisinde rekürsif bir biçimde arayýp bulan
 * fonksiyonu yazýnýz.
 * 
 * Örneðin : 
 * find("C:\\", "dosya.txt")
 * Örnek Çýktý : 
 * 2 adet dosya.txt bulundu.
 * C:\Windows\dosya.txt
 * C:\Program Files\Sierra\dosya.txt
 * 
 * Örneðin : 
 * find("D:\\", "Oyunlar")
 * Örnek Çýktý :
 * 
 * 
 */
public class FileApp implements FilenameFilter {
	private String fileSep = File.separator;
	private static String fileOrFolderName;
	private static ArrayList<String> folderList = null;
	private static ArrayList<String> fileList = null;
	private int searchingArea;
	private int countFile = 0;
	private int countFolder = 0;
	private File file; // new File("C:" + File.separator + "Users" +
						// File.separator + "cagdas.kose" + File.separator
	// + "Desktop" + File.separator + "develop");

	private File f;

	public static void main(String[] args) {
		FileApp fileApp = new FileApp();

		/*
		 * fileApp.f = new File("D:" + File.separator + "mail.txt" );
		 * System.out.println(fileApp.f.exists());
		 * System.out.println(fileApp.f.getAbsolutePath());
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please choose your searching area:\n" + "1- C:\\\n" + "2- D:\\");

		switch (input.nextInt()) {
		case 1:
			fileApp.file = new File("C:" + fileApp.fileSep);
			System.out.println(
					"Got it!\n Please write your name filter to find files in " + fileApp.file.getPath() + "  :");
			break;
		case 2:
			fileApp.file = new File("D:" + fileApp.fileSep);
			System.out.println(
					"Got it!\n Please write your name filter to find files in " + fileApp.file.getPath() + "  :");
			break;
		}

		fileOrFolderName = input.next();

		fileApp.finder(fileApp.file);

	}

	private void finder(File dir) {
		//System.out.println("DIR: " + dir + "\n");
		if(dir.listFiles()!=null){
		for (int i = 0; i < dir.listFiles().length; i++) {
			File f = dir.listFiles()[i];
			if (f.isDirectory()&&!f.isHidden()) {
				if (f.getName().toString().contains(fileOrFolderName)) {
					System.out.println(dir.listFiles()[i]);
				}
					// this.folderList.add(f.getAbsolutePath().toString());
				finder(f);
					
				} else if (f.isFile()) {
					// this.fileList.add(f.getAbsolutePath().toString());
					if (f.getName().toString().contains(fileOrFolderName)) {
						System.out.println(f);
					}
				}
			}

		}
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return false;
	}
}
