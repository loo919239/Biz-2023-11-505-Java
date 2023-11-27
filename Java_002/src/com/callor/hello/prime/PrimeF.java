package com.callor.hello.prime;

public class PrimeF {
	/*
	 * main 에서 실행할 코드를 isPrime() method 로 분리
	 * 이제 main 에서는 isPrime로 호출하기만 하면 된다
	 */
	public static void isPrime() {
		int num = (int) (Math.random() * 100) + 2;
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}
		if (index < num) {
			System.out.printf("%3d MOD %3d = %3d", num, index, num % index);
			System.out.println(num + "는 소수가 아님");

		} else {
			System.out.println(num + "는 소수임");
		}
	}

	public static void main(String[] args) {
		// isPrime() method 를 10번 반복 "호출하기"
		for (int i = 0; i < 10; i++) {
			isPrime();
		}

	}

}
