package com.callor.student.exec;

import com.callor.student.model.StudentServiceA;
import com.callor.student.service.impl.StudentServiceImplV1;

public class ExecC {
	public static void main(String[] args) {
		String stdFile = "src/com/callor/student/data/student.csv";
		StudentServiceA stdService = new StudentServiceImplV1(stdFile);
		stdService.loadStudnet();
		stdService.inputStudnet();
		
	}

}
