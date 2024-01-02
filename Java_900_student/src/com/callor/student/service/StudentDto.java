package com.callor.student.service;
/*
 * 학번 
 * 학생이름 
 * 학과 
 * 학년 
 * 전화번호 
 * 주소
 */
public class StudentDto extends Object{
	public String num;
	public String name;
	public String dept;
	public String grade;
	public String addr;
	public String tel;
	
	// 기본생성자
	public StudentDto() {
		
	}
	/*
	// 필드 생성자(임의생성자)
	 * studentDto 클래스를 사용하여 객체를 생성할때
	 * 모든 맴버변수 값을 모두 주입하여 값이 채워진채로 객체를 
	 * 만들때 사용하는 생성자
	 */
/**
 * 
 * @param num학번
 * @param name이름
 * @param dept학과
 * @param grade학년
 * @param tel전화번호
 * @param addr주소
 */
	public StudentDto(String num, String name, String dept, String grade, String addr, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
		this.tel = tel;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "StudentDto [num=" + num + ", name=" + name + ", dept=" + dept + ", grade=" + grade + ", addr=" + addr
				+ ", tel=" + tel + "]";
	}
	
	
}
