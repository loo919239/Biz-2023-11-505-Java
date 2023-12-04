package com.callor.oop.exec;

import javax.security.auth.Subject;

public class StringA {
	
	public static void main(String[] args) {
		
		String nation = "대한민국";
		//문자열변수(nation)에 저장된 문자열 데이터의 길이
		System.out.println(nation.length());
		
		//문자열 일부를 잘라서 다른 변수에 할당하기
		String subStr = nation.substring(1,2);
		System.out.println(subStr);
		nation = "Republc of Korea";
		// 변수에 저장된 문자열을 모두 대문자로
		System.out.println(nation.toUpperCase());
		// 변수에 저장된 문자열을 모두 소문자로
		System.out.println(nation.toLowerCase());
		
		
		nation = "우리,나라,대한,민국,만세";
		// 어떤 문자열을 매개변수로 전달받아
		// nation 문자열에 저장된 데이터를 가공하고(요리하고)
		// 결과를 문자열 배열로 return 하여
		// result 문자열 배열에 할당하기
		String[] result = nation.split(",");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
