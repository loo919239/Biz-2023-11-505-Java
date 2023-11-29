package com.callor.hello.arrays;

public class ArraysFA {
	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 3;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMeths = new int[STUDENT_LENGTH];

		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];

		int[] totalSum = new int[SUBJECT_COUNT];
		float[] totalAvg = new float[SUBJECT_COUNT];

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

		for (int i = 0; i < SUBJECT_COUNT; i++) {
			totalSum[0] += scoreKors[i];
			totalSum[1] += scoreEngs[i];
			totalSum[2] += scoreMeths[i];
		}
		for (int i = 0; i < SUBJECT_COUNT; i++) {
			totalAvg[i] = totalSum[i] / SUBJECT_COUNT;
		}
		System.out.println("=".repeat(50));
		System.out.println("   샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%2d", i + 1);
			System.out.printf("	%4d", scoreKors[i]);
			System.out.printf("	%4d", scoreEngs[i]);
			System.out.printf("	%4d", scoreMeths[i]);
			System.out.printf("	%5d", sums[i]);
			System.out.printf("	%5.2f\n", avgs[i]);
		}
		System.out.print("총점\t");
		int totalOfTotalSum = 0;
		// 과목 총점 출력하면서 총점으 총점 계산
		for (int i = 0; i < SUBJECT_COUNT; i++) {
			System.out.printf("%4d\t", totalSum[i]);
			totalOfTotalSum += totalSum[i];
		}
		System.out.printf("%5d\n", totalOfTotalSum);
		System.out.print("평균\t");
		float avgOFTotalAvg = 0;

		for (int i = 0; i < SUBJECT_COUNT; i++) {
			System.out.printf("%4.0f\t", totalAvg[i]);
			avgOFTotalAvg += totalAvg[i];
		}
		avgOFTotalAvg /= SUBJECT_COUNT;
		System.out.printf("\t%5.2f\n", avgOFTotalAvg);
		System.out.println("=".repeat(50));
	}

}
