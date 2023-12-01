package com.callor.number;

import java.util.Scanner;
public class KeyBoardC__Java_OneDay_NumberQUIZ_002 {
	public static void sub() {
//		Scanner scan = new Scanner(System.in);
//		int rndNum = (int) (Math.random() * 50) + 1;
//		int count = 0;
//		boolean test = true;
//
//		System.out.println("=".repeat(50));
//		System.out.println("뤼팡의 황금열쇠를 찾아라");
//		System.out.println("=".repeat(50));
//		System.out.println("1 ~ 50까지의 숫자중 황금열쇠를 입력하세요.");
//		while (test) {
//
//			System.out.print("황금열쇠 >> ");
//			String str = scan.nextLine();
//			int num = 0;
//
//			try {
//				num = Integer.valueOf(str);
//			} catch (Exception e) {
//				System.out.println("정수를 정확히 입력해 주세요");
//				System.out.printf("입력한 값 : (%s)\n", str);
//				System.out.println("-".repeat(50));
//				continue;
//			}
//			if (num < 1 || num > 50) {
//				System.out.println("1~ 50 범위의 정수를 입력하세요.");
//				System.out.println("-".repeat(50));
//				continue;
//			}
//			if (num == rndNum) {
//				++count;
//				System.out.printf("참 잘했어요 : %d\n", num);
//				System.out.println(count + "번만에 찾았습니다.");
//				System.out.println("-".repeat(50));
//				break;
//			} else if (num > rndNum) {
//				++count;
//				System.out.println("입력한 값이 너무 커요.");
//				System.out.println("-".repeat(50));
//			} else if (num < rndNum) {
//				++count;
//				System.out.println("입력한 값이 너무 작아요.");
//				System.out.println("-".repeat(50));
//			}
//
//			if (count >= 5) {
//				System.out.println("GAME OVER!");
//				System.out.println(count + "번 시도했으나");
//				System.out.println("황금열쇠 찾기에 실패했습니다.");
//				System.out.println("황금열쇠 : " + rndNum);
//				System.out.println("-".repeat(50));
//				System.out.println("게임을 다시 시작할까요?");
//				System.out.println("다시 하려면 '재시작' 게임을 그만하려면 '종료' ");
//				System.out.print("입력 >> ");
//				test = false;
//			}
//		} // end while
//		while (test) {
//			String str = scan.nextLine();
//			if (str.equalsIgnoreCase("재시작")) {
//				System.out.println("게임을 다시 시작합니다!");
//				return;
//			} else if (str.equalsIgnoreCase("종료")) {
//				System.out.println("게임을 종료합니다");
//				return;
//			}
//		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 50) + 1;
		int count = 0;
		boolean test = true;
		
		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		System.out.println("=".repeat(50));
		System.out.println("1 ~ 50까지의 숫자중 황금열쇠를 입력하세요.");
		while (test) {
			System.out.print("황금열쇠 >> ");
			String str = scan.nextLine();
			int num = 0;
			
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				System.out.println("-".repeat(50));
				continue;
			}
			if (num < 1 || num > 50) {
				System.out.println("1~ 50 범위의 정수를 입력하세요.");
				System.out.println("-".repeat(50));
				continue;
			}
			while (test) {
				++count;
				if (num < rndNum) {
					System.out.println("입력한 값이 너무 작아요.");
					System.out.println("-".repeat(50));
				} else if (num > rndNum) {
					System.out.println("입력한 값이 너무 커요.");
					System.out.println("-".repeat(50));
				} else {
					break;
				}
				if (num == rndNum) {
					System.out.printf("참 잘했어요 : %d\n", num);
					System.out.println(count + "번만에 찾았습니다.");
					System.out.println("-".repeat(50));
				}
				if (count >= 5) {
					System.out.println("GAME OVER!");
					System.out.println(count + "번 시도했으나");
					System.out.println("황금열쇠 찾기에 실패했습니다.");
					System.out.println("황금열쇠 : " + rndNum);
					System.out.println("-".repeat(50));
					System.out.println("게임을 다시 시작할까요?");
					System.out.println("다시 하려면 '재시작' 게임을 그만하려면 '종료' ");
					System.out.print("입력 >> ");
					test = false;
				}
				
				if (str.equalsIgnoreCase("재시작")) {
					count = 0;
					System.out.println("게임을 다시 시작합니다!");
					continue;
				} else if (str.equalsIgnoreCase("종료")) {
					System.out.println("게임을 종료합니다");
					return;
				} else {
					count = 0;
					System.out.println("잘못된 입력입니다.");
				}
			}
		}
		
	}// end main
}
