package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersA {
	public static void main(String[] args) {
		Line.dLine(80);
		int count = 1;
		while (true) {
			System.out.print(count + "\t");
			count += 1;
			if (count > 10) {
				break;
			}
		}
		System.out.println();
		Line.dLine(80);
	}

}
