package com.callor.hello.nathod;

public class MethodJ {
	public static boolean isEven(int num) {
		for (int i = 0; i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			Boolean isEven = true;
			isEven = isEven(num);
			if (isEven != true) {
				System.out.println(num + " 는 짝수");
			} else {
				System.out.println(num + " 는 짝수 아님");
			}
		}
	}

}
