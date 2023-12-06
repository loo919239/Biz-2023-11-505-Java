package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class NumbersB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Line.dLine(80);
		System.out.printf("숫자를 입력하세요 >> ");
		String str = scan.nextLine();
		int num = Integer.valueOf(str);
		Line.sLine(80);
		for (int i = 0; i < num; i++) {
			String star = "* ";
			for (int j = 0; j <= i; j++) {
				System.out.printf(star);
			}
			System.out.println();
		}
		Line.dLine(80);
		
	}
}
