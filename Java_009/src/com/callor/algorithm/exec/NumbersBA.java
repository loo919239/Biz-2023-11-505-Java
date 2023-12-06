package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersBA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		Line.dLine(80);
		
		int num = numService.inputNum("숫자를");
		Line.sLine(80);
		for (int i = 0; i < num; i++) {
//			System.out.printf("%3d",i);
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
		Line.dLine(80);
		
	}
}
