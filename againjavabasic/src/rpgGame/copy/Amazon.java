package rpgGame.copy;

import java.util.Scanner;

public class Amazon extends Hero{
	//공격함수
			public int attack() {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. 창으로 찌르기");
				System.out.println("2. 불화살 공격");
				System.out.println("공격 번호를 입력하세요");
				int number = sc.nextInt();
				
				int sum=0;
				
				if(number ==1) {
					sum += level *level * 10;
					sum += power * 10;
					sum += defense * 10;
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("창으로 찌르기");
					System.out.println("먹잇감에게 데미지를" + sum + "만큼 입혔습니다.");
					return sum;
				}else if(number ==2) {
					if(mp>=2) {
						sum += level *level * 10;
						sum += power *15;
						sum += defense * 10;
						System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
						System.out.println("불화살 공격");
						System.out.println("먹잇감에게 데미지를" + sum + "만큼 입혔습니다.");
						mpuse(1);
						return sum;
					}else {System.out.println("마나가 부족합니다");}
					
				}
				System.out.println("먹잇감에게 데미지를" + sum + "만큼 입혔습니다. 유효한 공격을 하세요");
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

}
