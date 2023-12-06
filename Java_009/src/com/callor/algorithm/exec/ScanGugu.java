package com.callor.algorithm.exec;

import java.util.Iterator;
import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScanGugu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 50; 
		int num1 = 0;
		Line.dLine(num);
		while (true) {
			System.out.print("원하는 구구단을 입력해 주세요 >> ");
			String str = scan.nextLine();
			try {
				num1 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("** 올바른 정수를 입력해 주세요 **");
				continue;
			}
			break;
		}
			if (num1 > 9) {
				System.out.println("9 이하의 수를 입력해 주세요");
				return;
			}
			
			Line.sLine(num);
			System.out.printf("\t %d 단 구구단\n",num1);
			Line.sLine(num);
			for (int i = 0; i < 9; i++) {
				System.out.printf("\t %2d ×%2d = %2d\n", num1, (i + 1), num1 * (i + 1));
			}
			Line.dLine(num);
			
		
	}

}
