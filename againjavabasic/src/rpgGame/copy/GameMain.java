package rpgGame.copy;

import java.util.Scanner;

public class GameMain {

   public static void main(String[] args) throws InterruptedException{
      Scanner sc = new Scanner(System.in);
      Hero hero = new Hero();
      
      // 기본 세팅
      System.out.println("*************RPG게임 (드래곤 사냥하기) *****************");
      String s = "중세 유럽! 마을사람들을 위협하는 몬스터들을 소탕하기 위해 원정을 떠난다.\n\n"
            + "레벨5가 되면 드래곤 서식지에 입장이 가능하며 몬스터들의 우두머리인 드래곤을 제거하면 게임성공!\n\n"
            + "몬스터를 사냥하여 경험치를 얻어서 레벨업을 할 수 있으며\n\n"
            + "난이도가 높은 몬스터를 사냥할수록 더 많은 경험치와 돈을 얻게 된다. \n\n"
            + "레벨업 기준은 현재 레벨에 경험치100을 곱한값이며 \n\n"
            + "레벨업을 할때마다 돈과 총공격력이 레벨에 비례하여 증가한다.\n\n"
            + "단 10일 안에 드래곤을 제거하지 못하면 마을이 파괴되어 미션 실패이다.\n\n"
            + "1. 팔라딘(사를마뉴 궁정의 가장 뛰어난 검객)   2. 아마존 (창과 활을 자유자재로 부리는 여전사 )\n\n"
            + "원하는 캐릭터 번호를 입력하세요\n\n";
      for(int i =0; i < s.length(); i++) {
         Thread.sleep(50);
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
                     System.out.println("Superpower: " + hero.superpower);
                     System.out.println();
                     //이동 경로 선택
                     System.out.println("1. 사냥터 입장");
                     System.out.println("2. 상점 입장");
                     System.out.println("3. 아이템상점 입장(레벨5 미만 입장 불가)");
                     System.out.println("4. 드래곤 서식지(레벨5 미만 입장 불가)");
                     System.out.println("이동할 장소를 고르세요");
                     number = sc.nextInt();
                     if(number == 1) {//사냥터 입장
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
                        Monster monster = new Monster();
                        System.out.println("사냥을 시작합니다");
                        System.out.println("1.고블린");
                           System.out.println("   타겟종류: 고블린");
                           //System.out.println("   현재 레벨: " + hero.level);
                           System.out.println("   공격력: 20");
                           System.out.println("   방어력: 5");
                           System.out.println("   HP: 100");
                           //System.out.println("   현재 MP: " + hero.mp);
                           System.out.println("   경험치: 10");
                           System.out.println("   보유한 돈: 10");
                           System.out.println("   스피드: 6");
                        System.out.println("2.오크");
                           System.out.println("   타겟종류: 오크");
                           //System.out.println("   현재 레벨: " + hero.level);
                           System.out.println("   공격력: 30");
                           System.out.println("   방어력: 10");
                           System.out.println("   HP: 500");
                           //System.out.println("   현재 MP: " + hero.mp);
                           System.out.println("   경험치: 50");
                           System.out.println("   보유한 돈: 30");
                           System.out.println("   스피드: 5");               
                        System.out.println("3.오우거");
                           System.out.println("   타겟종류: 오우거");
                           //System.out.println("   현재 레벨: " + hero.level);
                           System.out.println("   공격력: 40");
                           System.out.println("   방어력: 20");
                           System.out.println("   HP: 1000");
                           //System.out.println("   현재 MP: " + hero.mp);
                           System.out.println("   경험치: 100");
                           System.out.println("   보유한 돈: 50");
                           System.out.println("   스피드: 4");
                        System.out.println("4.와이번");
                           System.out.println("   타겟종류: 와이번");
                           //System.out.println("   현재 레벨: " + hero.level);
                           System.out.println("   공격력: 50");
                           System.out.println("   방어력: 30");
                           System.out.println("   HP: 3000");
                           //System.out.println("   현재 MP: " + hero.mp);
                           System.out.println("   경험치: 300");
                           System.out.println("   보유한 돈: 200");
                           System.out.println("   스피드: 3");
                        System.out.println("5.사냥터 나가기");
                        System.out.println("타겟을 선택하세요");
                        number = sc.nextInt();
                        if(number == 1) {
                           monster = new Goblin();
                           monster.name = "고블린";
                           monster.hp=100;
                           monster.power=20;
                           monster.defense=5;
                           monster.experience=10;
                           //monster.speed=6;
                           monster.money=10;
                        }
                        if(number ==2) {
                           monster = new Orc();
                           monster.name = "오크";
                           monster.hp=500;
                           monster.power=30;
                           monster.defense=10;
                           monster.experience=50;
                           //monster.speed=5;
                           monster.money=30;
                        }
                        if(number == 3) {
                           monster = new Ogre();
                           monster.name = "오우거";
                           monster.hp=1000;
                           monster.power=40;
                           monster.defense=20;
                           monster.experience=100;
                           //monster.speed=4;
                           monster.money=50;
                        }
                        if(number == 4) {
                           monster = new Wyvern();
                           monster.name = "와이번";
                           monster.hp=3000;
                           monster.power=50;
                           monster.defense=30;
                           monster.experience=300;
                           //monster.speed=3;
                           monster.money=200;
                        }
                        if(number == 5) {
                           //사냥터 나가기
                           break Loop1;
                        }
                        //사냥 시작
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
                           System.out.println("--------------------------------------");
                           System.out.println("몬스터를 쫓아갑니다");
                           
                           //if(hero.speed >= monster.speed) {
                              //System.out.println(hero.speed);
                              while(true) {
                                 /*if(monster.currentThread().getState() == Thread.State.NEW) {
                                    monster.start();
                                    Thread.sleep(2000);
                                 }*/
                                 monster.go();
                                 
                                 //hero.attacked(monster.attack());
                                 
                                 
                                 System.out.println("타겟을 공격합니다");
                                 monster.attacked(hero.attack());
                                 //사냥 1회당 hp1 소진
                                 //hero.damaged(1);
                                 //교전중 영웅과 타겟의 hp 변화 표시
                                 System.out.println("player의 hp: "+hero.hp);
                                 System.out.println("player의 mp: "+hero.mp);
                                 System.out.println("player의 superpower: "+hero.superpower);
                                 System.out.println("target의 hp: "+monster.hp);
                                 System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                 //영웅의 체력이 0 이하
                                 if(hero.hp<=0) {
                                    System.out.println("게임 종료! 사망하였습니다.");
                                    System.exit(0);
                                    //break;
                                 }
                                 //타겟의 체력이 0이하
                                 if(monster.hp <=0) {
                                    monster.Stop(true);
                                    System.out.println("사냥 성공");
                                    hero.experience += monster.experience;
                                    hero.money += monster.money;
                                    
                                    break Loop1;
                                 }
                                 /*System.out.println("타겟이 반격합니다");
                                 
                                 hero.attacked(monster.attack());
                                 //교전중 영웅과 타겟의 hp 변화 표시
                                 System.out.println("player의 hp: "+hero.hp);*/
                                 //영웅의 체력이 0이하
                                 if(hero.hp<=0) {
                                    System.out.println("게임 종료! 사망하였습니다.");
                                    System.exit(0);
                                    //break;
                                 }
                                 System.out.println("1. 계속공격하기");
                                 System.out.println("2. 도망가기");
                                 System.out.println("옵션을 선택하세요");
                                 number = sc.nextInt();
                                 if(number==1) {
                                    System.out.println("타겟을 공격합니다");
                                    monster.attacked(hero.attack());
                                    //사냥 1회당 hp1 소진
                                    //hero.damaged(1);
                                    
                                    //교전중 영웅과 타겟의 hp 변화 표시
                                    System.out.println("player의 hp: "+hero.hp);
                                    System.out.println("player의 mp: "+hero.mp);
                                    System.out.println("player의 superpower: "+hero.superpower);
                                    System.out.println("target의 hp: "+monster.hp);
                                    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                    //System.out.println("hp 1만큼 소진");
                                    
                                    if(hero.hp<=0) {
                                       System.out.println("게임 종료! 사망하였습니다.");
                                       System.exit(0);
                                       //break;
                                    }
                                    //타겟의 체력이 0이하
                                    if(monster.hp <=0) {
                                       monster.Stop(true);
                                       System.out.println("사냥 성공");
                                       hero.experience += monster.experience;
                                       hero.money += monster.money;
                                       
                                       break Loop1;
                                    }
                                    /*System.out.println("타겟이 반격합니다");
                                    
                                    hero.attacked(monster.attack());
                                    //교전중 영웅과 타겟의 hp 변화 표시
                                    System.out.println("player의 hp: "+hero.hp);*/
                                    //영웅의 체력이 0이하
                                    if(hero.hp<=0) {
                                       System.out.println("게임 종료! 사망하였습니다.");
                                       System.exit(0);
                                       //break;
                                    }
                                    System.out.println("1. 계속공격하기");
                                    System.out.println("2. 도망가기");
                                    System.out.println("옵션을 선택하세요");
                                    number = sc.nextInt();
                                    if(number==1) {
                                       System.out.println("타겟을 공격합니다");
                                       monster.attacked(hero.attack());
                                       //사냥 1회당 hp1 소진
                                       //hero.damaged(1);
                                       //교전중 영웅과 타겟의 hp 변화 표시
                                       System.out.println("player의 hp: "+hero.hp);
                                       System.out.println("player의 mp: "+hero.mp);
                                       System.out.println("player의 superpower: "+hero.superpower);
                                       System.out.println("target의 hp: "+monster.hp);
                                       System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                       //System.out.println("hp 1만큼 소진");
                                       if(hero.hp<=0) {
                                          System.out.println("게임 종료! 사망하였습니다.");
                                          System.exit(0);
                                          //break;
                                       }
                                       //타겟의 체력이 0이하
                                       if(monster.hp <=0) {
                                          monster.Stop(true);
                                          System.out.println("사냥 성공");
                                          hero.experience += monster.experience;
                                          hero.money += monster.money;
                                          
                                          break Loop1;
                                       }
                                       /*System.out.println("타겟이 반격합니다");
                                       
                                       hero.attacked(monster.attack());
                                       //교전중 영웅과 타겟의 hp 변화 표시
                                       System.out.println("player의 hp: "+hero.hp);*/
                                       //영웅의 체력이 0이하
                                       if(hero.hp<=0) {
                                          System.out.println("게임 종료! 사망하였습니다.");
                                          System.exit(0);
                                          //break;
                                       }
                                       
                                       System.out.println("1. 계속공격하기");
                                       System.out.println("2. 도망가기");
                                       System.out.println("옵션을 선택하세요");
                                       number = sc.nextInt();
                                       if(number==1) {
                                          System.out.println("타겟을 공격합니다");
                                          monster.attacked(hero.attack());
                                          //사냥 1회당 hp1 소진
                                          //hero.damaged(1);
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);
                                          System.out.println("player의 mp: "+hero.mp);
                                          System.out.println("player의 superpower: "+hero.superpower);
                                          System.out.println("target의 hp: "+monster.hp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          //System.out.println("hp 1만큼 소진");
                                          if(hero.hp<=0) {
                                             System.out.println("게임 종료! 사망하였습니다.");
                                             System.exit(0);
                                             //break;
                                          }
                                          //타겟의 체력이 0이하
                                          if(monster.hp <=0) {
                                             monster.Stop(true);
                                             System.out.println("사냥 성공");
                                             hero.experience += monster.experience;
                                             hero.money += monster.money;
                                             
                                             break Loop1;
                                          }
                                          /*System.out.println("타겟이 반격합니다");
                                          
                                          hero.attacked(monster.attack());
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);*/
                                          //영웅의 체력이 0이하
                                          if(hero.hp<=0) {
                                             System.out.println("게임 종료! 사망하였습니다.");
                                             System.exit(0);
                                             //break;
                                          }
                                          System.out.println("1. 계속공격하기");
                                          System.out.println("2. 도망가기");
                                          System.out.println("옵션을 선택하세요");
                                          number = sc.nextInt();
                                          if(number==1) {
                                             System.out.println("타겟을 공격합니다");
                                             monster.attacked(hero.attack());
                                             //사냥 1회당 hp1 소진
                                             //hero.damaged(1);
                                             //교전중 영웅과 타겟의 hp 변화 표시
                                             System.out.println("player의 hp: "+hero.hp);
                                             System.out.println("player의 mp: "+hero.mp);
                                             System.out.println("player의 superpower: "+hero.superpower);
                                             System.out.println("target의 hp: "+monster.hp);
                                             System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                             //System.out.println("hp 1만큼 소진");
                                             if(hero.hp<=0) {
                                                System.out.println("게임 종료! 사망하였습니다.");
                                                System.exit(0);
                                                //break;
                                             }
                                             //타겟의 체력이 0이하
                                             if(monster.hp <=0) {
                                                monster.Stop(true);
                                                System.out.println("사냥 성공");
                                                hero.experience += monster.experience;
                                                hero.money += monster.money;
                                                
                                                break Loop1;
                                             }
                                             /*System.out.println("타겟이 반격합니다");
                                             
                                             hero.attacked(monster.attack());
                                             //교전중 영웅과 타겟의 hp 변화 표시
                                             System.out.println("player의 hp: "+hero.hp);*/
                                             //영웅의 체력이 0이하
                                             if(hero.hp<=0) {
                                                System.out.println("게임 종료! 사망하였습니다.");
                                                System.exit(0);
                                                //break;
                                             }
                                             System.out.println("1. 계속공격하기");
                                             System.out.println("2. 도망가기");
                                             System.out.println("옵션을 선택하세요");
                                             number = sc.nextInt();
                                             if(number==1) {
                                                System.out.println("타겟을 공격합니다");
                                                monster.attacked(hero.attack());
                                                //사냥 1회당 hp1 소진
                                                //hero.damaged(1);
                                                //교전중 영웅과 타겟의 hp 변화 표시
                                                System.out.println("player의 hp: "+hero.hp);
                                                System.out.println("player의 mp: "+hero.mp);
                                                System.out.println("player의 superpower: "+hero.superpower);
                                                System.out.println("target의 hp: "+monster.hp);
                                                System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                //System.out.println("hp 1만큼 소진");
                                                if(hero.hp<=0) {
                                                   System.out.println("게임 종료! 사망하였습니다.");
                                                   System.exit(0);
                                                   //break;
                                                }
                                                //타겟의 체력이 0이하
                                                if(monster.hp <=0) {
                                                   monster.Stop(true);
                                                   System.out.println("사냥 성공");
                                                   hero.experience += monster.experience;
                                                   hero.money += monster.money;
                                                   
                                                   break Loop1;
                                                }
                                                /*System.out.println("타겟이 반격합니다");
                                                
                                                hero.attacked(monster.attack());
                                                //교전중 영웅과 타겟의 hp 변화 표시
                                                System.out.println("player의 hp: "+hero.hp);*/
                                                //영웅의 체력이 0이하
                                                if(hero.hp<=0) {
                                                   System.out.println("게임 종료! 사망하였습니다.");
                                                   System.exit(0);
                                                   //break;
                                                }
                                                System.out.println("1. 계속공격하기");
                                                System.out.println("2. 도망가기");
                                                System.out.println("옵션을 선택하세요");
                                                number = sc.nextInt();
                                                if(number==1) {
                                                   System.out.println("타겟을 공격합니다");
                                                   monster.attacked(hero.attack());
                                                   //사냥 1회당 hp1 소진
                                                   //hero.damaged(1);
                                                   //교전중 영웅과 타겟의 hp 변화 표시
                                                   System.out.println("player의 hp: "+hero.hp);
                                                   System.out.println("player의 mp: "+hero.mp);
                                                   System.out.println("player의 superpower: "+hero.superpower);
                                                   System.out.println("target의 hp: "+monster.hp);
                                                   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                                   //System.out.println("hp 1만큼 소진");
                                                   if(hero.hp<=0) {
                                                      System.out.println("게임 종료! 사망하였습니다.");
                                                      System.exit(0);
                                                      //break;
                                                   }
                                                   //타겟의 체력이 0이하
                                                   if(monster.hp <=0) {
                                                      monster.Stop(true);
                                                      System.out.println("사냥 성공");
                                                      hero.experience += monster.experience;
                                                      hero.money += monster.money;
                                                      
                                                      break Loop1;
                                                   }
                                                   /*System.out.println("타겟이 반격합니다");
                                                   
                                                   hero.attacked(monster.attack());
                                                   //교전중 영웅과 타겟의 hp 변화 표시
                                                   System.out.println("player의 hp: "+hero.hp);*/
                                                   //영웅의 체력이 0이하
                                                   if(hero.hp<=0) {
                                                      System.out.println("게임 종료! 사망하였습니다.");
                                                      System.exit(0);
                                                      //break;
                                                   }
                                                }else if(number==2) {
                                                   //도망가기
                                                   monster.Stop(true);
                                                   break Loop1;
                                                }
                                             }else if(number==2) {
                                                //도망가기
                                                monster.Stop(true);
                                                break Loop1;
                                             }
                                          }else if(number==2) {
                                             //도망가기
                                             monster.Stop(true);
                                             break Loop1;
                                          }
                                       }else if(number==2) {
                                          //도망가기
                                          monster.Stop(true);
                                          break Loop1;
                                       }
                                    }else if(number==2) {
                                       //도망가기
                                       monster.Stop(true);
                                       break Loop1;
                                    }
                                 }else if(number==2) {
                                    //도망가기
                                    monster.Stop(true);
                                    break Loop1;
                                 }
                              }
                           /*}else {
                              System.out.println("타겟을 놓쳤습니다");
                              System.out.println("스피드가 부족하니 다른 타겟을 찾으세요");
                              //사냥 1회당 hp1 소진
                              hero.damaged(1);
                              
                              break;
                           }*/
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
                        Store store = new Store();
                        System.out.println("상점 입장");
                        System.out.println("1. 파워 업그레이드(가격:100, 파워+7)");
                        System.out.println("2. 방어력 업그레이드(가격:100, 방어력+3)");
                        System.out.println("3. HP 증강(가격:10, HP+10)");
                        System.out.println("4. MP 증강(가격:10, MP+10)");
                        System.out.println("5. HP(대용량) 증강(가격:50, HP+50)");
                        System.out.println("6. MP(대용량) 증강(가격:50, MP+50)");
                        
                        System.out.println("구매할 물건을 선택하세요");
                        System.out.println("7. 상점 나가기");
                        number = sc.nextInt();
                        if(number == 7)
                           break Loop1;
                        int temp = hero.money;
                        
                        if((hero.money = store.show(hero.money, number)) != -1) {
                           System.out.println("구입 완료");
                           if(number == 1) 
                              hero.power += 7;
                           if(number == 2) 
                              hero.defense += 3;
                           if(number == 3 && hero.hp<=100*hero.level) 
                              hero.hp += 10;
                           if(number == 4) 
                              hero.mp += 10;
                           if(number == 5 && hero.hp<=100*hero.level) 
                              hero.hp += 50;
                           if(number == 6) 
                              hero.mp += 50;
                           
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
                        ItemShop itemshop = new ItemShop();
                        System.out.println("아이템상점 입장");
                        System.out.println("1. superpower(가격:500, 타겟의 공격을 1초동안 마비, 레벨5이상 구입 가능)");
                        
                        System.out.println("구매할 물건을 선택하세요");
                        System.out.println("2. 아이템상점 나가기");
                        number = sc.nextInt();
                        if(number == 2)
                           break Loop1;
                        int temp = hero.money;
                        
                        if((hero.money = itemshop.showitem(hero.money, number)) != -1) {
                           System.out.println("구입 완료");
                           if(number == 1) 
                              hero.superpower += 10;                  
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
                           System.out.println("번호를 선택하세요");
                           number = sc.nextInt();
                           if(number == 1) {
                              Monster monster = new Dragon();
                              monster.name="드래곤";
                              monster.hp=6000;
                              monster.power=60;
                              monster.defense=25;
                              monster.experience=200;
                              //monster.speed=4;
                              monster.money=100;   
                              /*Prey monster2 = new Dragon();
                              monster2.name="드래곤2";
                              monster2.hp=2000;
                              monster2.power=45;
                              monster2.defense=25;
                              monster2.experience=200;
                              monster2.speed=4;
                              monster2.money=100;*/
                              while(hero.hp>0 && (timer.day()) < 10) {
                                 //monster.start();
                                 monster.go();
                                 //monster2.start();
                                 //교전중 영웅과 타겟의 hp 변화 표시
                                 System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                 System.out.println("player의 hp: "+hero.hp);
                                 System.out.println("target의 hp: "+monster.hp);
                                 //영웅의 체력이 0 이하
                                 if(hero.hp<=0) {
                                    System.out.println("게임 종료! 사망하였습니다.");
                                    System.exit(0);
                                    //break;
                                 }
                                 //타겟의 체력이 0이하
                                 if(monster.hp <=0) {
                                    monster.Stop(true);
                                    
                                    System.out.println("드래곤 사냥 성공");
                                    hero.experience += monster.experience;
                                    hero.money += monster.money;
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
                                    
                                    //break Loop1;
                                 }
                                 /*if(monster2.hp <=0) {
                                    monster2.Stop(true);
                                    
                                    System.out.println("드래곤2 사냥 성공");
                                    hero.experience += monster2.experience;
                                    hero.money += monster2.money;
                                    
                                    //break Loop1;
                                 }*/
                                 while(hero.hp >0 && (timer.day()) < 10) {
                                       System.out.println("1. 계속공격하기");
                                       System.out.println("2. 도망가기");
                                       System.out.println("3. 타겟 마비시키기");
                                       System.out.println("옵션을 선택하세요");
                                       //교전중 영웅과 타겟의 hp 변화 표시
                                       System.out.println("player의 hp: "+hero.hp);
                                       System.out.println("player의 mp: "+hero.mp);
                                       System.out.println("player의 superpower: "+hero.superpower);
                                       System.out.println("target의 hp: "+monster.hp);
                                       System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                       number = sc.nextInt();
                                       if(number==1) {
                                          System.out.println("타겟을 공격합니다");
                                          monster.attacked(hero.attack());
                                          //사냥 1회당 hp1 소진
                                          //hero.damaged(1);
                                          
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);
                                          System.out.println("player의 mp: "+hero.mp);
                                          System.out.println("player의 superpower: "+hero.superpower);
                                          System.out.println("target의 hp: "+monster.hp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          
                                          //System.out.println("hp 1만큼 소진");
                                          
                                          if(hero.hp<=0) {
                                             System.out.println("게임 종료! 사망하였습니다.");
                                             System.exit(0);
                                             //break;
                                          }
                                          //타겟의 체력이 0이하
                                          if(monster.hp <=0) {
                                             monster.Stop(true);
                                             
                                             System.out.println("드래곤 사냥 성공");
                                             hero.experience += monster.experience;
                                             hero.money += monster.money;
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
                                             //break Loop1;
                                          }
                                          /*if(monster2.hp <=0) {
                                             monster2.Stop(true);
                                             
                                             System.out.println("드래곤2 사냥 성공");
                                             hero.experience += monster2.experience;
                                             hero.money += monster2.money;
                                             
                                             //break Loop1;
                                          }*/
                                          
                                          /*System.out.println("타겟이 반격합니다");
                                          
                                          hero.attacked(monster.attack());
                                          //교전중 영웅과 타겟의 hp 변화 표시
                                          System.out.println("player의 hp: "+hero.hp);*/
                                          //영웅의 체력이 0이하
                                          if(hero.hp<=0) {
                                             System.out.println("게임 종료! 사망하였습니다.");
                                             System.exit(0);
                                             //break;
                                          }break;
                                       }else if(number ==2 ) {
                                          ////드래곤 서식지 나가기
                                          monster.Stop(true);
                                          //monster2.Stop(true);
                                          break Loop1;
                                       }else if(number ==3 && hero.superpower>0) {
                                          System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                                          System.out.println("========================아이템 'superpower'사용으로 타겟이 마비 되었습니다==========================");
                                          hero.itemuse(1);
                                          System.out.println("Player의 잔여 superpower: "+hero.superpower);
                                          System.out.println("Player의 잔여 mp: " + hero.mp);
                                          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                          int i=0;
                                          while(i<1) {
                                             monster.Stop(true);
                                             monster.attacked(hero.attack());
                                             //교전중 영웅과 타겟의 hp 변화 표시
                                             System.out.println("player의 hp: "+hero.hp);
                                             System.out.println("target의 hp: "+monster.hp);
                                             System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                                             System.out.println();
                                             if(monster.hp <=0) {                                 
                                                hero.experience += monster.experience;
                                                hero.money += monster.money;
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
                                                 monster.Stop(true);
                                                //hero.Stop(true);
                                                System.out.println("드래곤 사냥 성공");
                                                //break Loop1;
                                             }else {
                                                Thread.sleep(3000);
                                                i++;
                                             }
                                          }
                                          
                                          monster.Stop(false);
                                          System.out.println("=========================타겟의 마비가 풀리고 다시 반격을 시작합니다.==================");
                                          if(monster.hp <=0) {
                                             monster.Stop(true);
                                             
                                             System.out.println("드래곤 사냥 성공");
                                             hero.experience += monster.experience;
                                             hero.money += monster.money;
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
                                             //break Loop1;
                                          }break;
                                       }System.out.println("현재 사용할 수 없는 스킬입니다");/*if(number ==3 && hero.superpower < 1) {
                                          System.out.println("현재 사용할 수 없는 스킬입니다!");
                                          if(hero.hp<=0) {
                                             System.out.println("게임 종료! 사망하였습니다.");
                                             System.exit(0);
                                             //break;
                                          }else {break;}
                                       }*/
//                                    //player hp 사망
//                                    System.out.println("게임 종료! 사망하였습니다.");
//                                    System.exit(0);
               
                                 
                                 }
                                 //player hp 사망
                                 if(hero.hp<=0) {
                                    System.out.println("게임 종료! 사망하였습니다.");
                                    System.exit(0);
                                    //break;
                                 }
                              }
                              //player hp 사망
                              if(hero.hp<=0) {
                                 System.out.println("게임 종료! 사망하였습니다.");
                                 System.exit(0);
                                 //break;
                              }
                           }else if(number ==2) {
                              //드래곤 서식지 나가기
                              break Loop1;
                           }
                           
                           
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
               
   }

}