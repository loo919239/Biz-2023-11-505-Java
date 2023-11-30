package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputF {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Line.dLine(30);
		System.out.println("짝수 구하기");
		int index = 0;
		while (true) {
			Line.sLine(30);
			System.out.println("종료하려면 'QUIT' 입력");
			System.out.print("정수 >> ");
			String str = scan.nextLine();
		
			if (str.equals("QUIT")) {
				System.out.println("짝수 구하기 종료");
				Line.dLine(30);
				break;
			}
			try {
				index = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("올바른 정수를 입력해 주세요");
				continue;
			}

			if (index < 11 && index > 1) {
				if (index % 2 == 0) {
					System.out.println(str + "는 짝수가 맞습니다.");
				} else {
					System.out.println(str + "는 짝수가 아닙니다.");
				}
			} else {
				System.out.println("2부터 10까지의 정수를 입력하세요");
				continue;
			}

		}

	}

}
