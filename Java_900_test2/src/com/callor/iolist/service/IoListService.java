package com.callor.iolist.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.dto.IoListDto;

public class IoListService {
	protected List<IoListDto> ioList = null;
	protected String dataFile;

	public IoListService() {
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
			
			IoListDto ioDto = new IoListDto();
			//거래일자,거래시각,상품명,거래처명,대표자명,거래구분,수량,매입단가,매출단가
			ioDto.거래일자 = ioLists[0];
			ioDto.상품명 = ioLists[2];
			ioDto.거래처명 = ioLists[3];
			ioDto.대표자명 = ioLists[4];
			ioDto.구분 = ioLists[5];
			ioDto.수량 = ioLists[6];
			ioDto.매입단가 = ioLists[7];
			ioDto.판매단가 = ioLists[8];
			ioList.add(ioDto);
		}
		fileScan.close();
	}
	
	public void printService() {
		this.loadService();
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		System.out.println("-".repeat(100));
		int sum1 = 0;
		int sum2 = 0;
		int num = 0;
		for (IoListDto dto : ioList) {
			int number1 = Integer.valueOf(dto.구분);
			int number2 = Integer.valueOf(dto.매입단가);
			int number3 = Integer.valueOf(dto.판매단가);
			int number4 = Integer.valueOf(dto.수량);
			int realNumber1 = 0;
			int realNumber2 = 0;
			if(number1 == 1) {
				realNumber1 = number2 * number4; 
			}
			if(number1 == 2) {
				realNumber2 = number3 * number4; 
			}
			System.out.printf("%10s\t%15s\t%9s\t%d\t%d\n",dto.거래일자,dto.거래처명,dto.상품명,realNumber1,realNumber2);
			num++;
			sum1 += realNumber1;
			sum2 += realNumber2;
		}
		System.out.println("-".repeat(100));
		System.out.printf("거래건수\t%d건\t%d\t%d\n",num,sum1,sum2);
		System.out.println("=".repeat(100));
	}
}
