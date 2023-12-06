package com.callor.algorithm.exec;

import java.util.Iterator;
import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class ScanGuguAA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int num = 50;
		int num1 = 0;
		Line.dLine(num);
		int dan = numService.inputNum("원하는 구구단 단수를");
		Line.dLine(num);
		System.out.printf("\t %d 단 구구단\n", dan);

		Line.sLine(num);
		for (int i = 0; i < 9; i++) {
			System.out.printf("\t %2d ×%2d = %2d\n", dan, (i + 1), dan * (i + 1));
		}
		Line.dLine(num);

	}
}
