package com.callor.score;

import com.callor.score.utils.Line;
import com.callor.service.ScoreService;

public class Score {
	
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		for (int i = 0; i < 10; i++) {
			scoreService.inputScore();
		
		}
		scoreService.printScore();
		
		
		
		
	}

}
