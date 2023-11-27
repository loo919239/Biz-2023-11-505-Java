package com.callor.hello.algorith;

public class AlgB {
	public static void main(String[] args) {
		/*
		 * 1~100까지의 수 중에서
		 * 3의 배수의 합과 5의 배수의 합
		 */
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 3 == 0) {
				sum1 += i + 1;
			}
			if ((i + 1) % 5 == 0) {
				sum2 += i + 1;
			}
		}
		System.out.print("3의 배수 + 5의 배수 = ");
		System.out.println(sum1 + sum2);
		System.out.print("3의 배수 - 5의 배수 = ");
		System.out.println(sum1 - sum2);
		System.out.print("3의 배수 * 5의 배수 = ");
		System.out.println(sum1 * sum2);
		System.out.print("3의 배수 / 5의 배수 = ");
		System.out.println(sum1 + sum2);
		
		System.out.println("=============================");
		int sum3 = 0;
		int sum5 = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			if(num % 3 == 0) {
				sum3 += num;
			}
				if(num % 5 == 0) {
					sum5 += num;
			}
		}
		System.out.printf("%d + %d = %d\n",
				sum3, sum5, sum3+sum5);
		System.out.printf("%d - %d = %d\n",
				sum3, sum5, sum3-sum5);
		System.out.printf("%d x %d = %d\n",
				sum3, sum5, sum3*sum5);
		System.out.printf("%d ÷ %d = %d\n",
				sum3, sum5, sum3/sum5);

	}

}
