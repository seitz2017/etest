package rpgGame;

public class Hero extends Character{
	public int level;
	public int power;
	public static int defense;
	public int experience = 0;
	int money = 10000;
	public static int hp;
	int mp=0;
	int lockdown=0;
	public static int fire = 1000;
	
	public int attack() {
		return power;
		
	}
	
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
	
	public void damaged(int count) {
		hp = hp - count;
	}
	//아이템 사용 함수
	public void itemuse(int count) {
		lockdown = lockdown - count*5;
		System.out.println("lockdown 5만큼 소진");
	}	
	//fire 사용 함수
	public void fireuse(int temp) {
		fire = temp;
	}
}
