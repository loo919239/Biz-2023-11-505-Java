package com.callor.hello.service;

public class NumberService {
	
	//static이 없는 method
	
	//두개의 정수값을 매개변수(num1, num2)를 통하여 전달받아 정수값을 덧셈한 후 return 하는 method
	public int add(int num1, int num2) {
		
		int result = num1 + num2;
		return result;
	}

}
