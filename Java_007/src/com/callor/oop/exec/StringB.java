package com.callor.oop.exec;

public class StringB {
	public static void main(String[] args) {
		int sum = 0;
		String nums = "50,88,70,100,98";
		String[] num = nums.split(",");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			int num1 = Integer.valueOf(num[i]);
			sum = sum + num1;
		}
		System.out.println();
		System.out.println(sum);
	}

}
