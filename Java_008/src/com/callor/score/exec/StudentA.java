package com.callor.score.exec;

import com.callor.score.service.StudentService;

public class StudentA {
	public static void main(String[] args) {
		String student = "src/com/callor/score/service/student.txt";
		StudentService studentService = new StudentService(student);
		studentService.loadStudents();
		studentService.printstudents();
		
	}

}
