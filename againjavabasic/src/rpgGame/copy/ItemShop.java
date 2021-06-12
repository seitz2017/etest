package rpgGame.copy;

public class ItemShop extends Map{
	//아이템 가격
		int superpower = 500;
		
		public int showitem(int money, int number) {
			name = "아이템상점";
			System.out.println("구매할 물건을 고르는 중입니다");
			if(number ==1) {
				if(superpower <= money)
					return money - superpower;
			}
			
			//돈이 부족하거나 레벨이 낮을때
			return -1;
		}
}
