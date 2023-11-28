package com.callor.hello.nathod;

public class MathodHA {
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("소수판별하기");
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			boolean isPrime = isPrime(num);

			if (isPrime != true) {
				System.out.println(num + "는 소수가 아님");

			} else {
				System.out.println(num + "는 소수");
			}

		}
		System.out.println("===============================");
	}
}
