package com.callor.blackjack.exec;

import com.callor.blackjack.service.CardService;
import com.callor.blackjack.service.PlayerService;
import com.callor.blackjack.service.impl.CardServiceImplV1;
import com.callor.blackjack.service.impl.PlayerServiceImplV2;

public class ExecD {
	
	public static void main(String[] args) {
		CardService cardService = new CardServiceImplV1();
		PlayerService 딜러 = new PlayerServiceImplV2();
		PlayerService 타짜1 = new PlayerServiceImplV2("타짜1");
		PlayerService 타짜2 = new PlayerServiceImplV2("타짜2");
		
		for (int i = 0; i < 2; i++) {
			딜러.hit(cardService.getCard());
			타짜1.hit(cardService.getCard());
			타짜2.hit(cardService.getCard());
		};

		딜러.showCard();
		타짜1.showCard();
		타짜2.showCard();
		
		if(딜러.getScore() > 타짜1.getScore() && 딜러.getScore() > 타짜2.getScore()) {
			System.out.printf("딜러 승 : %d\n",딜러.getScore());
		} else if(타짜1.getScore() > 딜러.getScore() && 타짜1.getScore() > 타짜2.getScore()) {
			System.out.printf("타짜1 승 : %d\n",타짜1.getScore());
		} else if(타짜2.getScore() > 딜러.getScore() && 타짜2.getScore() > 타짜1.getScore()) {
			System.out.printf("타짜2 승 : %d\n",타짜2.getScore());
		} else {
			System.out.println("무 승부");
		}
		
		
	}
	
}
