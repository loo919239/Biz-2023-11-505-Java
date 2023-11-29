package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMeths = new int[STUDENT_LENGTH];
		int sum = 0;
		float avg = 0;

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

		System.out.println("=".repeat(50));
		System.out.println("   샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("국어	영어	수학	총점	평균");
		System.out.println("-".repeat(50));
		for (int index = 0; index < scoreKors.length; index++) {
			sum = scoreKors[index] + scoreEngs[index] + scoreMeths[index];
			avg = (float) sum / 3;
			System.out.printf("%3d %7d %7d %7d     %5.2f\n",
					scoreKors[index], scoreEngs[index], scoreMeths[index], sum,
					(float) sum / 3);
		}
		System.out.println("=".repeat(50));
	}

}
