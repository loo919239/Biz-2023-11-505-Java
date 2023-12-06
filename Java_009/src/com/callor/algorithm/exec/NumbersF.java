package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersF {
	public static void main(String[] args) {
		NumberService numService = new NumberService(); 
		
		Line.dLine(25);
		int num = numService.inputNum("정수를");
		Line.sLine(25);
		
		for (int dan = 2; dan < 10; dan++) {
			for (int item = 1; item < 10; item++) {
				int sum = dan * item;
				if (sum % num == 0) {
					System.out.printf("%2d ×%2d =%d\n", dan, item, sum);
				}
			}
		}
		Line.sLine(25);
		Line.dLine(25);

	}
}
