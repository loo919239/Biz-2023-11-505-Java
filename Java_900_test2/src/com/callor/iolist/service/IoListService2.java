package com.callor.iolist.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.dto.IoListDto;
import com.callor.iolist.dto.IolistIndex;

public class IoListService2 {
	List<IoListDto> ioList = null;
	String dataFile;

	public IoListService2() {
		ioList = new ArrayList<IoListDto>();
		dataFile = "src/com/callor/iolist/data/data.txt";
	}
	
	public void loadService() {
		Scanner fileScan = null;
		InputStream is = null;
		
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileScan = new Scanner(is);
		
		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] ioLists = line.split(",");
			
			IoListDto ioDto = new IoListDto(
					ioLists[IolistIndex.거래일자.index],
					ioLists[IolistIndex.상품명.index],
					ioLists[IolistIndex.거래처명.index],
					ioLists[IolistIndex.대표자명.index],
					ioLists[IolistIndex.구분.index],
					ioLists[IolistIndex.수량.index],
					ioLists[IolistIndex.매입단가.index],
					ioLists[IolistIndex.판매단가.index]
					);
			ioList.add(ioDto);
		}
		fileScan.close();
	}
	
	public void printService() {
		this.loadService();
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		System.out.println("-".repeat(100));
		for (IoListDto dto : ioList) {
			int number = Integer.valueOf(dto.구분);
			int number2 = Integer.valueOf(dto.매입단가);
			int number3 = Integer.valueOf(dto.판매단가);
			int number4 = Integer.valueOf(dto.수량);
			int realNumber1 = 0;
			int realNumber2 = 0;
			if(number == 1) {
				realNumber1 = number2 * number4; 
			}
			if(number == 2) {
				realNumber2 = number3 * number4; 
			}
			System.out.printf("%10s\t%15s\t%9s\t%d\t%d\n",dto.거래일자,dto.거래처명,dto.상품명,realNumber1,realNumber2);
		}
		System.out.println("=".repeat(100));
	}
}
