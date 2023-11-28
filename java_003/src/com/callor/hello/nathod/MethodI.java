package com.callor.hello.nathod;

public class MethodI {
	public static int isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("====================");
		System.out.println("소수 판별하기");
		System.out.println("--------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int index = isPrime(num);
			if (index != 0) {
				System.out.println(num + "는 소수");
			} else {
				System.out.println(num + "는 소수 아님");
			}
			sum += index;
		}
		System.out.println("--------------------");
		System.out.println("소수들의 합 : " + sum);
		System.out.println("====================");
	}
}
