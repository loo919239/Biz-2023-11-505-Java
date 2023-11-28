package com.callor.hello.arrays;

public class ArraysE {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			if (nums[i] > 80) {
				System.out.printf("index %d 번 요소의 값 : %d\n", i, nums[i]);
			}
		}
		System.out.println("==============================================");
		
		int[] nums1 = new int[10];
		for (int i = 0; i < 10; i++) {
			nums1[i] = (int) (Math.random() * 50) + 51;
			if (nums1[i] > 80) {
				System.out.printf("index %d 번 요소의 값 : %d\n", i, nums1[i]);
			}
		}
	}
}
