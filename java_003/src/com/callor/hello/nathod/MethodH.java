package com.callor.hello.nathod;

public class MethodH {
	public static boolean isPrime(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 0;
		boolean isPrime = true;
		System.out.println("===============================");
		System.out.println("소수판별하기");
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 100) + 2;
			isPrime = isPrime(num);

			if (isPrime != true) {
				System.out.println(num + "는 소수가 아님");

			} else {
				System.out.println(num + "는 소수임");
			}

		}
		System.out.println("===============================");
	}
}
