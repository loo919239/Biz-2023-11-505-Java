package com.callor.algorithm.service;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class NumberService {

	/*
	 * 현재 클래스의 여러 method 에서 Scanner 를 사용하여 키보드 입력을 받아야 한다 Scanner scan = null 코드에
	 * 의해서 Scanner 를 선언을 했다 하지만 아직 사용할 준비가 아직 되지 않아 Scan.nextLine() 등의 코드를 실행하면
	 * NullpointerException 이 발행한다 Exception 발생을 방지하기 위해 scan,nextLine() 코드를 실행하기 전
	 * scan 초기화 코드 " scan = new Scanner(system.in)"을 실행하여 scan ...
	 */
	private Scanner scan = null;

	public NumberService() {
		scan = new Scanner(System.in);
	}

	public int inputNum(String title) {
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

	public void printAlgebra(int num1, int num2) {
		int num = 40;
		Line.sLine(num);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d × %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		Line.dLine(num);
	}

}
