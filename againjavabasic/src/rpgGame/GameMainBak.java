package rpgGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMainBak {

   public static void main(String[] args) throws InterruptedException{
      Scanner sc = new Scanner(System.in);
      Hero hero = new Hero();
      //인벤토리 생성(크기=7)
      Inventory inventory = new Inventory();
      int [] cnt= {0,0,0,0,0,0,0};
      // 기본 세팅
      System.out.println("*************RPG게임 (드래곤 사냥하기) *****************");
      String s = "중세 유럽! 마을사람들을 위협하는 몬스터들을 소탕하기 위해 원정을 떠난다.\n\n"
            + "레벨5가 되면 드래곤 서식지에 입장이 가능하며 몬스터들의 우두머리인 드래곤을 제거하면 게임성공!\n\n"
            + "몬스터를 사냥하여 경험치를 얻어서 레벨업을 할 수 있으며\n\n"
            + "난이도가 높은 몬스터를 사냥할수록 더 많은 경험치와 돈을 얻게 된다. \n\n"
            + "레벨업 기준은 현재 레벨에 경험치100을 곱한값이며 \n\n"
            + "레벨업을 할때마다 돈과 총공격력이 레벨에 비례하여 증가한다.\n\n"
            + "단 낮과 밤에 몬스터 사냥 난이도가 다름.\n\n"
            + "1. 팔라딘(사를마뉴 궁정의 가장 뛰어난 검객)   2. 아마존 (창과 활을 자유자재로 부리는 여전사 )\n\n"
            + "원하는 캐릭터 번호를 입력하세요\n\n";
      for(int i =0; i < s.length(); i++) {
         Thread.sleep(10);
         System.out.print(s.charAt(i));
         
      }
      System.out.println("1.팔라딘");
      System.out.println("2.아마존");
      //System.out.println("원하는 캐릭터 번호를 입력하세요");
      int number = sc.nextInt();
      
      //팔라딘이 선택된 경우
            if(number == 1) {
               System.out.println("팔라딘을 선택하였습니다");
               
               hero = new Paladin();
               hero.name="팔라딘";
               hero.defense=25;
               hero.power=15;
               hero.level=5;
               hero.hp=10000;
               //hero.mp=100;
               //hero.speed = 5;
               
            }else if(number == 2) {
               System.out.println("아마존을 선택하였습니다");
               
               hero = new Amazon();
               hero.name="아마존";
               hero.defense=25;
               hero.power=15;
               hero.level=5;
               hero.hp=10000;
               
               //hero.speed = 8;
            }
            /*System.out.println("선택한 캐릭터의 이름을 입력하세요");
            hero.name=sc.next();
            System.out.println("이름이 입력되었습니다");*/
            System.out.println("캐릭터를 생성합니다.\n");
            s ="██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n";
         
            for(int i =0; i< s.length(); i++) {
               Thread.sleep(10);
               System.out.print(s.charAt(i));
            }
            System.out.println("게임을 시작합니다");
            ThreadTimerEx timer = new ThreadTimerEx();
            Random random = new Random();
            while(timer.day() < 10) {
               
               
                  Loop1: while( (timer.day()) < 10) {
                     if(timer.day() == 10) {
                        System.out.println();
                        System.out.println("\n\n\n");
                        System.out.println("10일이 지났습니다.\n\n");
                        Thread.sleep(1000);
                        System.out.println("미션 실패..\n\n");
                        Thread.sleep(1000);
                        System.out.println("마을이 파괴되었습니다.\n\n");
                        Thread.sleep(1000);
                        //text.show_end();
                        System.exit(0);
                     }
                     if(hero.hp<=0) {
                        System.out.println("게임 종료! 사망하였습니다.");
                        System.exit(0);
                        //break;
                     }
                     if(hero.experience >= hero.level * 100) {
                        hero.level ++;
                        hero.money += hero.level * 50;
                        //hero.hp += 10;
                        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                        System.out.println("레벨이 " + hero.level + "로 올랐습니다.");
                        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                        //System.out.println("레벨업 하여 hp가 +10 증가합니다.");
                        hero.experience=0;
                        if(hero.level == 5) {
                           System.out.println("   ______   ______   .__   __.   _______ .______        ___      .___________. __    __   __           ___      .___________. __    ______   .__   __.      _______.");
                           System.out.println("  /      | /  __  \\  |  \\ |  |  /  _____||   _  \\      /   \\     |           ||  |  |  | |  |         /   \\     |           ||  |  /  __  \\  |  \\ |  |     /       |");
                           System.out.println(" |  ,----'|  |  |  | |   \\|  | |  |  __  |  |_)  |    /  ^  \\    `---|  |----`|  |  |  | |  |        /  ^  \\    `---|  |----`|  | |  |  |  | |   \\|  |    |   (----`");
                           System.out.println(" |  |     |  |  |  | |  . `  | |  | |_ | |      /    /  /_\\  \\       |  |     |  |  |  | |  |       /  /_\\  \\       |  |     |  | |  |  |  | |  . `  |     \\   \\    ");
                           System.out.println(" |  `----.|  `--'  | |  |\\   | |  |__| | |  |\\  \\.  /  _____  \\      |  |     |  `--'  | |  `----. /  _____  \\      |  |     |  | |  `--'  | |  |\\   | .----)   |   ");
                           System.out.println("  \\______| \\______/  |__| \\__|  \\______| | _| `. _|/__/     \\__\\     |__|      \\______/  |_______|/__/     \\__\\     |__|     |__|  \\______/  |__| \\__| |_______/    ");
                           System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                           System.out.println("            아이템 상점과 드래곤 서식지 입장 가능                                        ");
                           System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                           //System.out.println("아이템 상점과 드래곤 서식지 입장 가능");
                           break;
                           //System.exit(0);
                        }
                     }
                     
                     //캐릭터 스펙
                     System.out.println("-------------------------------");
                     System.out.println("캐릭터 이름: " + hero.name);
                     System.out.println("현재 레벨: " + hero.level);
                     System.out.println("현재 공격력: " + hero.power);
                     System.out.println("현재 방어력: " + hero.defense);
                     System.out.println("현재 HP: " + hero.hp);
                     System.out.println("현재 MP: " + hero.mp);
                     System.out.println("현재 경험치: " + hero.experience);
                     System.out.println("현재 보유한 돈: " + hero.money);
                     //System.out.println("스피드: " + hero.speed);
                     System.out.println("lockdown: " + hero.lockdown);
                     System.out.println("불 아이템 보유량: " + hero.fire);
                     System.out.println();
                     //이동 경로 선택
                     System.out.println("1. 사냥터 입장");
                     System.out.println("2. 상점 입장");
                     System.out.println("3. 잊혀진신전 입장(레벨5 미만 입장 불가)");
                     System.out.println("4. 드래곤 서식지(레벨5 미만 입장 불가)");
                     System.out.println("5. 인벤토리 확인");
                     System.out.println("6. 무기상점 입장");
                     System.out.println("이동할 장소를 고르세요");
                     number = sc.nextInt();
                     if(number == 1 && timer.time() == 0) {//사냥터 입장
                        //제한시간이 지나서 게임을 종료합니다. 미션실패!
                        if(timer.day() == 10) {
                           System.out.println();
                           System.out.println("\n\n\n");
                           System.out.println("10일이 지났습니다.\n\n");
                           Thread.sleep(1000);
                           System.out.println("미션 실패..\n\n");
                           Thread.sleep(1000);
                           System.out.println("마을이 파괴되었습니다.\n\n");
                           Thread.sleep(1000);
                           //text.show_end();
                           System.exit(0);
                        }
                        
//                      //몬스터 객체배열
//                         ArrayList<Monster> monsterList = new ArrayList<Monster>(); 
//                         monsterList.add(new Goblin());
//                         monsterList.add(new Orc());
//                         monsterList.add(new Ogre());
//                         monsterList.add(new Wyvern());
                        
                        while(true) {
                    		//제한시간이 지나서 게임을 종료합니다. 미션실패!
                    		 if(timer.day() == 10) {
                                 System.out.println();
                                 System.out.println("\n\n\n");
                                 System.out.println("10일이 지났습니다.\n\n");
                                 Thread.sleep(1000);
                                 System.out.println("미션 실패..\n\n");
                                 Thread.sleep(1000);
                                 System.out.println("마을이 파괴되었습니다.\n\n");
                                 Thread.sleep(1000);
                                 //text.show_end();
                                 System.exit(0);
                              }
                              //타겟 스펙
                              System.out.println("몬스터 랜덤출현");
                              
                              //몬스터 객체배열
                              ArrayList<Monster> monsterList = new ArrayList<Monster>(); 
                              monsterList.add(new Goblin());
                              monsterList.add(new Orc());
                              monsterList.add(new Ogre());
                              monsterList.add(new Wyvern());
                              
//                              for(Monster mon : monsterList) {
//                            	  mon.attack();
//                              }
                              int i = random.nextInt(4) ;
                              Monster monster = monsterList.get(i);
                              if(monster instanceof Goblin) {
                            	  Goblin goblin = (Goblin)monster;
                            	  goblin.showSpec();
                            	  goblin.go();
                            	  while(goblin.hp > 0) {
                            		    
                            		  System.out.println("1. 계속공격하기");
                                      System.out.println("2. 도망가기");
                                      System.out.println("3. 특수공격(마법아이템 사용)");
                                      System.out.println("옵션을 선택하세요");
                                      number = sc.nextInt();
                                  	 if(number == 1) {
                                  		System.out.println("타겟을 공격합니다");
                                  		goblin.attacked(hero.attack());
                                         //교전중 영웅과 타겟의 hp 변화 표시
                                         System.out.println("player의 hp: "+hero.hp);
                                         System.out.println("player의 mp: "+hero.mp);
                                         System.out.println("player의 lockdown: "+hero.lockdown);
                                         System.out.println(goblin.name+"의 hp: "+goblin.hp);
                                         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                         //영웅의 체력이 0 이하
                                         if(hero.hp<=0) {
                                            System.out.println("게임 종료! 사망하였습니다.");
                                            System.exit(0);
                                            //break;
                                         }
                                         //타겟의 체력이 0이하
                                         if(goblin.hp <=0) {
                                        	 goblin.Stop(true);
                                            System.out.println("사냥 성공");
                                            hero.experience += goblin.experience;
                                            hero.money += goblin.money;
                                            
                                            break Loop1;
                                         }
                                  	 }else if(number == 2) {
                                  		 
                                  		 goblin.Stop(true);
                                  		break Loop1;
                                  	 }else if(number ==3 && hero.fire>0) { //fire attack start
                                  		 while(true) {
                                    			Amazon amazon = new Amazon();
                                       		 amazon.go(goblin);
                                              System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                              System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                              //hero.itemuse(1);
                                              //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                              //System.out.println("Player의 잔여 mp: " + hero.mp);
                                              System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                              //int i=0;
                                              int temp = hero.fire;
                                              System.out.println("사냥 후 fire잔여: " + temp);
                                              hero.fireuse(temp);
                                              while(hero.fire>0 ) {
                                             	 //dragon.Stop(true);
                                             	 //dragon.attacked(hero.attack());
                                                 //교전중 영웅과 타겟의 hp 변화 표시
                                                 System.out.println("player의 hp: "+hero.hp);
                                                 //System.out.println(wyvern.name +"의 hp: "+wyvern.hp);
                                                 System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                 System.out.println();
                                                 int tempUsed = hero.fire;
                                                 if(goblin.hp <=0) {                                 
                                                    hero.experience += goblin.experience;
                                                    hero.money += goblin.money;
                                                    amazon.Stop(true);
                                                    goblin.Stop(true);
                                                    //hero.Stop(true);
                                                    System.out.println("사냥 성공");
                                                    hero.fire=tempUsed;
                                                    break Loop1;
                                                 }else {
                                                    
                                                    Thread.sleep(200);
                                                    if(hero.fire > 9) {
                                                    	hero.fire -= temp/10;
                                                    }else {
                                                    	hero.fire -= 1;
                                                    }
                                                    //hero.fire -= temp/10;
                                                    System.out.println("fire잔여: " + hero.fire);
                                                 }
                                              }
                                              amazon.Stop(true);
                                              //dragon.Stop(false);
                                              //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                              break;
                                    		 }
                                    		 
                                    	 }//fire attack end
                            		  
                            	  }
                            	  break Loop1;
                            	  //goblin.showSpec();
                            	  //goblin.go();
                              }
                              else if(monster instanceof Orc) {
                            	  Orc orc = (Orc)monster;
                            	  orc.showSpec();
                            	  orc.go();
                            	  while(orc.hp > 0) {
                            		    
                            		  System.out.println("1. 계속공격하기");
                                      System.out.println("2. 도망가기");
                                      System.out.println("3. 특수공격(마법아이템 사용)");
                                      System.out.println("옵션을 선택하세요");
                                      number = sc.nextInt();
                                  	 if(number == 1) {
                                  		System.out.println("타겟을 공격합니다");
                                  		orc.attacked(hero.attack());
                                         //교전중 영웅과 타겟의 hp 변화 표시
                                         System.out.println("player의 hp: "+hero.hp);
                                         System.out.println("player의 mp: "+hero.mp);
                                         System.out.println("player의 superpower: "+hero.lockdown);
                                         System.out.println(orc.name+"의 hp: "+orc.hp);
                                         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                         //영웅의 체력이 0 이하
                                         if(hero.hp<=0) {
                                            System.out.println("게임 종료! 사망하였습니다.");
                                            System.exit(0);
                                            //break;
                                         }
                                         //타겟의 체력이 0이하
                                         if(orc.hp <=0) {
                                        	 orc.Stop(true);
                                            System.out.println("사냥 성공");
                                            hero.experience += orc.experience;
                                            hero.money += orc.money;
                                            
                                            break Loop1;
                                         }
                                  	 }else if(number == 2) {
                                  		 
                                  		orc.Stop(true);
                                  		break Loop1;
                                  	 }else if(number ==3 && hero.fire>0) { //fire attack start
                                  		 while(true) {
                                    			Amazon amazon = new Amazon();
                                       		 amazon.go(orc);
                                              System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                              System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                              //hero.itemuse(1);
                                              //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                              //System.out.println("Player의 잔여 mp: " + hero.mp);
                                              System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                              //int i=0;
                                              int temp = hero.fire;
                                              System.out.println("사냥 후 fire잔여: " + temp);
                                              hero.fireuse(temp);
                                              while(hero.fire>0 ) {
                                             	 //dragon.Stop(true);
                                             	 //dragon.attacked(hero.attack());
                                                 //교전중 영웅과 타겟의 hp 변화 표시
                                                 System.out.println("player의 hp: "+hero.hp);
                                                 //System.out.println(wyvern.name +"의 hp: "+wyvern.hp);
                                                 System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                 System.out.println();
                                                 int tempUsed = hero.fire;
                                                 if(orc.hp <=0) {                                 
                                                    hero.experience += orc.experience;
                                                    hero.money += orc.money;
                                                    amazon.Stop(true);
                                                    orc.Stop(true);
                                                    //hero.Stop(true);
                                                    System.out.println("사냥 성공");
                                                    hero.fire=tempUsed;
                                                    break Loop1;
                                                 }else {
                                                    
                                                    Thread.sleep(200);
                                                    if(hero.fire > 9) {
                                                    	hero.fire -= temp/10;
                                                    }else {
                                                    	hero.fire -= 1;
                                                    }
                                                    //hero.fire -= temp/10;
                                                    System.out.println("fire잔여: " + hero.fire);
                                                 }
                                              }
                                              amazon.Stop(true);
                                              //dragon.Stop(false);
                                              //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                              break;
                                    		 }
                                    		 
                                    	 }//fire attack end
                            		  
                            	  }
                            	  break Loop1;
                            	  //orc.showSpec();
                            	  //orc.go();
                              }
                              else if(monster instanceof Ogre) {
                            	  Ogre ogre = (Ogre)monster;
                            	  ogre.showSpec();
                            	  ogre.go();
                            	  while(ogre.hp > 0) {
                            		    
                            		  System.out.println("1. 계속공격하기");
                                      System.out.println("2. 도망가기");
                                      System.out.println("3. 특수공격(마법아이템 사용)");
                                      System.out.println("옵션을 선택하세요");
                                      number = sc.nextInt();
                                  	 if(number == 1) {
                                  		System.out.println("타겟을 공격합니다");
                                  		ogre.attacked(hero.attack());
                                         //교전중 영웅과 타겟의 hp 변화 표시
                                         System.out.println("player의 hp: "+hero.hp);
                                         System.out.println("player의 mp: "+hero.mp);
                                         System.out.println("player의 lockdown: "+hero.lockdown);
                                         System.out.println(ogre.name+"의 hp: "+ogre.hp);
                                         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                         //영웅의 체력이 0 이하
                                         if(hero.hp<=0) {
                                            System.out.println("게임 종료! 사망하였습니다.");
                                            System.exit(0);
                                            //break;
                                         }
                                         //타겟의 체력이 0이하
                                         if(ogre.hp <=0) {
                                        	 ogre.Stop(true);
                                            System.out.println("사냥 성공");
                                            hero.experience += ogre.experience;
                                            hero.money += ogre.money;
                                            
                                            break Loop1;
                                         }
                                  	 }else if(number == 2) {
                                  		 
                                  		ogre.Stop(true);
                                  		break Loop1;
                                  	 }else if(number ==3 && hero.fire>0) { //fire attack start
                                  		 while(true) {
                                    			Amazon amazon = new Amazon();
                                       		 amazon.go(ogre);
                                              System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                              System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                              //hero.itemuse(1);
                                              //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                              //System.out.println("Player의 잔여 mp: " + hero.mp);
                                              System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                              //int i=0;
                                              int temp = hero.fire;
                                              System.out.println("사냥 후 fire잔여: " + temp);
                                              hero.fireuse(temp);
                                           /* //보험(사냥성공 체크)
                                              if(ogre.hp <=0) {                                 
                                                  hero.experience += ogre.experience;
                                                  hero.money += ogre.money;
                                                  amazon.Stop(true);
                                                  ogre.Stop(true);
                                                  //hero.Stop(true);
                                                  System.out.println("사냥 성공");
                                                  //hero.fire=tempUsed;
                                                  break Loop1;
                                              }*/
                                              while(hero.fire>0 ) {
                                             	 //dragon.Stop(true);
                                             	 //dragon.attacked(hero.attack());
                                                 //교전중 영웅과 타겟의 hp 변화 표시
                                                 System.out.println("player의 hp: "+hero.hp);
                                                 //System.out.println(ogre.name +"의 hp: "+ogre.hp);
                                                 System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                 System.out.println();
                                                 int tempUsed = hero.fire;
                                                 // 타겟이 사망 했을 때 => 사냥성공
                                                 if(ogre.hp <=0) {                                 
                                                    hero.experience += ogre.experience;
                                                    hero.money += ogre.money;
                                                    amazon.Stop(true);
                                                    ogre.Stop(true);
                                                    //hero.Stop(true);
                                                    System.out.println("사냥 성공");
                                                    hero.fire=tempUsed;
                                                    break;// Loop1;
                                                 }else {
                                                    
                                                    Thread.sleep(200);
                                                    if(hero.fire > 9) {
                                                    	hero.fire -= temp/10;
                                                    }else {
                                                    	hero.fire -= 1;
                                                    }
                                                    
                                                    System.out.println("fire잔여: " + hero.fire);
                                                 }
                                              }
                                              amazon.Stop(true);
                                              //dragon.Stop(false);
                                              //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                              break;
                                    		 }
                                    		 
                                    	 }//fire attack end
                            		  
                            	  } 
		                          break Loop1;
                            	  
                            	  //ogre.showSpec();
                            	  //ogre.go();
                              }
                              else if(monster instanceof Wyvern) {
                            	  Wyvern wyvern = (Wyvern)monster;
                            	  wyvern.showSpec();
                            	  wyvern.go();
                            	  while(wyvern.hp > 0) {
                            		    
                            		  System.out.println("1. 계속공격하기");
                                      System.out.println("2. 도망가기");
                                      System.out.println("3. 특수공격(마법아이템 사용)");
                                      System.out.println("옵션을 선택하세요");
                                      number = sc.nextInt();
                                  	 if(number == 1) {
                                  		System.out.println("타겟을 공격합니다");
                                  		wyvern.attacked(hero.attack());
                                         //교전중 영웅과 타겟의 hp 변화 표시
                                         System.out.println("player의 hp: "+hero.hp);
                                         System.out.println("player의 mp: "+hero.mp);
                                         System.out.println("player의 lockdown: "+hero.lockdown);
                                         System.out.println(wyvern.name+"의 hp: "+wyvern.hp);
                                         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                         //영웅의 체력이 0 이하
                                         if(hero.hp<=0) {
                                            System.out.println("게임 종료! 사망하였습니다.");
                                            System.exit(0);
                                            //break;
                                         }
                                         //타겟의 체력이 0이하
                                         if(wyvern.hp <=0) {
                                        	 wyvern.Stop(true);
                                            System.out.println("사냥 성공");
                                            hero.experience += wyvern.experience;
                                            hero.money += wyvern.money;
                                            
                                            break Loop1;
                                         }
                                  	 }else if(number == 2) {
                                  		 
                                  		wyvern.Stop(true);
                                  		break Loop1;
                                  	 }else if(number ==3 && hero.fire>0) { //fire attack start
                                  		 while(true) {
                                   			Amazon amazon = new Amazon();
                                      		 amazon.go(wyvern);
                                             System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                             System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                             //hero.itemuse(1);
                                             //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                             //System.out.println("Player의 잔여 mp: " + hero.mp);
                                             System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                             //int i=0;
                                             int temp = hero.fire;
                                             System.out.println("사냥 후 fire잔여: " + temp);
                                             hero.fireuse(temp);
                                             while(hero.fire>0 ) {
                                            	 //dragon.Stop(true);
                                            	 //dragon.attacked(hero.attack());
                                                //교전중 영웅과 타겟의 hp 변화 표시
                                                System.out.println("player의 hp: "+hero.hp);
                                                //System.out.println(wyvern.name +"의 hp: "+wyvern.hp);
                                                System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                System.out.println();
                                                int tempUsed = hero.fire;
                                                if(wyvern.hp <=0) {                                 
                                                   hero.experience += wyvern.experience;
                                                   hero.money += wyvern.money;
                                                   amazon.Stop(true);
                                                   wyvern.Stop(true);
                                                   //hero.Stop(true);
                                                   System.out.println("사냥 성공");
                                                   hero.fire=tempUsed;
                                                   break Loop1;
                                                }else {
                                                   
                                                   Thread.sleep(200);
                                                   if(hero.fire > 9) {
                                                   	hero.fire -= temp/10;
                                                   }else {
                                                   	hero.fire -= 1;
                                                   }
                                                   //hero.fire -= temp/10;
                                                   System.out.println("fire잔여: " + hero.fire);
                                                }
                                             }
                                             amazon.Stop(true);
                                             //dragon.Stop(false);
                                             //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                             break;
                                   		 }
                                   		 
                                   	 }//fire attack end
                            		  
                            	  }
                            	  break Loop1;
                            	  //wyvern.showSpec();
                            	 // wyvern.go();
                              }
                              else {
                            	  System.out.println("지원되지 않는 형입니다.");
                              }                      
                             
                            
                    	 }
                     }else if(number == 2) {//상점
                        //제한시간이 지나서 게임을 종료합니다. 미션실패!
                        if(timer.day() == 10) {
                           System.out.println();
                           System.out.println("\n\n\n");
                           System.out.println("10일이 지났습니다.\n\n");
                           Thread.sleep(1000);
                           System.out.println("미션 실패..\n\n");
                           Thread.sleep(1000);
                           System.out.println("마을이 파괴되었습니다.\n\n");
                           Thread.sleep(1000);
                           //text.show_end();
                           System.exit(0);
                        }
                        PotionStore store = new PotionStore();
                        System.out.println("상점 입장");
                        System.out.println("1. 파워 업그레이드(가격:100, 파워+7)");
                        System.out.println("2. 방어력 업그레이드(가격:100, 방어력+3)");
                        System.out.println("3. HP 증강(가격:10, HP+10)");
                        System.out.println("4. MP 증강(가격:10, MP+10)");
                        System.out.println("5. HP(대용량) 증강(가격:50, HP+50)");
                        System.out.println("6. MP(대용량) 증강(가격:50, MP+50)");
                        System.out.println("7. HP(초대용량) 증강(가격:50, HP+50)");
                        
                        System.out.println("구매할 물건을 선택하세요");
                        System.out.println("8. 상점 나가기");
                        number = sc.nextInt();
                        if(number == 8)
                           break Loop1;
                        int temp = hero.money;
                        
                        if((hero.money = store.show(hero.money, number)) != -1) {
                           System.out.println("구입 완료");
                           if(number == 1) 
                              hero.power += 7;
                           if(number == 2) 
                              hero.defense += 3;
                           if(number == 3 && hero.hp<=1000*hero.level) 
                              hero.hp += 10;
                           if(number == 4) 
                              hero.mp += 10;
                           if(number == 5 && hero.hp<=1000*hero.level) 
                              hero.hp += 50;
                           if(number == 6) 
                              hero.mp += 50;
                           if(number == 7 && hero.hp<=1000*hero.level) 
                               hero.hp += 100;
                           
                        }
                        else {
                           System.out.println("돈이 부족합니다");
                           hero.money=temp;
                        }
                     }else if(number == 3 && hero.level >= 5) {//아이템상점
                        //제한시간이 지나서 게임을 종료합니다. 미션실패!
                        if(timer.day() == 10) {
                           System.out.println();
                           System.out.println("\n\n\n");
                           System.out.println("10일이 지났습니다.\n\n");
                           Thread.sleep(1000);
                           System.out.println("미션 실패..\n\n");
                           Thread.sleep(1000);
                           System.out.println("마을이 파괴되었습니다.\n\n");
                           Thread.sleep(1000);
                           //text.show_end();
                           System.exit(0);
                        }
                        LostTemple lostTemple = new LostTemple();
                        System.out.println("잊혀진신전에 입장하였습니다.");
                        System.out.println("1. lockdown(가격:500, 타겟의 공격을 1초동안 마비, 레벨5이상 구입 가능)");
                        
                        System.out.println("구매할 물건을 선택하세요");
                        System.out.println("2. 잊혀진신전 나가기");
                        number = sc.nextInt();
                        if(number == 2)
                           break Loop1;
                        int temp = hero.money;
                        
                        if((hero.money = lostTemple.showitem(hero.money, number)) != -1) {
                           System.out.println("구입 완료");
                           if(number == 1) 
                              hero.lockdown += 10;                  
                        }
                        else {
                           System.out.println("돈이 부족합니다");
                           hero.money=temp;
                        }
                     }else if(number == 4) {//드래곤 서식지
                        if(hero.level < 5) {
                           System.out.println("level 5이상 입장 가능");
                           break;
                        }else {
                           if(timer.day() == 10) {
                              System.out.println();
                              System.out.println("\n\n\n");
                              System.out.println("10일이 지났습니다.\n\n");
                              Thread.sleep(1000);
                              System.out.println("미션 실패..\n\n");
                              Thread.sleep(1000);
                              System.out.println("마을이 파괴되었습니다.\n\n");
                              Thread.sleep(1000);
                              //text.show_end();
                              System.exit(0);
                           }   
                           System.out.println("1. 드래곤 사냥 시작");
                              System.out.println("   타겟종류: 드래곤");
                              //System.out.println("   현재 레벨: " + hero.level);
                              System.out.println("   공격력: 60");
                              System.out.println("   방어력: 25");
                              System.out.println("   HP: 6000");
                              //System.out.println("   현재 MP: " + hero.mp);
                              System.out.println("   경험치: 200");
                              System.out.println("   보유한 돈: 100");
                              System.out.println("   스피드: 4");
                           System.out.println("2. 드래곤 서식지 나가기");
                           Dragon dragon = new Dragon();
                           System.out.println("번호를 선택하세요");
                           number = sc.nextInt();
                           if(number == 1) {
                        	   while(hero.hp >0 && dragon.hp > 0) {
                        		   dragon.go();
                                   while(hero.hp >0 && dragon.hp > 0) {
                                 	  dragon.showSpec();
                                 	  System.out.println("======================================================================");
                                 	  //System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                       //System.out.println("player의 hp: "+hero.hp);
                                       //System.out.println("target의 hp: "+dragon.hp);
                                 	  System.out.println("1. 계속공격하기");
                                       System.out.println("2. 도망가기");
                                       System.out.println("3. 타겟 마비시키기");
                                       System.out.println("4. 특수공격하기(마법아이템사용)");
                                       System.out.println("옵션을 선택하세요");
                                       number = sc.nextInt();
                                   	 if(number == 1) {
                                   		System.out.println("타겟을 공격합니다");
                                   		dragon.attacked(hero.attack());
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);
                                          System.out.println("player의 mp: "+hero.mp);
                                          System.out.println("player의 lockdown: "+hero.lockdown);
                                          System.out.println(dragon.name+"의 hp: "+dragon.hp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          //영웅의 체력이 0 이하
                                          if(hero.hp<=0) {
                                             System.out.println("게임 종료! 사망하였습니다.");
                                             System.exit(0);
                                             //break;
                                          }
                                          //타겟의 체력이 0이하
                                          if(dragon.hp <=0) {
                                         	 dragon.Stop(true);
                                              
                                              System.out.println("드래곤 사냥 성공");
                                              hero.experience += dragon.experience;
                                              hero.money += dragon.money;
                                              System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
                                              System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
                                              System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
                                              System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
                                              System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
                                               System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
                                               System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                              System.out.println("            드래곤 서식지 점령 완료! 마을의 평화를 되찾았습니다.                                        ");
                                              System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                               System.exit(0);
                                         	
                                          }
                                   	 }else if(number == 2) {
                                   		 // 도망가기
                                   		dragon.Stop(true);
                                   		break Loop1;
                                   	 }else if(number ==3 && hero.lockdown>0) {
                                          System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                          System.out.println("========================아이템 'superpower'사용으로 타겟이 마비 되었습니다==========================");
                                          hero.itemuse(1);
                                          System.out.println("Player의 잔여 superpower: "+hero.lockdown);
                                          System.out.println("Player의 잔여 mp: " + hero.mp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          int i=0;
                                          while(i<1) {
                                         	 dragon.Stop(true);
                                         	 dragon.attacked(hero.attack());
                                             //교전중 영웅과 타겟의 hp 변화 표시
                                             System.out.println("player의 hp: "+hero.hp);
                                             System.out.println("target의 hp: "+dragon.hp);
                                             System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                             System.out.println();
                                             if(dragon.hp <=0) {                                 
                                                hero.experience += dragon.experience;
                                                hero.money += dragon.money;
                                                System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
                                                System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
                                                System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
                                                System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
                                                System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
                                                 System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
                                                 System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                                System.out.println("            드래곤 서식지 점령 완료! 마을의 평화를 되찾았습니다.                                        ");
                                                System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                 System.exit(0);
                                                 dragon.Stop(true);
                                                //hero.Stop(true);
                                                System.out.println("드래곤 사냥 성공");
                                                //break Loop1;
                                             }else {
                                                Thread.sleep(3000);
                                                i++;
                                             }
                                          }
                                          
                                          dragon.Stop(false);
                                          System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                          break;
                                   	 }else if(number ==4 && hero.fire>0) { //fire attack start
                                  		 while(true) {
                                  			Amazon amazon = new Amazon();
                                     		 amazon.go(dragon);
                                            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                            System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                            //hero.itemuse(1);
                                            //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                            //System.out.println("Player의 잔여 mp: " + hero.mp);
                                            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                            //int i=0;
                                            int temp = hero.fire;
                                            System.out.println("사냥 후 fire잔여: " + temp);
                                            hero.fireuse(temp);
                                         /* //보험(사냥성공 체크)
                                            if(ogre.hp <=0) {                                 
                                                hero.experience += ogre.experience;
                                                hero.money += ogre.money;
                                                amazon.Stop(true);
                                                ogre.Stop(true);
                                                //hero.Stop(true);
                                                System.out.println("사냥 성공");
                                                //hero.fire=tempUsed;
                                                break Loop1;
                                            }*/
                                            while(hero.fire>0 ) {
                                           	 //dragon.Stop(true);
                                           	 //dragon.attacked(hero.attack());
                                               //교전중 영웅과 타겟의 hp 변화 표시
                                               System.out.println("player의 hp: "+hero.hp);
                                               //System.out.println(ogre.name +"의 hp: "+ogre.hp);
                                               System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                               System.out.println();
                                               int tempUsed = hero.fire;
                                               // 타겟이 사망 했을 때 => 사냥성공
                                               if(dragon.hp <=0) {    
                                            	   System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
                                                   System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
                                                   System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
                                                   System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
                                                   System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
                                                    System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
                                                    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                                   System.out.println("            드래곤 서식지 점령 완료! 마을의 평화를 되찾았습니다.                                        ");
                                                   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                    System.exit(0);
                                                  hero.experience += dragon.experience*10;
                                                  hero.money += dragon.money*10;
                                                  amazon.Stop(true);
                                                  dragon.Stop(true);
                                                  //hero.Stop(true);
                                                  System.out.println("사냥 성공");
                                                  hero.fire=tempUsed;
                                                  break;// Loop1;
                                               }else {
                                                  
                                                  Thread.sleep(200);
                                                  if(hero.fire > 9) {
                                                  	hero.fire -= temp/10;
                                                  }else {
                                                  	hero.fire -= 1;
                                                  }
                                                  
                                                  System.out.println("fire잔여: " + hero.fire);
                                               }
                                            }
                                            amazon.Stop(true);
                                            //dragon.Stop(false);
                                            //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                            break;
                                  		 }
                                  		 
                                  	 }//fire attack end
                                   	 	
                                   }
                        		   
                        	   }
                              
                              
                           }else if(number == 2) {
                        		 // 도망가기
                        		dragon.Stop(true);
                        		break Loop1;
                        	 }
                        }
                    }else if(number == 1 && timer.time() == 1) { //밤 사냥터 입장
                	 while(true) {
                		//제한시간이 지나서 게임을 종료합니다. 미션실패!
                		 if(timer.day() == 10) {
                             System.out.println();
                             System.out.println("\n\n\n");
                             System.out.println("10일이 지났습니다.\n\n");
                             Thread.sleep(1000);
                             System.out.println("미션 실패..\n\n");
                             Thread.sleep(1000);
                             System.out.println("마을이 파괴되었습니다.\n\n");
                             Thread.sleep(1000);
                             //text.show_end();
                             System.exit(0);
                          }
                          //타겟 스펙
                          System.out.println("몬스터 랜덤출현");
                          
                          //몬스터 객체배열
                          ArrayList<Monster> monsterList = new ArrayList<Monster>(); 
                          monsterList.add(new Goblin());
                          monsterList.add(new Orc());
                          monsterList.add(new Ogre());
                          monsterList.add(new Wyvern());
                          
//                              for(Monster mon : monsterList) {
//                            	  mon.attack();
//                              }
                          int i = random.nextInt(4) ;
                          Monster monster = monsterList.get(i);
                          if(monster instanceof Goblin) {
                        	  Goblin goblin = (Goblin)monster;
                        	  goblin.showSpec();
                        	  goblin.go();
                        	  while(goblin.hp > 0) {
                        		    
                        		  System.out.println("1. 계속공격하기");
                                  System.out.println("2. 도망가기");
                                  System.out.println("3. 특수공격하기(마법아이템사용)");
                                  System.out.println("옵션을 선택하세요");
                                  number = sc.nextInt();
                              	 if(number == 1) {
                              		System.out.println("타겟을 공격합니다");
                              		goblin.attackedNight(hero.attack()/10);
                                     //교전중 영웅과 타겟의 hp 변화 표시
                              		 System.out.println("그러나 밤이라서 데미지가 10%만 들어갑니다.");
                              		 //마이너스 체력 영으로 처리
                              		 if(hero.hp<0 && goblin.hp<0) {
                              			System.out.println("player의 hp: 0");
                                        System.out.println("player의 mp: "+hero.mp);
                                        System.out.println("player의 lockdown: "+hero.lockdown);
                                        System.out.println(goblin.name+"의 hp: 0");
                                        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                              		 }else if(hero.hp>0 && goblin.hp<0) {
                              			System.out.println("player의 hp: "+hero.hp);
                                        System.out.println("player의 mp: "+hero.mp);
                                        System.out.println("player의 lockdown: "+hero.lockdown);
                                        System.out.println(goblin.name+"의 hp: 0");
                                        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛"); 
                              		 }else if(hero.hp<0 && goblin.hp>0) {
                              			System.out.println("player의 hp: 0");
                                        System.out.println("player의 mp: "+hero.mp);
                                        System.out.println("player의 lockdown: "+hero.lockdown);
                                        System.out.println(goblin.name+"의 hp: "+goblin.hp);
                                        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                              		 }else {
                              			//System.out.println("몬스터에게 데미지를" + hero.attack()/10 + "만큼 입혔습니다.");
                                         System.out.println("player의 hp: "+hero.hp);
                                         System.out.println("player의 mp: "+hero.mp);
                                         System.out.println("player의 lockdown: "+hero.lockdown);
                                         System.out.println(goblin.name+"의 hp: "+goblin.hp);
                                         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛"); 
                              		 }
                              		 
                                     //영웅의 체력이 0 이하
                                     if(hero.hp<=0) {
                                        System.out.println("게임 종료! 사망하였습니다.");
                                        System.exit(0);
                                        //break;
                                     }
                                     //타겟의 체력이 0이하
                                     if(goblin.hp <=0) {
                                    	 goblin.Stop(true);
                                        System.out.println("사냥 성공");
                                        hero.experience += goblin.experience*10;
                                        hero.money += goblin.money*10;
                                        
                                        break Loop1;
                                     }
                              	 }else if(number == 2) {
                              		 
                              		 goblin.Stop(true);
                              		break Loop1;
                              	 }else if(number ==3 && hero.fire>0) { //fire attack start
                              		 while(true) {
                             			Amazon amazon = new Amazon();
                                		 amazon.go(goblin);
                                       System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                       System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                       //hero.itemuse(1);
                                       //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                       //System.out.println("Player의 잔여 mp: " + hero.mp);
                                       System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                       //int i=0;
                                       int temp = hero.fire;
                                       System.out.println("사냥 후 fire잔여: " + temp);
                                       hero.fireuse(temp);
                                       while(hero.fire>0 ) {
                                      	 //dragon.Stop(true);
                                      	 //dragon.attacked(hero.attack());
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);
                                          //System.out.println(wyvern.name +"의 hp: "+wyvern.hp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          System.out.println();
                                          int tempUsed = hero.fire;
                                          if(goblin.hp <=0) {                                 
                                             hero.experience += goblin.experience;
                                             hero.money += goblin.money;
                                             amazon.Stop(true);
                                             goblin.Stop(true);
                                             //hero.Stop(true);
                                             System.out.println("사냥 성공");
                                             hero.fire=tempUsed;
                                             break Loop1;
                                          }else {
                                             
                                             Thread.sleep(200);
                                             if(hero.fire > 9) {
                                             	hero.fire -= temp/10;
                                             }else {
                                             	hero.fire -= 1;
                                             }
                                             //hero.fire -= temp/10;
                                             System.out.println("fire잔여: " + hero.fire);
                                          }
                                       }
                                       amazon.Stop(true);
                                       //dragon.Stop(false);
                                       //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                       break;
                             		 }
                             		 
                             	 }//fire attack end
                        		  
                        	  }
                        	  break Loop1;
                        	  //goblin.showSpec();
                        	  //goblin.go();
                          }
                          else if(monster instanceof Orc) {
                        	  Orc orc = (Orc)monster;
                        	  orc.showSpec();
                        	  orc.go();
                        	  while(orc.hp > 0) {
                        		    
                        		  System.out.println("1. 계속공격하기");
                                  System.out.println("2. 도망가기");
                                  System.out.println("3. 특수공격하기(마법아이템사용)");
                                  System.out.println("옵션을 선택하세요");
                                  number = sc.nextInt();
                              	 if(number == 1) {
                              		System.out.println("타겟을 공격합니다");
                              		orc.attackedNight(hero.attack()/10);
                                     //교전중 영웅과 타겟의 hp 변화 표시
                              		 System.out.println("그러나 밤이라서 데미지가 10%만 들어갑니다.");
                             		 //System.out.println("몬스터에게 데미지를" + hero.attack()/10 + "만큼 입혔습니다.");
                                     System.out.println("player의 hp: "+hero.hp);
                                     System.out.println("player의 mp: "+hero.mp);
                                     System.out.println("player의 lockdown: "+hero.lockdown);
                                     System.out.println("target의 hp: "+orc.hp);
                                     System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                     //영웅의 체력이 0 이하
                                     if(hero.hp<=0) {
                                        System.out.println("게임 종료! 사망하였습니다.");
                                        System.exit(0);
                                        //break;
                                     }
                                     //타겟의 체력이 0이하
                                     if(orc.hp <=0) {
                                    	 orc.Stop(true);
                                        System.out.println("사냥 성공");
                                        hero.experience += orc.experience*10;
                                        hero.money += orc.money*10;
                                        
                                        break Loop1;
                                     }
                              	 }else if(number == 2) {
                              		 
                              		orc.Stop(true);
                              		break Loop1;
                              	 }else if(number ==3 && hero.fire>0) { //fire attack start
                              		 while(true) {
                             			Amazon amazon = new Amazon();
                                		 amazon.go(orc);
                                       System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                       System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                       //hero.itemuse(1);
                                       //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                       //System.out.println("Player의 잔여 mp: " + hero.mp);
                                       System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                       //int i=0;
                                       int temp = hero.fire;
                                       System.out.println("사냥 후 fire잔여: " + temp);
                                       hero.fireuse(temp);
                                       while(hero.fire>0 ) {
                                      	 //dragon.Stop(true);
                                      	 //dragon.attacked(hero.attack());
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);
                                          //System.out.println(wyvern.name +"의 hp: "+wyvern.hp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          System.out.println();
                                          int tempUsed = hero.fire;
                                          if(orc.hp <=0) {                                 
                                             hero.experience += orc.experience;
                                             hero.money += orc.money;
                                             amazon.Stop(true);
                                             orc.Stop(true);
                                             //hero.Stop(true);
                                             System.out.println("사냥 성공");
                                             hero.fire=tempUsed;
                                             break Loop1;
                                          }else {
                                             
                                             Thread.sleep(200);
                                             if(hero.fire > 9) {
                                             	hero.fire -= temp/10;
                                             }else {
                                             	hero.fire -= 1;
                                             }
                                             //hero.fire -= temp/10;
                                             System.out.println("fire잔여: " + hero.fire);
                                          }
                                       }
                                       amazon.Stop(true);
                                       //dragon.Stop(false);
                                       //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                       break;
                             		 }
                             		 
                             	 }//fire attack end
                        		  
                        	  }
                        	  break Loop1;
                        	  //orc.showSpec();
                        	  //orc.go();
                          }
                          else if(monster instanceof Ogre) {
                        	  Ogre ogre = (Ogre)monster;
                        	  ogre.showSpec();
                        	  ogre.go();
                        	  while(ogre.hp > 0) {
                        		    
                        		  System.out.println("1. 계속공격하기");
                                  System.out.println("2. 도망가기");
                                  System.out.println("3. 특수공격하기(마법아이템사용)");
                                  System.out.println("옵션을 선택하세요");
                                  number = sc.nextInt();
                              	 if(number == 1) {
                              		System.out.println("타겟을 공격합니다");
                              		ogre.attackedNight(hero.attack()/10);
                                     //교전중 영웅과 타겟의 hp 변화 표시
                              		System.out.println("그러나 밤이라서 데미지가 10%만 들어갑니다.");
                             		 //System.out.println("몬스터에게 데미지를" + hero.attack()/10 + "만큼 입혔습니다.");
                                     System.out.println("player의 hp: "+hero.hp);
                                     System.out.println("player의 mp: "+hero.mp);
                                     System.out.println("player의 lockdown: "+hero.lockdown);
                                     System.out.println("target의 hp: "+ogre.hp);
                                     System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                     //영웅의 체력이 0 이하
                                     if(hero.hp<=0) {
                                        System.out.println("게임 종료! 사망하였습니다.");
                                        System.exit(0);
                                        //break;
                                     }
                                     //타겟의 체력이 0이하
                                     if(ogre.hp <=0) {
                                    	 ogre.Stop(true);
                                        System.out.println("사냥 성공");
                                        hero.experience += ogre.experience*10;
                                        hero.money += ogre.money*10;
                                        
                                        break Loop1;
                                     }
                              	 }else if(number == 2) {
                              		 
                              		ogre.Stop(true);
                              		break Loop1;
                              	 }else if(number ==3 && hero.fire>0) { //fire attack start
                              		 while(true) {
                             			Amazon amazon = new Amazon();
                                		 amazon.go(ogre);
                                       System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                       System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                       //hero.itemuse(1);
                                       //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                       //System.out.println("Player의 잔여 mp: " + hero.mp);
                                       System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                       //int i=0;
                                       int temp = hero.fire;
                                       System.out.println("사냥 후 fire잔여: " + temp);
                                       hero.fireuse(temp);
                                    /* //보험(사냥성공 체크)
                                       if(ogre.hp <=0) {                                 
                                           hero.experience += ogre.experience;
                                           hero.money += ogre.money;
                                           amazon.Stop(true);
                                           ogre.Stop(true);
                                           //hero.Stop(true);
                                           System.out.println("사냥 성공");
                                           //hero.fire=tempUsed;
                                           break Loop1;
                                       }*/
                                       while(hero.fire>0 ) {
                                      	 //dragon.Stop(true);
                                      	 //dragon.attacked(hero.attack());
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);
                                          //System.out.println(ogre.name +"의 hp: "+ogre.hp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          System.out.println();
                                          int tempUsed = hero.fire;
                                          // 타겟이 사망 했을 때 => 사냥성공
                                          if(ogre.hp <=0) {                                 
                                             hero.experience += ogre.experience*10;
                                             hero.money += ogre.money*10;
                                             amazon.Stop(true);
                                             ogre.Stop(true);
                                             //hero.Stop(true);
                                             System.out.println("사냥 성공");
                                             hero.fire=tempUsed;
                                             break;// Loop1;
                                          }else {
                                             
                                             Thread.sleep(200);
                                             if(hero.fire > 9) {
                                             	hero.fire -= temp/10;
                                             }else {
                                             	hero.fire -= 1;
                                             }
                                             
                                             System.out.println("fire잔여: " + hero.fire);
                                          }
                                       }
                                       amazon.Stop(true);
                                       //dragon.Stop(false);
                                       //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                       break;
                             		 }
                             		 
                             	 }//fire attack end
                        		  
                        	  } 
	                          break Loop1;
                        	  
                        	  //ogre.showSpec();
                        	  //ogre.go();
                          }
                          else if(monster instanceof Wyvern) {
                        	  Wyvern wyvern = (Wyvern)monster;
                        	  wyvern.showSpec();
                        	  wyvern.go();
                        	  while(wyvern.hp > 0) {
                        		    
                        		  System.out.println("1. 계속공격하기");
                                  System.out.println("2. 도망가기");
                                  System.out.println("3. 특수공격하기(마법아이템사용)");
                                  System.out.println("옵션을 선택하세요");
                                  number = sc.nextInt();
                              	 if(number == 1) {
                              		System.out.println("타겟을 공격합니다");
                              		wyvern.attackedNight(hero.attack()/10);
                              		
                                     //교전중 영웅과 타겟의 hp 변화 표시
                              		 System.out.println("그러나 밤이라서 데미지가 10%만 들어갑니다.");
                             		 //System.out.println("몬스터에게 데미지를" + hero.attack()/10 + "만큼 입혔습니다.");
                                     System.out.println("player의 hp: "+hero.hp);
                                     System.out.println("player의 mp: "+hero.mp);
                                     System.out.println("player의 lockdown: "+hero.lockdown);
                                     System.out.println("target의 hp: "+wyvern.hp);
                                     System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                     //영웅의 체력이 0 이하
                                     if(hero.hp<=0) {
                                        System.out.println("게임 종료! 사망하였습니다.");
                                        System.exit(0);
                                        //break;
                                     }
                                     //타겟의 체력이 0이하
                                     if(wyvern.hp <=0) {
                                    	 wyvern.Stop(true);
                                        System.out.println("사냥 성공");
                                        hero.experience += wyvern.experience*10;
                                        hero.money += wyvern.money*10;
                                        
                                        break Loop1;
                                     }
                              	 }else if(number == 2) {
                              		 
                              		wyvern.Stop(true);
                              		break Loop1;
                              	 }else if(number ==3 && hero.fire>0) { //fire attack start
                              		 while(true) {
                                			Amazon amazon = new Amazon();
                                   		 amazon.go(wyvern);
                                          System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                          System.out.println("========================마법아이템 'fire'사용으로 타겟이 불에 타고 있습니다.==========================");
                                          //hero.itemuse(1);
                                          //System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                          //System.out.println("Player의 잔여 mp: " + hero.mp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          //int i=0;
                                          int temp = hero.fire;
                                          System.out.println("사냥 후 fire잔여: " + temp);
                                          hero.fireuse(temp);
                                          while(hero.fire>0 ) {
                                         	 //dragon.Stop(true);
                                         	 //dragon.attacked(hero.attack());
                                             //교전중 영웅과 타겟의 hp 변화 표시
                                             System.out.println("player의 hp: "+hero.hp);
                                             //System.out.println(wyvern.name +"의 hp: "+wyvern.hp);
                                             System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                             System.out.println();
                                             int tempUsed = hero.fire;
                                             if(wyvern.hp <=0) {                                 
                                                hero.experience += wyvern.experience*10;
                                                hero.money += wyvern.money*10;
                                                amazon.Stop(true);
                                                wyvern.Stop(true);
                                                //hero.Stop(true);
                                                System.out.println("사냥 성공");
                                                hero.fire=tempUsed;
                                                break Loop1;
                                             }else {
                                                
                                                Thread.sleep(200);
                                                if(hero.fire > 9) {
                                                	hero.fire -= temp/10;
                                                }else {
                                                	hero.fire -= 1;
                                                }
                                                //hero.fire -= temp/10;
                                                System.out.println("fire잔여: " + hero.fire);
                                             }
                                          }
                                          amazon.Stop(true);
                                          //dragon.Stop(false);
                                          //System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                          break;
                                		 }
                                		 
                                	 }//fire attack end
                        		  
                        	  }
                        	  break Loop1;
                        	  //wyvern.showSpec();
                        	 // wyvern.go();
                          }
                          else {
                        	  System.out.println("지원되지 않는 형입니다.");
                          }                      
                         
                        
                	 }
                	 
                    
                    }else if(number == 5) { // 인벤토리 확인
                    	int sum = inventory.inventory_show(cnt);//인벤토리 띄우기
                    	if(sum!=0) {
                    		System.out.println("어떤 아이템을 사용하시겠습니까?(0. 돌아가기) : ");
                    		number = sc.nextInt();
                    		if(number == 1)
                    		hero.fire = inventory.inventory_use_magic(number, cnt, hero.fire);
                    		if(number == 2)
                    		hero.power = inventory.inventory_use_power(number, cnt, hero.power);
                    		if(number == 3)
                    		hero.defense = inventory.inventory_use_defense(number, cnt, hero.defense);
                    		//System.out.println("fire장비 장착 후 보유량 확인:" + hero.fire);
                    	}else {
                    		System.out.println("사용할 수 있는 항목이 없습니다.");
                    	}
                    }else if(number == 6) { //무기상점
                    	WeaponStore weaponStore = new WeaponStore();
                    	System.out.println("무기상점 입장");
                    	weaponStore.show();
                        
                        //System.out.println("1. superpower(가격:500, 타겟의 공격을 1초동안 마비, 레벨5이상 구입 가능)");
                        /*
                        System.out.println("구매할 물건을 선택하세요");
                        System.out.println("2. 무기상점 나가기");*/
                        number = sc.nextInt();
                        if(number == 0)
                           break Loop1;
                        int temp = hero.money;
                        
                        if((hero.money = weaponStore.purchase(hero.money, number)) != -1) {
                           System.out.println("구입 완료");
                           System.out.println("구입한 물품을 사용/확인하려면 인벤토리 창으로 이동하세요.\n");
                           System.out.println("\n\n\n\n\n\n\n\n");
  						// System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  						 //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//                           if(number == 1) 
//                              hero.superpower += 10;  
  					// 물품 담기
  						if (number == 1) cnt[0]+=1; //fire+1
  						if (number == 2) cnt[1]+=1; //공격템+1
  						if (number == 3) cnt[2]+=1; //갑옷+1
  						if (number == 4) cnt[3]+=1; //hp+1
  						if (number == 5) cnt[4]+=1; //mp+1
  						//if (number == 6) cnt[5]+=1; //fire+1
  						//if (number == 7) cnt[6]+=1; //fire+1
                        }
                        else {
                           System.out.println("돈이 부족합니다");
                           hero.money=temp;
                        }
                    }
                     //제한시간이 지나서 게임을 종료합니다. 미션실패!
                     if(timer.day() == 10) {
                        System.out.println();
                        System.out.println("\n\n\n");
                        System.out.println("10일이 지났습니다.\n\n");
                        Thread.sleep(1000);
                        System.out.println("미션 실패..\n\n");
                        Thread.sleep(1000);
                        System.out.println("마을이 파괴되었습니다.\n\n");
                        Thread.sleep(1000);
                        //text.show_end();
                        System.exit(0);
                     }   
                     /*if(hero.experience >= hero.level * 100) {
                        hero.level ++;
                        hero.money += hero.level * 50;
                        //hero.hp += 10;
                        System.out.println("레벨이 " + hero.level + "로 올랐습니다.");
                        //System.out.println("레벨업 하여 hp가 +10 증가합니다.");
                        hero.experience=0;
                        if(hero.level == 5) {
                           System.out.println("목표레벨에 도달하여 게임을 종료합니다");
                           System.exit(0);
                        }
                     }*/
                     
                  }//loop1(while)
                  //제한시간이 지나서 게임을 종료합니다. 미션실패!
                  if(timer.day() == 10) {
                     System.out.println();
                     System.out.println("\n\n\n");
                     System.out.println("10일이 지났습니다.\n\n");
                     Thread.sleep(1000);
                     System.out.println("미션 실패..\n\n");
                     Thread.sleep(1000);
                     System.out.println("마을이 파괴되었습니다.\n\n");
                     Thread.sleep(1000);
                     //text.show_end();
                     System.exit(0);
                  }   
               }//최상단 while
               //제한시간이 지나서 게임을 종료합니다. 미션실패!
               if(timer.day() == 10) {
                  System.out.println();
                  System.out.println("\n\n\n");
                  System.out.println("10일이 지났습니다.\n\n");
                  Thread.sleep(1000);
                  System.out.println("미션 실패..\n\n");
                  Thread.sleep(1000);
                  System.out.println("마을이 파괴되었습니다.\n\n");
                  Thread.sleep(1000);
                  //text.show_end();
                  System.exit(0);
               }   
               
   }//메인메소드

}