package com.callor.oop.input;

import java.util.Scanner;

public class InputE {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("정수1 입력 >> ");
			String str1 = scan.nextLine();
			try {
				nums[0] = Integer.valueOf(str1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수의 값을 다시 입력해 주세요");
				continue;
			}
			break;
		}
		while (true) {
			System.out.print("정수2 입력 >> ");
			String str2 = scan.nextLine();
			try {
				nums[1] = Integer.valueOf(str2);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수의 값을 다시 입력해 주세요");
				continue;
			}
			break;
		}
		while (true) {
			System.out.print("정수3 입력 >> ");
			String str3 = scan.nextLine();
			try {
				nums[2] = Integer.valueOf(str3);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수의 값을 다시 입력해 주세요");
				continue;
			}
			break;
		}
		scan.close();

		System.out.println("=".repeat(20));
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

	}

}
