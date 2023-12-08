package com.callor.score.utils;

public class Line {
	
	public static void dLine(int length) {
		System.out.println("=".repeat(length));
	}
	
	public static void sLine(int length) {
		System.out.println("-".repeat(length));
	}
	
	public static void title(String title,int length) {
		System.out.println("=".repeat(length));
		System.out.println(title);
		System.out.println("=".repeat(length));
	}

}
