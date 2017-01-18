package com.basic.io.odev3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.basic.io.odev3.exception.FileAlreadyExistsException;

public class TargetFileWriter {
	private static String fS;
	private static String targetFileOldPath;
	private static String targetFileNewPath;
	private File fNew;
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	//private OutputStreamWriter osw;

	public TargetFileWriter(String fileSeparator, String tFOP, String tFNP, ArrayList<Character> content,
			String encodingFormat) throws IOException {
		// TODO Writer bütünüyle yazýlýp main methoddan çaðrýlacak.
		// READER-WRITER arasýnda baðlantý olmayacak.
		this.fS = fileSeparator;
		this.targetFileOldPath = tFOP;
		this.targetFileNewPathMasaustu(tFNP);
		this.fileWriting(content, encodingFormat);

	}

	private void targetFileNewPathMasaustu(String tFileNPath) {
		if (tFileNPath == "Masaüstü"){
			this.targetFileNewPath = "C:" + fS + "Users" + fS + "cagdas.kose" + fS + "Desktop";
		}
		else{
			this.targetFileNewPath = tFileNPath;
		}
	}

	private void fileWriting(ArrayList<Character> content, String encodingFormat) throws IOException {
		File fNew = new File(targetFileNewPath);
		// fos = new FileOutputStream(fNew);
		// bos = new BufferedOutputStream(fos);
		// osw = new OutputStreamWriter(bos, encodingFormat);

		if (fNew.isFile() && fNew.exists() && fNew.getName() != "Masaüstü") {
			throw new FileAlreadyExistsException("This file already exists.");
		} else if (fNew.isDirectory() || fNew.getName() == "Masaüstü") {
			File fOld = new File(targetFileOldPath);
			this.targetFileNewPath = this.targetFileNewPath + File.separator + fOld.getName();
			fNew = new File(this.targetFileNewPath);
			fos = new FileOutputStream(fNew);
			bos = new BufferedOutputStream(fos);
			//osw = new OutputStreamWriter(bos, encodingFormat);
			for (int i = 0; i < content.size(); i++) {
				bos.write(content.get(i));
			}
		} else {
			fNew.createNewFile();
			fos = new FileOutputStream(fNew);
			bos = new BufferedOutputStream(fos);
			//osw = new OutputStreamWriter(bos, encodingFormat);
			for (int i = 0; i < content.size(); i++) {
				bos.write(content.get(i));
			}
		}

		bos.flush();
	}

}
