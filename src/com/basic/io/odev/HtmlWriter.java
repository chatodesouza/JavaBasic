package com.basic.io.odev;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class HtmlWriter{
	private String user = "cagdas.kose";
	OutputStreamWriter osr;
	private ArrayList<String> subLinks = new ArrayList<String>();
	private String targetUrl;


	
	public HtmlWriter(ArrayList<Character> readContent, String encodingFormat, String title) throws IOException {
		writingHtml(readContent, encodingFormat, title);
	}
	
	public HtmlWriter(String readSubContent, String encodingFormat, String title, String subLinkHtml, String targetUrl) throws IOException{
		this.targetUrl = targetUrl;
		writingSubHtml(readSubContent, encodingFormat, title, subLinkHtml);
	}

	public void writingHtml(ArrayList<Character> content, String encodingFormat, String title) throws IOException {
		osr = new OutputStreamWriter(
				new BufferedOutputStream(new FileOutputStream("C:\\Users\\" + user + "\\Desktop\\websiteHTMLS\\" + title + ".html")),
				encodingFormat);
		for (int i = 0; i < content.size(); i++) {
			osr.write(content.get(i));
		}
	}
	
	public void writingSubHtml(String subContent, String encodingFormat, String title, String subLinkHtml) throws IOException{
		
		
		
		osr = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("C:\\Users\\" + user + "\\Desktop\\websiteHTMLS\\" + title + ".html")));
	}
}
