package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringC {
	public static void main(String[] args) {
		
		
		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;
		
		// * 반드시 묶어줘야 *
		/*
		 *  ...data.txt 파일을 읽어서 무언가 처리를 하려고 한다.
		 * Java 에서 파일을 읽어서 무언가 처리를 하려면
		 * 먼저 파일을 open 해야 한다
		 * 이때 파일을 open 하는 도구 중에 FileInputStream 이라는
		 * 도구를 사용할 것이다.
		 * 
		 * 그런데, 파일을 open 하는 과정에서 어떠한 이유로든지
		 * open 하고자 하는 파일이 없ㅇ르 수 있다. 갑자기 사라질수도 있다.
		 * 때문에 java 에서는 파일을 open 하는 명령(도구)를 사용하는
		 * 코드에서는 반드시 try...catch 를 사용하여
		 * exception 예방을 하고 있다.
		 */
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//open 한 data.txt 파일에 대한 정보(연결)을 scanner 와
		// 연결해주기
		String line = "";
		
		scan = new Scanner(is); 
		while (scan.hasNext()) {
			line = scan.nextLine();
			String subStr = line.substring(5);
			String[] lines = subStr.split(",");
			for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
			
		}
		}
		scan.close();
		
	}

}
