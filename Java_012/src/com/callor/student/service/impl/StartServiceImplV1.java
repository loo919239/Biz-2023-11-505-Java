package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StartServiceImplV1 implements StartService {

	protected Scanner scan = null;
	protected StudentService stService = null;
	
	public StartServiceImplV1() {
		scan = new Scanner(System.in);
		stService = new StudentServiceImplV1();
	}
	
	
	@Override
	public void mainMenu() {
		Line.dLine(100);
		System.out.println("한울고교 학사관리");
		Line.dLine(100);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(100);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(100);
	}
	
	@Override
	public Integer selectMenu() {
		
		while (true) {
			this.mainMenu();
			System.out.print("업무 선택 >> ");
			String strMenuId = scan.nextLine();
			if (strMenuId.equals("QUIT")) {
				System.out.println("업무종료");
				return null;
			}
			int intMenuId;
			try {
				intMenuId = Integer.valueOf(strMenuId);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			if(intMenuId > 3 || intMenuId < 1) {
				System.out.println("업무 선택은 1 ~ 3까지 입니다");
				continue;
			}
			return intMenuId;
		}
	}
	
	@Override
	public void startApp() {
		while (true) {
			Integer menuId = this.selectMenu();
			if (menuId == null) {
				break;
			}
		}
		
	}
}
