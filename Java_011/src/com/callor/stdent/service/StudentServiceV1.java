package com.callor.stdent.service;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.stdent.models.StudentDto;
import com.callor.stdent.utils.Line;

public class StudentServiceV1 {
	private Scanner scan = null;
	List<StudentDto> students = null;

	public StudentServiceV1() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
	}

	public boolean inputStudent() {

		StudentDto studentDto = new StudentDto();

		System.out.print("학번을 입력하세요 >> ");
		String stdNum = scan.nextLine();
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).num.equals(stdNum)) {
				System.out.println("학번 중복. 다시 입력해 주세요");
				return false;
			}
		}
		System.out.print("이름을 입력하세요 >> ");
		String stdName = scan.nextLine();
		System.out.print("학과를 입력하세요 >> ");
		String stdDept = scan.nextLine();
		System.out.print("학년을 입력하세요 >> ");
		String stdGrade = scan.nextLine();
		System.out.print("전화번호를 입력하세요 >> ");
		String stdTel = scan.nextLine();
		System.out.print("주소를 입력하세요 >> ");
		String stdAddr = scan.nextLine();

		studentDto.num = stdNum;
		studentDto.name = stdName;
		studentDto.dept = stdDept;
		studentDto.grade = stdGrade;
		studentDto.tel = stdTel;
		studentDto.addr = stdAddr;

		students.add(studentDto);

		return true;

	}

	public void inputStudents() {
		StudentDto studentDto = new StudentDto();
		boolean result = true;
		while (result) {
			inputStudent();
			}


	}

	public void printStudent() {
		Line.dLine(100);
		System.out.println("");
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		Line.sLine(100);
	}
}
