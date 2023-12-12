package com.callor.stdent.exec;

import com.callor.stdent.service.StartServiceA;

public class MainA {
	public static void main(String[] args) {
		StartServiceA startService = new StartServiceA();
		startService.selectMenu();
		startService.startApp();
	}

}
