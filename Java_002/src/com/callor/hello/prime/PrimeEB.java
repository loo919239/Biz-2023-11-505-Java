package com.callor.hello.prime;

public class PrimeEB {
	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("소수 판별하기");
		System.out.println("----------------------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index < num) {
				System.out.printf("%d MOD %d = %d, ", num, index, num % index);
				System.out.println(num + "는 소수가 아님");

			} else {
				System.out.println(num + "는 소수임");

			} // end 출력
		} //
		System.out.println("==================================");

	} // 
}