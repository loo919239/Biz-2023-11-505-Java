package com.callor.hello.algorithm;

public class LoopC {
	public static void main(String[] args) {

		for (int index = 0; index < 100; index++) {

			System.out.print("* ");
			int num = index % 10;
			if (num <= 0) {
				System.out.println();


			}

		}
	}
}
