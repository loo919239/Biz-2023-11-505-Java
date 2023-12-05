package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringCB {
	public static void main(String[] args) {

		String dataFile = "src/com/callor/oop/exec/data.txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(dataFile + " 파일을 찾을 수 없습니다.");
		}
		scan = new Scanner(is);

		// open 한 data.txt 파일에 대한 정보(연결)을 scanner 와
		// 연결해주기
//		while (true) {
//			if(scan.hasNext()) {
//			}}
		while (scan.hasNext()) {
			String line = scan.nextLine();
			// System.out.println(line);
			String[] scores = line.split(",");
			
			int scoreTotal = 0;
			for (int i = 1; i < scores.length; i++) {
				scoreTotal += Integer.valueOf(scores[i]); 
			}
			System.out.printf("%s 번 총점 : %d\n", scores[0],scoreTotal);
		}
		scan.close();

	}

}
