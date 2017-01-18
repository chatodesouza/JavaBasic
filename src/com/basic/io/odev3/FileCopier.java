package com.basic.io.odev3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import com.basic.io.odev3.exception.FileAlreadyExistsException;

public class FileCopier {
	Scanner input = new Scanner(System.in);
	
	private static final String FS = File.separator;
	private static String tfOldPath = "C:" + FS + "Users" + FS + "cagdas.kose" + FS + "Desktop" + FS + "develop" + FS
			+ "IOSamples" + FS + "IO_Target.txt";
	private static String tfNewPath = "Masaüstü";
	private static TargetFileReader tfr;
	

	public static void main(String[] args) {
		FileCopier fC = new FileCopier();
		
		 File f = new File("Masaüstü");
		 System.out.println();
		 
		
		
		//Choosing old file path
		fC.oldFileConsole();
		
		
		try {
			tfr = new TargetFileReader(tfOldPath);
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
			System.out.println("File NOT Found!");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		
		//Choosing new file position
		fC.newFileConsole();
		
		
		try {

			TargetFileWriter tfw = new TargetFileWriter(FS, tfOldPath, tfNewPath, tfr.getContent(),
					tfr.getEncodingFormat());

		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
			System.out.println("File NOT Found!");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("This encoding format is NOT supported.");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		File fExisted = new File(tfNewPath);
		if(fExisted.exists()){
			System.out.println("You have succesfully copied your file into\n" + tfNewPath);
		}
		
		

	}
	
	private void oldFileConsole(){
		System.out.println("Please write your file path:\n");
		this.tfOldPath = input.nextLine();
	}
	
	private void newFileConsole(){
		System.out.println("Please write your copying position path:\n");
		this.tfNewPath = input.nextLine();
	}

}
