package rpgGame;

public class Inventory {
	public int inventory_show(int[] cnt) { //인벤토리 보여주기
		int sum=0;
		   for(int i=0; i<7;i++) {
			   sum+=cnt[i];
		   }
		   System.out.println("");
		   
		   System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		   System.out.println("");
		   
		   if(sum==0) {
			   System.out.println("	    보유한 물품이 없습니다.");
			   System.out.println("	    물품 구매 후 인벤토리창에 추가하세요");
			   System.out.println("");
			   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			   System.out.println("");
		   }
		   else {
			   if(cnt[0]>0) {
				   System.out.println("      1. 불화살");
				   System.out.println("                     기능 : fire를 1000 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[0]);
				   System.out.println("");
			   }
			   if(cnt[1]>0) {
				   System.out.println("      2. 공격무기 강화템");
				   System.out.println("                     기능 : 공격력을 30 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[1]);
				   System.out.println("");
			   }
			   if(cnt[2]>0) {
				   System.out.println("      3. 갑옷");
				   System.out.println("                     기능 : 방어력 20 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[2]);
				   System.out.println("");
			   }
			   if(cnt[3]>0) {
				   System.out.println("      4. hp");
				   System.out.println("                     기능 : 체력을 10 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[3]);
				   System.out.println("");
			   }
			   if(cnt[4]>0) {
				   System.out.println("      5. mp");
				   System.out.println("                     기능 : 마나를 20 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[4]);
				   System.out.println("");
			   }
			   if(cnt[5]>0) {
				   System.out.println("      6. 불화살");
				   System.out.println("                     기능 : fire를 5000 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[5]);
				   System.out.println("");
			   }
/*			   if(cnt[6]>0) {
				   System.out.println("      7. 핑크젤리");
				   System.out.println("                     기능 : 방어력을 20 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[6]);
				   System.out.println("");
			   }*/
			   
			   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			   System.out.println("");
		   }
		   return sum;
	}
	
	public int inventory_use_magic(int number, int[] cnt, int fire) throws InterruptedException {//아이템 사용(fire)
		
		   if(number==1) {
			   System.out.println("");
			   System.out.println("[ 불화살 ] 을 장착하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("fire 보유량을 1000만큼 증가시킵니다.\n\n\n");
			//   Music acheive1 = new Music("acheive.mp3",false);  // 버튼 클릭
			//   acheive1.start();
			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[0]-=1;
			   fire += 1000;
		   }
/*		   else if(number==2) {
			   System.out.println("");
			   System.out.println("[ 맛있는 츄르 ] 를 사용하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("hp를 20 증가시킵니다.\n\n\n\n\n\n\n\n");
			//   Music acheive2 = new Music("acheive.mp3",false);  // 버튼 클릭
			//   acheive2.start();
			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[1]-=1;
			   hp += 20;
		   }
		   else if(number==3) {
			   System.out.println("");
			   System.out.println("[ 영롱한 참치캔 ] 을 사용하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("hp를 30 증가시킵니다.\n\n\n\n\n\n\n\n");
			//   Music acheive3 = new Music("acheive.mp3",false);  // 버튼 클릭
			//    acheive3.start();
			    Thread.sleep(2000);
			    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[2]-=1;
			   hp += 30;
	   }*/	
	System.out.println("fire 보유량" +fire+"만큼 증가");	   
	return fire;
			   
	}
	
	public int inventory_use_power(int number, int[] cnt, int power) throws InterruptedException { // 아이템 사용(체력)
		
		if(number==2) {
			   System.out.println("");
			   System.out.println("[ 공격무기 강화템 ] 을 장착하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("공격력이 30만큼 증가시킵니다.\n\n\n");
			//   Music acheive1 = new Music("acheive.mp3",false);  // 버튼 클릭
			//   acheive1.start();
			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[1]-=1;
			   power += 30;
		   }
	  /* else if(number==5) {
		   System.out.println("");
		   System.out.println("[ 날카로운 이 ] 를 사용하였습니다.\n");
		   Thread.sleep(1000);
		   System.out.println("파워를 20 증가시킵니다.\n\n\n\n\n\n\n\n\n");
		 //  Music acheive5 = new Music("acheive.mp3",false);  // 버튼 클릭
		 //  acheive5.start();
		   Thread.sleep(2000);
		   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		   cnt[4]-=1;
		   power += 20;
	   }*/
		System.out.println("공격력" +power+"만큼 증가");
		return power;
	}
	
	public int inventory_use_defense(int number, int[] cnt, int defense) throws InterruptedException { // 아이템 사용(체력)
		
		if(number==3) {
			   System.out.println("");
			   System.out.println("[ 갑옷 ] 을 장착하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("방어력이 20만큼 증가시킵니다.\n\n\n");
			//   Music acheive1 = new Music("acheive.mp3",false);  // 버튼 클릭
			//   acheive1.start();
			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[2]-=1;
			   defense += 30;
		   }
	  /* else if(number==7) {
		   System.out.println("");
		   System.out.println("[ 핑크젤리 ] 를 사용하였습니다.\n");
		   Thread.sleep(1000);
		   System.out.println("방어력을 20 증가시킵니다.\n\n\n\n\n\n\n\n");
		  // Music acheive7 = new Music("acheive.mp3",false);  // 버튼 클릭
		  // acheive7.start();
		   Thread.sleep(2000);
		   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		   cnt[4]-=1;
		   defense += 20;
	   }*/
		System.out.println("방어력" +defense+"만큼 증가");
		return defense;
	}
	public int inventory_use_hpPotion(int number, int[] cnt, int hp) throws InterruptedException { // 아이템 사용(체력)
		
		if(number==4) {
			   System.out.println("");
			   System.out.println("[ 갑옷 ] 을 장착하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("방어력이 20만큼 증가시킵니다.\n\n\n");

			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n");

			   cnt[3]-=1;
			   hp += 100;
		   }

		System.out.println("방어력" +hp+"만큼 증가");
		return hp;
	}
	public int inventory_use_mpPotion(int number, int[] cnt, int mp) throws InterruptedException { // 아이템 사용(체력)
		
		if(number==5) {
			   System.out.println("");
			   System.out.println("[ 갑옷 ] 을 장착하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("방어력이 20만큼 증가시킵니다.\n\n\n");

			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n");

			   cnt[4]-=1;
			   mp += 100;
		   }

		System.out.println("방어력" +mp+"만큼 증가");
		return mp;
	}
	public int inventory_use_magicBig(int number, int[] cnt, int fire) throws InterruptedException {//아이템 사용(fire)
		
		   if(number==6) {
			   System.out.println("");
			   System.out.println("[ 불화살 ] 을 장착하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("fire 보유량을 5000만큼 증가시킵니다.\n\n\n");

			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n");

			   cnt[5]-=1;
			   fire += (1000*5);
		   }

	System.out.println("fire 보유량" +fire*5+"만큼 증가");	   
	return fire;
			   
	}

}
