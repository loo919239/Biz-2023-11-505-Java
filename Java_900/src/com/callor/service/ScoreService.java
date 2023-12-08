package com.callor.service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Spring;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {
	private List<ScoreDto> scores = null;

	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
	}

	public void inputScore() {
		ScoreDto scoreDto = new ScoreDto();

		String strStdNum = "23000";
		if (scores.size() > 0) {
			strStdNum = scores.get(scores.size() - 1).stdNum;
		}

		int intStdNum = Integer.valueOf(strStdNum.substring(2));
		intStdNum++;

		strStdNum = String.format("23%03d", intStdNum);

		int scoreKor = (int) (Math.random() * 51) + 50;
		int scoreEng = (int) (Math.random() * 51) + 50;
		int scoreMath = (int) (Math.random() * 51) + 50;
		int scoreMusic = (int) (Math.random() * 51) + 50;
		int scoreAtr = (int) (Math.random() * 51) + 50;

		scoreDto.stdNum = strStdNum;
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		scoreDto.music = scoreMusic;
		scoreDto.art = scoreAtr;

		scores.add(scoreDto);
	}

	public void printScore() {
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		int sumArt = 0;
		int sumTotal = 0;
		float sumAvg = 0;

		int lineNum = 80;

		Line.title("* 한울 고교 새별 반 성적 리스트 *", lineNum);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(lineNum);
		
		for (ScoreDto dto : scores) {
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%3d\t",dto.kor);
			System.out.printf("%3d\t",dto.eng);
			System.out.printf("%3d\t",dto.math);
			System.out.printf("%3d\t",dto.music);
			System.out.printf("%3d\t",dto.art);
			
			System.out.printf("%3d\t",dto.getTotal());
			System.out.printf("%5.2f\n",dto.getAvg());
			sumKor += dto.kor;
			sumEng += dto.eng;
			sumMath += dto.math;
			sumMusic += dto.music;
			sumArt += dto.art;
			sumTotal += dto.getTotal();
			sumAvg += dto.getAvg();
			
			
		}
		float avgKor = sumKor / scores.size();
		float avgEng = sumEng / scores.size();
		float avgMath = sumMath / scores.size();
		float avgMusic = sumMusic / scores.size();
		float avgArt = sumArt / scores.size();
		float avgAvg = sumAvg / scores.size();
		
		Line.sLine(lineNum);
		System.out.printf("총점\t%4d\t%4d\t%4d\t%4d\t%4d\t%4d\n",
				sumKor,sumEng,sumMath,sumMusic,sumArt,sumTotal);
		System.out.printf("평균\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t\t%5.2f\n",
				avgKor,avgEng,avgMath,avgMusic,avgArt, avgAvg);
		Line.dLine(lineNum);
	}

}
