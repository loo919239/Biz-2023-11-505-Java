package com.callor.hello.arrays;

public class ArraysA {
	public static void main(String[] args) {
		int num1 = 0;
		for (int i = 0; i < 5; i++) {
			num1 = (int) (Math.random() * 50) + 51;
			System.out.printf("%d 번째 값 : %d\n", i + 1, num1);

		}
	}
}
