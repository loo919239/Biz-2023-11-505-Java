package com.callor.hello.arrays;

public class ArraysB {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int scoreKors = (int) (Math.random() * 50) + 51;
			nums[i] = scoreKors;
		}
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		double num = sum / 10.00;
		System.out.println("===========================================");
		System.out.printf("국어 점수 총점 : %d, 평균 : ", sum);
		System.out.printf("%.2f\n",num);
		System.out.println("===========================================");
	}
}
