package com.callor.oop.exec;

import com.callor.oop.survice.ScoreService;

public class ScoreB {
	
	public static void main(String[] args) {
		/*
		 * 5명 학생의 성적 처리를 하기 위하여
		 * SxoreService 클래스를 (설계도로하여) 사용하여
		 * 5개의 scores 배열을 "선언만" 한다
		 */
		ScoreService[] scores = new ScoreService[5];
		
		
		//0 은 철수, 1은 영희, 2는 민수, 3은 길동, 4는 꺽정
		// 객체 배열운 선언만 되어 있을때는
		// 내부에 포함하는 변수, method 를 사용할 수 없다
		// 각각의 배열 요소를 다시 한번
		// 객체로 생성(new) 해주어야 한다
		scores[0] = new ScoreService();
		scores[0].scoreKor = 100;
		scores[0].scoreEng = 80;
		scores[0].scoreMath = 90;
		
		scores[1] = new ScoreService();
		scores[1].scoreKor = 90;
		scores[1].scoreEng = 70;
		scores[1].scoreMath = 95;
		
		scores[2] = new ScoreService();
		scores[2].scoreKor = 80;
		scores[2].scoreEng = 70;
		scores[2].scoreMath = 60;
		
		//영희 (1번 배열)의 총점과 평균 출력
		
		// scoreTotal 변수는 private 으로 설정되어 있어서
		// 변수에 값을 직접 참조(읽기)할 수 없다
		// scoreTotal 변수의 값을 상요하려면
		// 반드시 getscoreTotal() method 를 통해서만 가능
//		System.out.println(scores[1].scoreTotal);
		
		System.out.println(scores[1].getscoreAvg());
		System.out.println(scores[1].getScoreTotal());
		
	}

}
