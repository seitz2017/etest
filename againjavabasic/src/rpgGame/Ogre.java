package rpgGame;

public class Ogre extends Monster implements Runnable{
	
	//멤버변수
	   String name = "오우거";
	   int hp=900;
	   int power=40;
	   int defense=20;
	   int experience=100;
	    //monster.speed=6;
	   int money=50;
	   private boolean stop;
		public Ogre() {
			this.stop = false;
		}
	
	   //타겟스펙
	   public void showSpec() {
		   
		   System.out.println("   타겟종류: "+name);
	       //System.out.println("   현재 레벨: " + hero.level);
	       System.out.println("   공격력: "+power);
	       System.out.println("   방어력: "+defense);
	       System.out.println("   HP: "+hp);
	       //System.out.println("   현재 MP: " + hero.mp);
	       System.out.println("   경험치: "+experience);
	       System.out.println("   보유한 돈: "+money);
	       //System.out.println("   스피드: 6");
	   }
	   
	   void go() {
			Runnable r= new Runnable() {
				
				@Override
				public void run() {
					while(!stop) {
						Hero hero = new Hero();
						Ogre oger = new Ogre();
						hero.attacked(oger.attack());
						//포식자의 hp 출력
						System.out.println("player의 hp: "+hero.hp);
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
			};
			Thread t1 = new Thread(r);
			Thread t2 = new Thread(r);

			t1.start();
			t2.start();

		}
	//공격을 하는 함수
			public int attack() {
				System.out.println("먹잇감의 반격에 데미지를" + power + "만큼 입었습니다.");
				return power;
			}
			
			//공격을 받는 함수
			public void attacked(int sum) {
				if(defense >= sum) {
					hp = hp -0;
				}else {
					hp= hp + defense - sum;
				}
			}
			//밤에 공격 받는 함수
			public void attackedNight(int sum) {
				if(defense >= sum) {
					hp = hp -0;
				}else {
					hp= hp + defense - sum;
				}
			}
			//마법공격을 받는 함수
			public void attackedByFire(int sum) {
				hp = hp -sum;
					
			}
			
			public void Stop(boolean stop) {
				this.stop=stop;
			}
}
