package rpgGame;

public class Monster extends Character implements Runnable{
	public int power;
	public int defense;
	public int experience;
	int money;
	private boolean stop;
	public int hp;
//	Character heroauto = new Hero();
//	Character monsterauto = new Monster();
	public Monster() {
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
	
	void go() {
		Runnable r= new Runnable() {
			
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
				
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.start();
		t2.start();
		t3.start();
	}
	
	public int attack() {
		System.out.println("몬스터의 반격에 데미지를" + power + "만큼 입었습니다.");
		return power;
	}
	
	public void attacked(int sum) {
		if(defense >= sum) {
			hp = hp -0;
			
		}else {
			hp = hp + defense - sum;
		}
	}
	public void Stop(boolean stop) {
		this.stop=stop;
	}

}
