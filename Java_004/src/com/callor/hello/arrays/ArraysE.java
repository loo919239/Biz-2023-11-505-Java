package com.callor.hello.arrays;

public class ArraysE {
	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMeths = new int[STUDENT_LENGTH];

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

		int sumKors = 0;
		int sumEngs = 0;
		int sumMaths = 0;
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sumKors += scoreKors[i];
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sumEngs += scoreEngs[i];
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sumMaths += scoreMeths[i];
		}

		System.out.println("=".repeat(50));
		System.out.println("   샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			int sum = scoreKors[i];
			sum += scoreEngs[i];
			sum += scoreMeths[i];
			float avg = (float) sum / 3;
			System.out.printf("%3d\t", i + 1);
			System.out.printf("%d", scoreKors[i]);
			System.out.printf("	%d", scoreEngs[i]);
			System.out.printf("	%d", scoreMeths[i]);
			System.out.printf("	%4d", sum);
			System.out.printf("	%5.2f\n", avg);
		}
		float avg2 = ((float)sumKors + sumEngs + sumMaths) / 10;
		System.out.println("-".repeat(50));
		System.out.printf("총점\t%d\t%d\t%d\t%d\n", sumKors, sumEngs, sumMaths, (sumKors + sumEngs + sumMaths));
		System.out.printf("평균\t%d\t%d\t%d\t\t%5.2f\n", sumKors / 10, sumEngs / 10, sumMaths / 10, avg2);
		System.out.println("=".repeat(50));
	}
}
