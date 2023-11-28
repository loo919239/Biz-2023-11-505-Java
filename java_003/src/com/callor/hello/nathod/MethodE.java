package com.callor.hello.nathod;

public class MethodE {
	public static int buy () {
		int num1 = 2000;
		int num2 = 1500;
		int result = num1 - num2;
		return result;
	}
	public static void main(String[] args) {
		int change = buy();
		int num = 2000;
		buy();
		
		System.out.println(change);
	}

}
