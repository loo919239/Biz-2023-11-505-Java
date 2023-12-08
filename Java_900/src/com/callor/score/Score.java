package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.utils.Line;

public class Score {

	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();

		scoreService.inputScore();

		scoreService.printScore();

	}

}
