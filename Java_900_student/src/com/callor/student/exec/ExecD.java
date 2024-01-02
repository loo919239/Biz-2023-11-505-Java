package com.callor.student.exec;

import com.callor.student.model.StudentServiceA;
import com.callor.student.service.impl.StudentServiceImplV2;

public class ExecD {
	
	public static void main(String[] args) {
		String stdFile = "src/com/callor/student/data/student.csv";
		StudentServiceA stdService2 = new StudentServiceImplV2(stdFile);
//		StudentServiceA stdService2 = new 
		stdService2.loadStudnet();
		stdService2.inputStudnet();
	}

}
