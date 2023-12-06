package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerBB {
	public static int intputNum(String title) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(title + " 입력해 주세요 >> ");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("** 정수를 정확히 입력해 주세요 **");
				continue;
			}
			return num;
		}
	}
	public static void main(String[] args) {
		Line.dLine(50);
		int num1 = intputNum("첫번째 정수를");
		int num2 = intputNum("두번째 정수를");
		Line.sLine(50);
		System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d",num1,num2,num1-num2);
		System.out.printf("%d × %d = %d",num1,num2,num1*num2);
		System.out.printf("%d ÷ %d = %d",num1,num2,num1/num2);
		System.out.printf("%d MOD %d = %d",num1,num2,num1%num2);
	}

}
