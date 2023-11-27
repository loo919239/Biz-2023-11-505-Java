package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		int num = 7;
		boolean noPrime = false;
		int index = 0;
		System.out.println("=================================");
		System.out.printf("%d 는 Prime Number 인가?\n", num);
		System.out.println("---------------------------------");
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				noPrime = true;
				break;
			}

		}
		if (noPrime) {
			System.out.printf("%d MOD %d = %d,", num, index, num % index);
			System.out.println(num + " 는 소수가 아님");
		} else {
			System.out.println(num + " 는 소수임");
		}

	}
}
