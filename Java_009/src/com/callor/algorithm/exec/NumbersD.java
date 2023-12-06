package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersD {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int sum = 0;
		int count = 0;
		Line.dLine(40);
		while (sum<1000) {
			int num = numService.inputNum("숫자를");
			sum += num;
			count++;
		}
		Line.sLine(40);
		System.out.printf("%d 번 입력한 숫자의 총 합 : %d\n",count, sum);
		Line.dLine(40);
	}

}
