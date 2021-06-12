package rpgGame;

public class Store extends Map{
	//물품 가격
		int powerPotion = 100;
		int defensePotion = 100;
		int hpPotion = 10;
		int mpPotion = 10;
		int hpPotionBig = 50;
		int mpPotionBig = 50;
		
		public int show(int money, int number, int hp, int level) {
			name = "상점";
			System.out.println("구매할 물건을 고르는 중입니다");
			if(number ==1) {
				if(powerPotion <= money)
					return money - powerPotion;
			}
			if(number ==2) {
				if(defensePotion <= money)
					return money - defensePotion;
			}
			if(number ==3) {
				if(hpPotion <= money && hp+10 <= 100*level) {
					System.out.println("11111111111111111");
					return money - hpPotion;
				}else if(hpPotion <= money && hp < 100*level && 100*level < hp+10 ){
					System.out.println("222222222222222222222222");
					return money -hpPotion;
				}else if(hpPotion <= money && hp >= 100*level) { 
					System.out.println("333333333333333333333333");
					//System.out.println(money-hpPotion);
					//money = -2;
					return money -hpPotion; //이미 full hp일떄
					
				}
					
			}
			if(number ==4) {
				if(mpPotion <= money)
					return money - mpPotion;
			}
			if(number ==5) {
				if(hpPotionBig <= money && hp+50 <= 100*level) {
					return money - hpPotionBig;
				}else if(hpPotionBig <= money && hp < 100*level && 100*level < hp+50 ){
					return money -hpPotionBig;
				}else if(hpPotionBig <= money && hp == 100*level) { 
					return -2; //이미 full hp일떄
				}
					
			}
			if(number ==6) {
				if(mpPotionBig <= money)
					return money - mpPotionBig;
			}
			//돈이 부족할떄
			return -1;
		}
}
