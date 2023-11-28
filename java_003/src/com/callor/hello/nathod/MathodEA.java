package com.callor.hello.nathod;

public class MathodEA {
	public static int buy(int money) {
//		int money = 2000;
		int cup = 1500;
		int change = money - cup;
		return change;
	}
	public static void main(String[] args) {
		
		int myMoney = 2000;
		int change = buy(2000);
		System.out.printf("전달하는 값 %d, 잔액 : %d\n ", myMoney, change);
	}

}
