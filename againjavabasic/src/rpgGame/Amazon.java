package rpgGame;

import java.util.Scanner;

public class Amazon extends Hero implements Runnable{
	
	private boolean stop;
	//public int fire=1000;
	public Amazon() {
		this.stop = false;
	}
	
	@Override
	public void run() {
		while(!stop) {
			Hero hero = new Hero();
			Monster monster = new Monster();
			hero.attacked(monster.attack());
			//포식자의 hp 출력
			System.out.println("player의 hp: "+hero.hp);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("end");
		
	}
	
	void go(Monster mon) {
		Runnable r= new Runnable() {
			
			@Override
			public void run() {
				while(!stop) {
					Amazon amazon = new Amazon();
					//Monster monster = new Monster();
					/*
					Dragon dragon = new Dragon();
					dragon.attacked(amazon.fireing());
					//포식자의 hp 출력
					System.out.println(dragon.name + "의 hp: "+dragon.hp);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					if (mon instanceof Goblin) {
						Goblin goblin = new Goblin();
						//goblin.attacked(amazon.fireing());
						((Goblin) mon).attackedByFire(amazon.fireing());
						//포식자의 hp 출력
						System.out.println(goblin.name + "의 hp: "+((Goblin) mon).hp);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(mon instanceof Orc) {
						Orc orc = new Orc();
						//orc.attacked(amazon.fireing());
						((Orc) mon).attackedByFire(amazon.fireing());
						//포식자의 hp 출력
						System.out.println(orc.name + "의 hp: "+((Orc) mon).hp);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(mon instanceof Ogre) {
						Ogre ogre = new Ogre();
						//ogre.attacked(amazon.fireing());
						((Ogre) mon).attackedByFire(amazon.fireing());
						//포식자의 hp 출력
						System.out.println(ogre.name + "의 hp: "+((Ogre) mon).hp);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(mon instanceof Wyvern) {
						Wyvern wyvern = new Wyvern();
						//mon.attackedByFire(amazon.fireing());
						((Wyvern) mon).attackedByFire(amazon.fireing());
						//포식자의 hp 출력
						System.out.println(wyvern.name + "의 hp: "+((Wyvern) mon).hp);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(mon instanceof Dragon) {
						Dragon dragon = new Dragon();
						//dragon.attacked(amazon.fireing());
						((Dragon) mon).attackedByFire(amazon.fireing());
						//포식자의 hp 출력
						System.out.println(dragon.name + "의 hp: "+((Dragon) mon).hp);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else {
                  	  System.out.println("지원되지 않는 형입니다.");
                  	  try {
                  		Thread.sleep(2000);  
                  	  } catch (Exception e) {
						// TODO: handle exception
					}
                  	  
                    }     
					
				}
				
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
	//공격함수
			public int attack() {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. 창으로 찌르기");
				System.out.println("2. 화살 공격");
				System.out.println("공격 번호를 입력하세요");
				int number = sc.nextInt();
				
				int sum=0;
				
				if(number ==1) {
					sum += level *level * 10;
					sum += power * 10;
					sum += defense * 10;
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("창으로 찌르기");
					System.out.println("몬스터에게 데미지를" + sum + "만큼 입혔습니다.");
					return sum;
				}else if(number ==2) {
					if(mp>=2) {
						sum += level *level * 10;
						sum += power *15;
						sum += defense * 10;
						System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
						System.out.println("불화살 공격");
						System.out.println("몬스터에게 데미지를" + sum + "만큼 입혔습니다.");
						mpuse(1);
						return sum;
					}else {System.out.println("마나가 부족합니다");}
					
				}
				System.out.println("몬스터에게 데미지를" + sum + "만큼 입혔습니다. 유효한 공격을 하세요");
				return sum;
				
			}
			//공격 받는 함수
			public void attacked(int sum) {
				if(defense >= sum ) {
					if( sum >= 50) {
						hp = hp - 7;
					}else if(sum >= 40){
						hp = hp - 5;
					}else {
						hp = hp - 0;
					}
					
				}else {
					hp = hp + defense - sum;
					/*if(defense >= sum ) {
						hp = hp - 1;
					}else {
						hp = hp + defense - sum;
					}*/
					
				}
			}
			
			//공격 1회당 기초 hp 소모 
			/*public void damaged(int count) {
				hp = hp - count*2;
				System.out.println("hp 2만큼 소진");
			}*/
			
			//마나 사용 함수
			public void mpuse(int count) {
				mp = mp - count*2;
				System.out.println("mp 2만큼 소진");
			}

			//불로 지지는 효과
			public int fireing() {
				System.out.println("불화살을 맞고 몬스터가 불에 타고 있습니다.");
				System.out.println("몬스터가 입은 데미지: " + fire/10);
				return fire/10;
			}
			
			public void Stop(boolean stop) {
				this.stop=stop;
			}

}
