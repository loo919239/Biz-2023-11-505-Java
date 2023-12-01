package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardB {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 10) + 1;
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("=+-".repeat(10));
		System.out.println("UP&DOWN GAME");
		System.out.println("=+-".repeat(10));
		System.out.println("1부터 10까지의 숫자를 입력해 주세요.");
		while (true) {
			System.out.print(" >> ");
			String str = scan.nextLine();

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				continue;
			}
			if (num > 11) {
				System.out.println("10이하의 수를 입력하세요.");
				continue;
			}

			if (num < rndNum) {
				System.out.println("UP");
				continue;
			} else if (num > rndNum) {
				System.out.println("DOWN");
				continue;
			} else {
				System.out.printf("정답입니다. : %d\n", num);
				break;
			}

		}

	}

}
