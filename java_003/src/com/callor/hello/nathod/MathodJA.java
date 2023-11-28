package com.callor.hello.nathod;

public class MathodJA {
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			 Boolean isEven = isEven(num);
			if (isEven) {
				System.out.println(num + " 는 짝수");
			} else {
				System.out.println(num + " 는 짝수 아님");
			}
		}
	}
}
