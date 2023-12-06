package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 35;
		
		Line.dLine(num);
		System.out.print("첫번째 정수를 입력하세요 >> ");
		String str = scan.nextLine();
		int num1 = Integer.valueOf(str);
		System.out.print("두번째 정수를 입력하세요 >> ");
		String str2 = scan.nextLine();
		int num2 = Integer.valueOf(str2);
		Line.sLine(num);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d × %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		Line.dLine(num);

	}
	
}
