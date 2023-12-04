package com.callor.oop.exec;

public class StringBA {
	public static void main(String[] args) {
		int sum = 0;
		String nums = "50,88,70,100,98";
		String[] num = nums.split(",");
		for (int i = 0; i < num.length;i++) {
			System.out.println(num[i]);
		}

		for (int i = 0; i < num.length; i++) {
			sum += Integer.valueOf(num[i]);
		}
		System.out.println();
		System.out.println("합계 : " + sum);
	}

}
