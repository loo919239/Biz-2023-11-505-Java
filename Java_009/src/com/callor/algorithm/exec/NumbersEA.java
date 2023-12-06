package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersEA {
	public static void main(String[] args) {
		int num = 25;
		int sum = 0;

		for (int dan = 2; dan < 10; dan++) {
			Line.dLine(num);
			System.out.println(dan + " 단 구구단");
			Line.sLine(num);
			for (int item = 1; item < 10; item++) {
				sum = dan * item;
				if (sum % 2 == 0) {
					System.out.printf("%2d ×%2d =%d\n ", dan, item, sum);
				}
			}
			Line.sLine(num);
		}
		Line.dLine(num);

	}
}
