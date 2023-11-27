package com.callor.hello.algorith;

public class AlgA {
	public static void main(String[] args) {
		/*
		 * 1~100까지 숫자중의 3의 배수의 합
		 */
		int sum = 0;

		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 3 == 0) {
				sum += i + 1;
			}
		}
		System.out.println("1~100까지 숫자 중 3의 배수의 합 : " + sum);
		System.out.println("=====================================");
		
		sum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			if(num % 3 == 0) {
				// num의 값이 3의 배수인 경우만 
				//실행되는 코드
				sum += num;
			}
		}
		System.out.println(sum);
		
	}

}
