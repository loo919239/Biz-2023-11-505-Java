package com.callor.stdent.service;

import java.util.Scanner;

import com.callor.stdent.utils.Line;

public class StartServiceA {
	private StudentServiecV3 stService = null;
	private String[] menuItems = null;
	Scanner scan = null;

	public StartServiceA() {
		stService = new StudentServiecV3();
		scan = new Scanner(System.in);
		menuItems = new String[] {
				"1. 학생정보 입력",
				"2. 학생정보 가져오기",
				"3. 학생정보 조회",
				"4. 학생정보 출력"
				};
	}

	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	} // end mainMenu()

	public int selectMenu() {
		while (true) {
			this.mainMenu();
			System.out.print("업무 선택 >> ");
			String strMenuId = scan.nextLine();
//			if (str.equals("1")) return 1;
//			else if (str.equals("2")) return 2;
//			else if (str.equals("3")) return 3;
//			else if (str.equals("QUIT")) {
//				System.out.println("업무종료");
//				break;
//			}
//			else {
//				System.out.println("1 ~ 3의 숫자를 입력해 주세요.");
//				continue;
//			}

			for (String item : menuItems) {
				System.out.println(item);
			}
			if (strMenuId.equals("QUIT")) {
				System.out.println("업무종료");
				return -1;
			}
			int intMenuId = 0;
			try {
				intMenuId = Integer.valueOf(strMenuId);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요.");
				continue;
			}
			if (intMenuId > menuItems.length || intMenuId < 1) {
				System.out.printf("업무 선택은 1~%d 까지입니다\n", menuItems.length);
				continue;
			}
			// 여기에 코드가 다다르면
			// 정상적인 업무를 선택 했다는 것
			return intMenuId;
		} // end While
	}

	public void startApp() {
		while (true) {
			int menuId = this.selectMenu();
			if (menuId == -1) {
				break;
			} else if (menuId == 1) {
				stService.inputStudents();
			} else if (menuId == 2) {
				stService.loadSudent();
			} else if (menuId == 4) {
				stService.printStudent();
			}
		}
	}
}
