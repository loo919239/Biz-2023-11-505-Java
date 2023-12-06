package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersGA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();

		Line.dLine(30);
		int num = numService.inputNum("점수를");
		
		Line.sLine(30);
		String scoreGradeA = "F";
		if (num >= 95) scoreGradeA = "A+";
		else if (num >= 90) scoreGradeA = "A";
		else if (num >= 85) scoreGradeA = "B+";
		else if (num >= 80) scoreGradeA = "B";
		else if (num >= 75) scoreGradeA = "C+";
		else if (num >= 70) scoreGradeA = "C";
		else if (num >= 65) scoreGradeA = "D+";
		else if (num >= 60) scoreGradeA = "D";
		System.out.println(scoreGradeA + " 입니다");

		if (num >= 80) {
			System.out.println("축하합니다");
		} else if (num >= 70) {
			System.out.println("더 분발하세요");
		} else if (num < 60) {
			System.out.println("낙제입니다");
		}
		Line.dLine(30);
	}
}
