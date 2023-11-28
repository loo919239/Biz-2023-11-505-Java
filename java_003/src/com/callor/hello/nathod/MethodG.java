package com.callor.hello.nathod;

public class MethodG {
	public static boolean isPrime(int num) {
		int index = 0;
		boolean noPrime = false;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				noPrime = true;
				break;
			}
		}
		return noPrime;
	}

	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 100) + 1;
		boolean isPrime = isPrime(rndNum);

		if (isPrime != true) {
			System.out.println(rndNum + " 소수임");
		} else {
			System.out.println(rndNum + " 소수 아님");
		}

	}

}
