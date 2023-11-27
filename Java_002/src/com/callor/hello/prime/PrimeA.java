package com.callor.hello.prime;

public class PrimeA {
	public static void main(String[] args) {
		// 어떤 수가 prime 인가 판별하기 위하여
		// 선언한 변수
		int num1 = 9;
		System.out.println("==================");
		System.out.println(num1 + " 는 Prime Number 인가?\n");
		System.out.println("------------------");
		for (int i = 2; i < num1; i++) {
			System.out.printf("%d MOD %d = %d\n", num1, i, num1 % i++);

		}
	}

//		int num1 = 9;
//		int num2 = 2;
//
//		System.out.println("==================");
//		System.out.printf("%d는 Prime Number 인가?\n", num1);
//		System.out.println("------------------");
//		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2++);
//		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2++);
//		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2++);
//		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2++);
//		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2++);
//		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2++);
//		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2++);
//		System.out.println("==================");
}
