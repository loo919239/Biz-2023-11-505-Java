package com.guide.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.guide.dto.GuideDto;
import com.guide.service.GuideService;

public class GuideServiceImplV1 {
	List<GuideDto> guideList = null;
	String dataFile;

	public GuideServiceImplV1() {
		guideList = new ArrayList<GuideDto>();
		dataFile = "src/com/guide/txt/guide.txt";

	}

	public void loadGuide() {
		Scanner fileScan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		fileScan = new Scanner(is);

		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] guides = line.split(",");

			GuideDto gDto = new GuideDto();
			gDto.id = guides[0];
			gDto.list = guides[1];
			gDto.seq = guides[2];
			gDto.guide = guides[3];
			guideList.add(gDto);
		}
		fileScan.close();

//		for(GuideDto dto : guideList) {
//			System.out.println(dto.id);
//		}

	}


	public GuideDto serchGuide(int Id) {
		int count = 0;
		for (GuideDto dto : guideList) {
			String strId = dto.id.substring(3);
			Id = Integer.valueOf(strId);
			int Id2 = Id;
			System.out.println(Id);
			count = +1;
			if (Id == Id2) {
				Id2 = +1;
				return dto;
			}
			if (Id != Id2) {
				break;
			}
		}
		if (count == 10) {
			return null;
		}

		return null;
	}
	
	public void printGuideList() {
		System.out.println("id\t종목명\t순서\t방법");
		while (true) {
			for (GuideDto dto : guideList) {
				String strId = dto.id.substring(3);				
			}
			GuideDto guideDto = this.serchGuide();
			printGuideList(guideDto);
//			if(null) {
//				
//			}
			System.out.println("-".repeat(50));
		}
	}
	
	public void printGuideList(GuideDto dto) {
			System.out.printf("%s\t%s\t%s\t%s\n", dto.id, dto.list, dto.seq, dto.guide);
	}

}
