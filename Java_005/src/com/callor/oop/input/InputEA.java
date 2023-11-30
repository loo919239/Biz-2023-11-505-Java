package com.callor.oop.input;

import java.util.Scanner;

public class InputEA {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);

		System.out.print("정수1 입력 >> ");
		String str = scan.nextLine();
		nums[0] = Integer.valueOf(str);

		System.out.print("정수2 입력 >> ");
		str = scan.nextLine();
		nums[1] = Integer.valueOf(str);

		System.out.print("정수3 입력 >> ");
		str = scan.nextLine();
		nums[2] = Integer.valueOf(str);

		System.out.println("=".repeat(20));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
