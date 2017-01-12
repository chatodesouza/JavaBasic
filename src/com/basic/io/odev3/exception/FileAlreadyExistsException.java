package com.basic.io.odev3.exception;

import java.io.IOException;

public class FileAlreadyExistsException extends IOException {
	public FileAlreadyExistsException(String message) {
		super(message);
		//System.out.println("File already exists...");
	}
	
	
}
