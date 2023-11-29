package com.callor.hello.arrays;

public class ArraysG {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];

		for (int i = 0; i < scoreKors.length; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndNum;
		}
		System.out.println("-".repeat(20));
		System.out.println("국어\t평점");
		System.out.println("-".repeat(20));
		int sum = 0;
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sum += scoreKors[i];
			if (scoreKors[i] >= 95) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("A+");

			} else if (scoreKors[i] >= 90) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("A");
			} else if (scoreKors[i] >= 85) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("B+");
			} else if (scoreKors[i] >= 80) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("B");
			} else if (scoreKors[i] >= 75) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("C+");
			} else if (scoreKors[i] >= 70) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("C");
			} else if (scoreKors[i] >= 65) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("D+");
			} else if (scoreKors[i] >= 60) {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("D");
			} else {
				System.out.printf("%d	", scoreKors[i]);
				System.out.println("F");
			}
		}

	}

}
