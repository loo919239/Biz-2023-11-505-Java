package com.callor.oop.input;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class InputG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("정수(QUIT:종료) >> ");
			String str = scan.nextLine();
			if (str.equalsIgnoreCase("QUIT")) {
				System.out.println("소수 구별하기 종료");
				break;
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				continue;
			}

			if (num < 1) {
				System.out.println("값은 2 이상의 정수를 입력해 주세요");
				System.out.println("입력한 값" + str);
			}
			int i = 0;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if(i<num) {
				System.out.println(num + "는 소수아님");
			}else {
				System.out.println(num + "는 소수임");
			}
		}
	}

}
