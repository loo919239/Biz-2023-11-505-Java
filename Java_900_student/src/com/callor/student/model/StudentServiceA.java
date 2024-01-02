package com.callor.student.model;

import com.callor.student.service.StudentDto;

/*
 * ## 구현한 기능
* 1. 파일에서 학생정보를 Read 하여 메모리에 저장하기
* 2. 키보다를 통하여 학생이름 입력받기
* 3. 입력받은 학생이름을 학생리스트에서 검색하기
* 4. 검색된 학생정보를 화면에 보여주기 
 */

public interface StudentServiceA {
	
	public void loadStudnet();
	public void inputStudnet();
	
	// 학생이름을 매개변수로 전달받아 학생정보 검색하기
	// 검색된 학생정보를 Dto에 담아 return하기
	public StudentDto searchStudnet(String name);
	
	// 학생정보를 매개변수로 전달받아 화면에 출력하기
	public void printStudnet(StudentDto stdDto);
	
}
