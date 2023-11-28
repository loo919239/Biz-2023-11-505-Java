package com.callor.hello.nathod;

public class MethodGA {
	/*
	 * num 라는 값을 전달받아서
	 * prime 인지 검사하고 prime 이면 true, 아니면 false 를
	 * return 하겠다라는 선언
	 */
	public static boolean isPrime(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}
		if(index < num) {
			return false;
		} else {
			return true;
		}
	
	}
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 100) + 2;
		boolean isPrime = isPrime(rndNum);

		if (isPrime != true) {
			System.out.println(rndNum + " 소수임");
		} else {
			System.out.println(rndNum + " 소수 아님");
		}
	}

}
