package rpgGame.copy;

public class Ogre extends Monster{
	//공격을 하는 함수
			public int attack() {
				System.out.println("먹잇감의 반격에 데미지를\" + power + \"만큼 입었습니다.");
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
}
