package com.basic.io.odev;

import java.io.IOException;

public class HtmlProducer {

	private final static String encodingFormat = "ISO-8859-9";
	private final static String targetUrl = "http://tureng.com/tr/turkce-ingilizce";

	public static void main(String[] args) throws IOException {
	HtmlMainReader htmlReader = new HtmlMainReader(encodingFormat, targetUrl);
		
	}

}
