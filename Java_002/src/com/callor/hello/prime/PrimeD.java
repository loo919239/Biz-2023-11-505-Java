package com.callor.hello.prime;

public class PrimeD {
	public static void main(String[] args) {
		// 임의의 숫자 생성하기
		int num = (int) (Math.random() * 10) + 2;

		// 소수인가 판별하기
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}

		// 판별 결과 출력하기
		System.out.println("=======================");
		System.out.println(num + "는 Prime Number 인가?");
		System.out.println("-----------------------");
		if (index < num) {
			System.out.printf("%d MOD %d = %d,", num, index, num % index);
			System.out.println("는 소수가 아님");
		} else {
			System.out.println(num + "는 소수임");
		}
		System.out.println("=======================");
	}

}
