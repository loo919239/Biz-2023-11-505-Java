package com.callor.oop.exec;

import com.callor.oop.survice.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreC {
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		
		int index = 0;

		for (index = 0; index < scores.length; index++) {
			scores[index] = new ScoreService();
		}

		for (int i = 0; i < scores.length; i++) {
			scores[i].scoreKor = (int)(Math.random() * 50) + 51;
			scores[i].scoreEng = (int)(Math.random() * 50) + 51;
			scores[i].scoreMath = (int)(Math.random() * 50) + 51;
		}
		
		// 10개의 배열의 각 과목점수를 Random으로 생성하고자 한다
		
		Line.title(40, "		성적표");
		Line.dLine(40);
		System.out.println(" 국어\t영어\t수학\t총점\t평균");
		Line.sLine(40);
		for (int i = 0; i <scores.length; i++) {
			System.out.printf(" %3d\t",scores[i].scoreKor);
			System.out.printf("%3d\t",scores[i].scoreEng);
			System.out.printf("%3d\t",scores[i].scoreMath);
			System.out.printf("%3d\t",scores[i].getScoreTotal());
			System.out.printf("%5.2f\n",scores[i].getscoreAvg());
		}
		Line.dLine(40);

		

	}

}
