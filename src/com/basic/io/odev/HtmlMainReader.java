package com.basic.io.odev;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class HtmlMainReader {
	HtmlWriter htmlWriter;
	private String encodingFormat;
	private String targetUrl;
	private ArrayList<Character> content = new ArrayList<Character>();
	private InputStreamReader isr;
	private BufferedReader br;
	private int i;
	URL url;
	String title;

	protected ArrayList<Character> getContent() {
		return content;
	}

	public HtmlMainReader(String encodingFormat, String targetUrl) throws IOException {
		this.encodingFormat = encodingFormat;
		this.targetUrl = targetUrl;
		htmlWriter = new HtmlWriter(readingHtml(), this.encodingFormat, this.title);
	}

	public ArrayList<Character> readingHtml() throws IOException {

		url = new URL(targetUrl);
		URLConnection uc = url.openConnection();
		isr = new InputStreamReader(uc.getInputStream(), encodingFormat);
		this.title = uc.getContentEncoding();
		br = new BufferedReader(isr);
		
		System.out.println(isr.getEncoding());

		while ((i = isr.read()) != -1)

		{
			content.add((char) i);

		}
		for (int j = 0; j < content.size(); j++) {
			System.out.print(content.get(j));
		}
		return content;
		
		
	}
}
