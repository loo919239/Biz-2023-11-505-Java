package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		/*
		 * 우리나라 화폐는
		 * 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위이다
		 * 아래 pay 에 저장된 값에서
		 * 각각 화폐단위만큼 몇개씩 포함되는지 
		 * 출력하시오
		 */
		int pay = 3587964;
		System.out.println("50,000원권 : " + pay / 50000 + "매");
		
		pay = pay % 50000; //나머지: 37,964원
		System.out.println("10,000원권 : " + pay / 10000 + "매");
		
		pay = pay % 50000 % 10000;
		System.out.println("5,000원권 : " + pay / 5000 + "매");
		
		pay = pay % 50000 % 10000 % 5000;
		System.out.println("1,000원권 : " + pay / 1000 + "매");
		
		pay = pay % 50000 % 10000 % 5000 % 1000;
		System.out.println("500원권 : " + pay / 500 + "매");
		
		pay = pay % 50000 % 10000 % 5000 % 1000 % 500;
		System.out.println("100원권 : " + pay / 100 + "매");
		
		pay = pay % 50000 % 10000 % 5000 % 1000 % 500 % 100;
		System.out.println("50원권 : " + pay / 50 + "매");
		
		pay = pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50;
		System.out.println("10원권 : " + pay / 10 + "매");
		
		// ==========================================
		System.out.println(" ");
		
		pay = 3587964;
		System.out.print("50,000원권 : ");
		System.out.print(pay / 50000);
		System.out.println("매");
		System.out.print("10,000원권 : ");
		System.out.print((pay = pay % 50000) / 10000);
		System.out.println("매");
		System.out.print("5,000원권 : ");
		System.out.print((pay = pay % 10000) / 5000);
		System.out.println("매");
		System.out.print("1,000원권 : ");
		System.out.print((pay = pay % 5000) / 1000);
		System.out.println("매");
		System.out.print("500원권 : ");
		System.out.print((pay = pay % 1000) / 500);
		System.out.println("매");
		System.out.print("100원권 : ");
		System.out.print((pay = pay % 500) / 100);
		System.out.println("매");
		System.out.print("50원권 : ");
		System.out.print((pay = pay % 100) / 50);
		System.out.println("매");
		System.out.print("10원권 : ");
		System.out.print((pay = pay % 50) / 10);
		System.out.println("매");

	}

}
