package com.callor.student.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.callor.student.utils.Line;

public class StudentService{
	List<StudentDto> studentList = null;
	Scanner scan = null;
	String stdDataFile = null;

	public StudentService() {
		studentList = new ArrayList<StudentDto>();
		scan = new Scanner(System.in);
		stdDataFile = "src/com/callor/student/data/student.txt";

	}

	public void LoadStudent() {
		Scanner fileScan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(stdDataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fileScan = new Scanner(is);

		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] students = line.split(",");

			StudentDto stdDto = new StudentDto();
			stdDto.num = students[0];
			stdDto.name = students[1];
			stdDto.dept = students[2];
			stdDto.grade = students[3];
			stdDto.tel = students[4];
			stdDto.addr = students[5];
			studentList.add(stdDto);
		}
		fileScan.close();

	}

	public void studentPrint() {
		this.LoadStudent();
		while (true) {
			StudentDto stdDto = new StudentDto();
			Line.dLine(50);
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
			Line.sLine(50);
			System.out.print("이름 >>");
			String str = scan.nextLine();

			if (str.equals("QUIT")) {
				System.out.println("학생찾기를 종료합니다");
				break;
			}
			int index = 0;
				for (StudentDto dto : studentList) {
					if(str.equals(dto.name)) {
						break;
					}
					index ++;
				}
				StudentDto dto = new StudentDto();
			for (int i = 0; i < index; i++) {
				System.out.printf("이름 : %s\n", dto.name);
				System.out.printf("학과 : %s\n", dto.dept);
				System.out.printf("학년 : %s\n", dto.grade);
				System.out.printf("주소 : %s\n", dto.addr);
				System.out.printf("전화번호 : %s\n", dto.tel);
				break;
			}
			
//			for (StudentDto dto : studentList) {
//				if (str.equals(dto.name)) {
//					System.out.printf("이름 : %s\n", dto.name);
//					System.out.printf("학과 : %s\n", dto.dept);
//					System.out.printf("학년 : %s\n", dto.grade);
//					System.out.printf("주소 : %s\n", dto.addr);
//					System.out.printf("전화번호 : %s\n", dto.tel);
//					break;
//				} else {
//					Line.dLine(50);
//					System.out.println(str + "자료는 없습니다");
//					Line.dLine(50);
//					break;
//				}
//			}

		} // end While
	}

}
