package com.basic.odev;

import java.util.Scanner;

//Finding number of words into a sentence input according to number of SPACE characters
public class Odev_20161115_2 {

	private int count;

	public int xWordsInSentence(String sent) {
		for (int i = 0; i < sent.length(); i++) {
			if (sent.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Odev_20161115_2 odev2 = new Odev_20161115_2();
		System.out.println("Please, write your sentence: ");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		System.out.println("Your sentence has " + odev2.xWordsInSentence(sentence) + " words.");

	}

}
