package com.callor.oop.exec;

import com.callor.oop.survice.ScoreService;

public class ScoreCA {
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];

		for(int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}

		scores[0].scoreKor = 100;
		scores[0].scoreEng = 80;
		scores[0].scoreMath = 90;

		System.out.println(scores[0].getScoreTotal());

		System.out.println(scores[0].getscoreAvg());

	}

}
