package com.callor.hello.prime;

public class PrimeB {
	public static void main(String[] args) {
		int num = 15;
		System.out.println("==================");
		System.out.println(num + " 는 Prime Number 인가?");
		System.out.println("------------------");
		for (int indec = 2; indec < num; indec++) {
			if (num % indec == 0) {
				System.out.printf("%d MOD %d = %d, %d 는 소수가 아님\n", num, indec, num % indec++, num);
				break;
			}
		}
		
	}
}
