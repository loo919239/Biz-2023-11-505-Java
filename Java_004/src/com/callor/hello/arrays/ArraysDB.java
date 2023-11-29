package com.callor.hello.arrays;

public class ArraysDB {
	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMeths = new int[STUDENT_LENGTH];

		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];

		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		}
		for (int i = 0; i < scoreEngs.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreEngs[i] = rndScore;
		}
		for (int i = 0; i < scoreMeths.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreMeths[i] = rndScore;

		}

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreMeths[i];
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			avgs[i] = (float) sums[i] / 3;
		}

		System.out.println("=".repeat(50));
		System.out.println("   샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%d", scoreKors[i]);
			System.out.printf("	%d", scoreEngs[i]);
			System.out.printf("	%d", scoreMeths[i]);
			System.out.printf("	%4d", sums[i]);
			System.out.printf("	%5.2f\n", avgs[i]);
		}
		System.out.println("=".repeat(50));
	}

}
