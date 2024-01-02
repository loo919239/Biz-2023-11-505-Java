package com.guide.exec;

import com.guide.service.GuideService;
import com.guide.service.impl.GuideServiceImplV2;

public class GuiceExec {
	public static void main(String[] args) {
		GuideService guidService = new GuideServiceImplV2();
//		guidService.loadGuide();
		guidService.printGuideList();
	}

}
