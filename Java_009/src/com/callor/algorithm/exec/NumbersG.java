package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersG {
	public static void main(String[] args) {
		NumberService numService = new NumberService();

		Line.dLine(30);
		int num = numService.inputNum("점수를");
		Line.sLine(30);
		if (num >= 95) {
			System.out.println("A+ 입니다");
		} else if (num >= 90) {
			System.out.println("A 입니다");
		} else if (num >= 85) {
			System.out.println("B+ 입니다");
		} else if (num >= 80) {
			System.out.println("B 입니다");
		} else if (num >= 75) {
			System.out.println("C+ 입니다");
		} else if (num >= 70) {
			System.out.println("C 입니다");
		} else if (num >= 65) {
			System.out.println("D+ 입니다");
		} else if (num >= 60) {
			System.out.println("D 입니다");
		} else {
			System.out.println("F 입니다");
		}

		if (num >= 80) {
			System.out.println("축하합니다");
		} else if (num >= 70) {
			System.out.println("더 분발하세요");
		} else {
			System.out.println("낙제입니다");
		}
		Line.dLine(30);
	}
}
