package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersH {
	public static void main(String[] args) {
		NumberService numService = new NumberService();

		Line.dLine(40);
		System.out.println("세 과목의 점수를 입력 하세요");
		int score1 = numService.inputNum("첫 번째 점수를");
		int score2 = numService.inputNum("두 번째 점수를");
		int score3 = numService.inputNum("세 번째 점수를");
		int Total = score1 + score2 + score3;
		float avg = Total / 3;
		
		Line.sLine(40);
		System.out.printf("세 점수의 평균 : %5.2f\n",avg);
		if (avg >= 60) {
			System.out.println("축하합니다\n합격입니다");
		} else {
			System.out.println("아쉽지만\n낙제입니다");
		}
		Line.dLine(40);
	}
}

