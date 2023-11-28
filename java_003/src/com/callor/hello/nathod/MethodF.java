package com.callor.hello.nathod;

public class MethodF {
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		int scorA = 90;
		int scorB = 80;
		int result = add(scorA, scorB);
		
		System.out.printf("국어 %d, 영어 %d, 총점 : %d\n", scorA,scorB,result);
	}

}
