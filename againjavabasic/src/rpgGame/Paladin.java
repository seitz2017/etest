package rpgGame;

import java.util.Scanner;

public class Paladin extends Hero{
	//공격함수
		public int attack() {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 검으로 베기");
			System.out.println("2. 검으로 찌르기");
			System.out.println("공격 옵션을 선택하세요");
			int number = sc.nextInt();
			
			int sum=0;
			//int mp=0;

			
			if(number ==1) {
				sum += 5 * 5 * 10;
				sum += power * 15;
				sum += defense  * 10;
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("검으로 베기");
				System.out.println("몬스터에게 데미지를" + sum + "만큼 입혔습니다.");
				return sum;
			}else if(number ==2) {
				if(mp >=5) {
					sum += 5 * 5 * 10;
					sum += power * 20;
					sum += defense  * 10;
					//mp -= 10;
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("검으로 찌르기");
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
			hp = hp - count*5;
			System.out.println("hp 5만큼 소진");
		}*/
		
		//마나 사용 함수
		public void mpuse(int count) {
			mp = mp - count*5;
			System.out.println("mp 5만큼 소진");
		}
}
