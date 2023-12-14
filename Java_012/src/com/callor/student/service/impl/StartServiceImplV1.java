package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StartServiceImplV1 implements StartService {

	protected Scanner scan = null;
	protected StudentService stService = null;
	
	/*
	 * StartService 에서 StudentService 를 필수로 필요한다
	 * StartService 클래스의 기능을 추가하는 코드가 계속 만들어질 경우
	 * 또한 StudentServoce 클래스의 기능을 추가하는 코드가 계속 만들어질 경우
	 * 
	 * StartServiceV1, StartServiceV2 .. 등으로 파일이 생성되고
	 * StudentServiceV1, StudentServiceV2 .. 등으로 파일이 생성되고 있다
	 * 
	 * 이 두개의 파일이 서로 연동되어 코드가 진행된다
	 * 
	 * 이 상황에서 어떤 StartService 와 어떤 StudentService 를
	 * 연결할 것인지 항상 고민해야 하고,
	 * 필요에 따라 StartService 코드를 변경해야 한다
	 * 
	 * 이러한 상황을 StartService 와 StudentService 간에
	 * 결합도가 높다 라고 한다
	 * 
	 * 그래서 StartService 의 생성자를 통하여
	 * StudentService 의 객체를 주입받은(Inject) 코드로
	 * 생성자를 변경하였다
	 * 
	 */
	public StartServiceImplV1(StudentService stService) {
		scan = new Scanner(System.in);
		this.stService = stService;
		
//		stService = new StudentServiceImplV1();
	}
	
	
	@Override
	public void mainMenu() {
		
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
