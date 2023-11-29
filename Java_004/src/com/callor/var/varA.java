package com.callor.var;

import com.callor.hello.service.NumberService;

public class varA {
	
	public static void main(String[] args) {
	//NumberService의 add() method 에게 두개의 정수를 전달하고
		// 결과를 returm 받아서 consol에 출력하고싶다
		
		// NumberService 클래스에 있는 add() method를 사용하려고 하는데
		// add() method는 static이 없다
		// 그래서 이 mrthod는 numberservice.add() 처럼 사용할 수 없다.
		
		//int[] num = NumberService.add(10,20);
		
		//NumberService의 add() method를 사용하려면
		// 먼저 준비를 해야한다
		/*
		 * NumberService 클래스(설계도)룰 가지고
		 * 객체(Object, 집)를
		 * 새로(new) 만들어죠(NumberSurvice())
		 */
		
		NumberService numverService1 = new NumberService();
		NumberService numverService2 = new NumberService();
		
		int result = numverService1.add(30, 40);
		
		String nation1 = "대한민국";
		String nation2 = new String("대한민국");
		String nation3 = new String();
		
		System.out.println(nation1);
		System.out.println(nation2);
		
		System.out.println(result);
}
}
