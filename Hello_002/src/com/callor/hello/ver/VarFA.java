package com.callor.hello.ver;

public class VarFA {
	public static void main(String[] args) {
		
		
		float scoreKor = 80.2f;
		float scoreEng = 70.3f;
		float scoreMath = 80.3f;
		
		float total = scoreKor + scoreEng + scoreMath;
		float avg = total / 3;
		
		
		System.out.println("=====================");
		System.out.println("성적표");
		System.out.println("=====================");
		System.out.print("국어 : ");
		System.out.println(scoreKor);
		System.out.print("영어 : ");
		System.out.println(scoreEng);
		System.out.print("수학 : ");
		System.out.println(scoreMath);
		System.out.println("---------------------");
		System.out.print("총점 : ");
		System.out.println(total);
		System.out.print("평균 : ");
		System.out.println(avg);
		System.out.println("=====================");
		
	}

}
