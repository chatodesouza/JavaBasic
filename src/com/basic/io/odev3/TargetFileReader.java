package com.basic.io.odev3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TargetFileReader {
	private File f;
	private FileInputStream fis;
	private BufferedInputStream bis;
	// private InputStreamReader isr;
	
	private static String targetFileOldPath;
	private final static String ENCODING_FORMAT = "ISO-8859-9";

	private int i;
	private ArrayList<Character> content = new ArrayList<Character>();
	
	public TargetFileReader(String tFOP) throws IOException {
		this.targetFileOldPath = tFOP;
		this.fileReading();
	}

	protected static String getEncodingFormat() {
		return ENCODING_FORMAT;
	}

	protected ArrayList<Character> getContent() {
		return this.content;
	}

	private void fileReading() throws IOException {
	
		f = new File(targetFileOldPath);
		fis = new FileInputStream(f);
		bis = new BufferedInputStream(fis);
		//isr = new InputStreamReader(bis, ENCODING_FORMAT);
		//---> Ýçindeki veriler ile iþim
		// yoksa InputStreamReader oluþturmama gerek yok.

		while ((i = bis.read()) != -1) {
			content.add((char) i);
		}

/*		for (int j = 0; j < content.size(); j++) {
			System.out.print(content.get(j));
		}*/
		
		bis.close();

	}

}
