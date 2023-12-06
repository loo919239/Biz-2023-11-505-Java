package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersE {
	public static void main(String[] args) {
		int num = 50;
		int sum = 0;

		for (int i = 1; i < 9; i++) {
			Line.dLine(num);
			System.out.println((i + 1) + " 단 구구단");
			Line.sLine(num);
			for (int j = 0; j < 9; j++) {
				sum = (i + 1) * (j + 1);
				if (sum % 2 == 0) {
					System.out.printf("\t %2d ×%2d = ", (i + 1), (j + 1));
					System.out.println(sum);
				}
			}
			Line.sLine(num);
		}
		Line.dLine(num);

	}
}
