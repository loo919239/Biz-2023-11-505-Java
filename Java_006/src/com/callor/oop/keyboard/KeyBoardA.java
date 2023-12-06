package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardA {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		
	
		System.out.println("=".repeat(30));
		System.out.println("짝수 찾기");
		System.out.println("=".repeat(30));
		System.out.print("정수 >> ");

		String str = scan.nextLine();
		num = Integer.valueOf(str);
		System.out.println("-".repeat(30));
		if (num < 10) {
			System.out.println("10이상의 정수를 입력해주세요");
		}
		

		for (int i = 1; i <= num; i++) {
			System.out.printf("1 ~ %s까지 범위에서 짝수는?\n", str);
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("=".repeat(30));
	}
}
