package com.basic.io.odev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class HtmlMainReader {
	HtmlWriter htmlWriter;
	private static String encodingFormat;
	private static String targetUrl;
	private ArrayList<Character> content = new ArrayList<Character>();
	private InputStreamReader isr;
	private BufferedReader br;
	private int i;
	URL url;
	String title;
	private String subLinkHtml = "href=\"/";
	private static String strHtml = "";
	private static ArrayList<String> subLinks = new ArrayList<String>();
	private static int htmlFileNumber = 0;

	protected ArrayList<Character> getContent() {
		return content;
	}

	public HtmlMainReader(String encodingFormat, String targetUrl) throws IOException {
		this.encodingFormat = encodingFormat;
		this.targetUrl = targetUrl;
		subLinks.add(this.targetUrl);
		connectionHtml();
		readingHtml();
		if (strHtml.contains(subLinkHtml)) {
			readingSubHtml();
		}
	}
	
	public void connectionHtml() throws IOException{
		if (strHtml.contains(subLinkHtml)){
			url = new URL(targetUrl+ subLinks.get(htmlFileNumber));
		}
		else {
			url = new URL(targetUrl);
		}
		URLConnection uc = url.openConnection();
		isr = new InputStreamReader(uc.getInputStream(), encodingFormat);
		this.title = uc.getContentEncoding();
		br = new BufferedReader(isr);
	}

	public void readingHtml() throws IOException {

		//Okunan veriyi ArrayList'e yazdýrma
		while ((i = isr.read()) != -1) {
			content.add((char) i);
		}
		//ArrayList'e yazýlan veriyi console'a yazdýrma
		for (int j = 0; j < content.size(); j++) {
			System.out.print(content.get(j));
		}

		// htmlWriter = new HtmlWriter(content, this.encodingFormat,
		// this.title);

		//ArrayList'e yazýlan veriyi String'e çevirme
		fillingHtmlContentIntoString();
		
		


		htmlFileNumber++;
	}

	public void fillingHtmlContentIntoString() throws IOException {

		for (int j = 0; j < content.size(); j++) {
			strHtml += content.get(j);
		}
	}

	public void readingSubHtml() throws IOException {
		int nextChar;
		
		// htmlWriter = new HtmlWriter(strHtml, this.encodingFormat, this.title,
		// this.subLinkHtml, this.targetUrl);
		while(strHtml.startsWith("</html>")){
		//System.out.println("\n" + strHtml.indexOf(subLinkHtml));
		nextChar = (strHtml.indexOf(subLinkHtml))+7;
		System.out.println(nextChar);
		subLinks.add(strHtml.substring(nextChar, strHtml.indexOf("\"")));
		subLinks.add(this.targetUrl /*+ subLinks.get(htmlFileNumber)*/);
		}

	}
}
