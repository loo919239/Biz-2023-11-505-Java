package com.callor.stdent.exec;

import com.callor.stdent.service.StudentServiecV3;

public class StudentExecC {
	public static void main(String[] args) {
		StudentServiecV3 stService = new StudentServiecV3();
		stService.inputStudent();
		stService.printStudent();
	}

}
