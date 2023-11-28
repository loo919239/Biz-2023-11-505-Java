package com.callor.hello.nathod;

public class MethodGC {
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
		int rndNum = (int) (Math.random() * 100) + 2;
		boolean isPrime = isPrime(rndNum);

		if (isPrime) {
			System.out.println(rndNum + " 소수임");
		} else {
			System.out.println(rndNum + " 소수 아님");
		}

	}
}
