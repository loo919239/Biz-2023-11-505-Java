package com.callor.stdent.exec;

import com.callor.stdent.service.StudentServiecV3;

public class StudentExecB {
	public static void main(String[] args) {
		StudentServiecV3 studentService = new StudentServiecV3();
		studentService.inputStudents();
		studentService.printStudent();
	}

}
