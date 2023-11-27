package com.callor.hello.prime;

public class PrimeG {
	public static void main(String[] args) {
//		int num = 0;
		int index = 0;
		System.out.println("==================================");
		System.out.println("소수 판별하기");
		System.out.println("----------------------------------");
		for (int i = 1; i < 100; i++) {
			int num = i+1;
			for (index = 2; index < num + 1; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index >= num) {
				System.out.println(num + "는 소수임");
			}
		}
		
	}
}
