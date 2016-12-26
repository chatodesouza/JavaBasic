package com.basic.io.odev;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class HtmlWriter {
	OutputStreamWriter osr;

	public HtmlWriter(ArrayList<Character> readContent, String encodingFormat, String title) throws IOException {
		writingHtml(readContent, encodingFormat, title);
	}

	public void writingHtml(ArrayList<Character> content, String encodingFormat, String title) throws IOException {
		osr = new OutputStreamWriter(
				new BufferedOutputStream(new FileOutputStream("C:\\Users\\ChatoP\\Desktop\\websiteHTMLS\\" + title + ".html")),
				encodingFormat);
		for (int i = 0; i < content.size(); i++) {
			osr.write(content.get(i));
		}
	}
}
