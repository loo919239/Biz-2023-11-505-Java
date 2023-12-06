package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class ScannerCA {

	public static void main(String[] args) {
		Line.dLine(40);
		NumberService keyService = new NumberService();
		int num1 = keyService.inputNum("첫 번째 정수를");
		int num2 = keyService.inputNum("두 번째 정수를");

		if (num1 < num2) {
			int _temp = num1;
			num1 = num2;
			num2 = _temp;
		}
//		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		keyService.printAlgebra(num1, num2);
		
	}
}
