package rpgGame;

public class WeaponStore extends Map{
	//무기상점
	int fire = 1000; // 불화살 가격
	 int power = 300; // hp 가격
	 int defense = 200; // mp 가격
	 int hp = 100; // hp 가격
	 int mp = 100; // mp 가격
//	 int look = 10; // 장화신은 고양이 눈빛
//	 int pink =20; // 핑크젤리
			
	 public void show() { // 메뉴 보여주기
		 
		 	System.out.println("");
		    System.out.println("━━━━━━━━━━━━━━ MagicItem ━━━━━━━━━━━━━━");
		    System.out.println("");
		    System.out.println("       1. 불화살(가격: "+fire+" 디버프 효과: 몬스터가 불에 타는 동안 지속적으로 데미지 입힘) ");
		    //System.out.println("       2. 마법의칼(20원) ");
		    System.out.println("");
		    System.out.println("━━━━━━━━━━━━━━ 공방업그레이드 아이템  ━━━━━━━━━━━━━━");
		    System.out.println("");
		    System.out.println("       2. 공격무기 강화템(가격: "+power+" 공격력 +30) ");
		    System.out.println("       3. 갑옷(가격: "+defense+" 방어력 +20) ");
		    System.out.println("");
		    System.out.println("━━━━━━━━━━━━━ potion(hp, mp)  ━━━━━━━━━━━━━━");
		    System.out.println("");
		    System.out.println("       4. hp(가격: "+hp+") 체력회복: +100");
		    System.out.println("       5. mp(가격: "+mp+") 마나회복: +100");
//		    System.out.println("       6. 강화창 (200원)");
		    System.out.println("━━━━━━━━━━━━━━ MagicItemBig(대용량) ━━━━━━━━━━━━━━");
		    System.out.println("");
		    System.out.println("       6. 불화살(가격: "+fire+" 디버프 효과: 몬스터가 불에 타는 동안 지속적으로 데미지 입힘) ");
		    System.out.println("");
		    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		    System.out.print("원하시는 물건 번호를 입력하세요 (0. 돌아가기) : ");
		    System.out.println("");
	 }
	 
	 public int purchase(int money, int number) { // 포인트 계산 
		  System.out.println("무기 상점에서 물건을 구매 시도하는 중입니다.");
		  if(number == 1)
		  {
		   // fire 가격보다 돈이 더 많을 때
		   if(fire <= money)
		    return money - fire;
		  }
		  if(number == 2)
		  {
		  // 공방업그레이드 아이템 가격보다 돈이 더 많을 때
		   if(power <= money)
		    return money - power;
		  }
		  if(number == 3)
		  {
		   // 갑옷 가격보다 돈이 더 많을 때
		   if(defense <= money)
		    return money - defense;
		  }
		  if(number == 4)
		  {
		   // hp가격 보다 돈이 더 많을 때
		   if(hp <= money)
		    return money - hp;
		  }
		  if(number == 5)
		  {
		   // mp가격 보다 돈이 더 많을 때
		   if(mp <= money)
		    return money - mp;
		  }
		  if(number == 6)
		  {
		   // fire(대용량) 가격보다 돈이 더 많을 때
		   if(fire <= money)
		    return money - fire*5;
		  }
/*		  if(number == 7)
		  {
		   // 핑크젤리보다 돈이 더 많을 때
		   if(teeth <= money)
		    return money - teeth;
		  }
*/		  	// 돈이 부족할 때
		  	return -1;
		 }

		/*	public int showitem(int money, int number) {
				name = "무기상점";
				System.out.println("구매할 물건을 고르는 중입니다");
				if(number ==1) {
					if(superpower <= money)
						return money - superpower;
				}
				
				//돈이 부족하거나 레벨이 낮을때
				return -1;
			}*/
}
