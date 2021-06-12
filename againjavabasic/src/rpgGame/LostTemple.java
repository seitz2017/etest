package rpgGame;

public class LostTemple extends Map{
	//아이템 가격
			int lockdown = 500;
			
			public int showitem(int money, int number) {
				name = "잊혀진신전";
				System.out.println("구매할 물건을 고르는 중입니다");
				if(number ==1) {
					if(lockdown <= money)
						return money - lockdown;
				}
				if(number ==2) {
					if(lockdown <= money)
						return money - lockdown*5;
				}
				//돈이 부족하거나 레벨이 낮을때
				return -1;
			}
}
