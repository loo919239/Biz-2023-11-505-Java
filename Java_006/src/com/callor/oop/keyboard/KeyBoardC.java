package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 10) + 1;
		int count = 0;

		System.out.println("=".repeat(30));
		System.out.println("숫자 맞추기 게임");
		System.out.println("=".repeat(30));
		System.out.println("1 ~ 10까지 정수를 입력하세요.");

		while (true) {

			System.out.print("정수 >> ");
			String str = scan.nextLine();

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				continue;
			}
			if (num < 1 || num > 10) {
				System.out.println("1~ 10까지 범위의 정수만 입력하세요.");
				continue;
			}
			if ((count - 1) >= 5) {
				System.out.println(count + "번 이상 입력하셨습니다.");
				System.out.println("GAME OVER!");
				System.out.println("정답 : " + rndNum);
				break;
			}
			if (num == rndNum) {
				count++;
				System.out.printf("참 잘했어요 : %d\n", num);
				System.out.println(count + "번 입력했습니다.");
				break;

			} else if (num > rndNum) {
				count++;
				System.out.println("입력한 값이 너무 커요");
				continue;
			} else if (num < rndNum) {
				count++;
				System.out.println("입력한 값이 너무 작아요");
				continue;
			}

		} // end while

	}// end main

}
