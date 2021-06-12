package secondweek;

import java.util.Scanner;

public class Domestictravelbudget {

	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("*************강원도 여행 planning*****************");
		String story = "당신은 일주일의 연휴동안 강원도로 여행을 계획합니다.\n\n"
				+ "마침 가족들은 같은 기간 강원도 속초로 2박3일 여행을 가기로했습니다.\n\n"
				+ "먼저 속초에 있는 리조트에서 휴식을 취하고\n\n"
				+ "근처 설악산을 등산 후 서핑 체험을 할 계획입니다.\n\n"
				+ "가족들은 한 차로 이동하며 당신은 자차를 직접 운전해서 따로 출발합니다. \n\n"	
				+ "속초에 있는 리조트에 도착했습니다. \n\n"
				+ "집에서 가져온 음식 및 재료로 식사를 해결 후\n\n"
				+ "2박3일간의 여행일정을 공유합니다.\n\n"
				+ "다음 날 설악산을 등산하고 그 다음날 체크아웃 하기로 합니다.\n\n"
				+ "아침일찍 출발해서 설악산 국립공원에 도착하니 아침 9시가 되었습니다.\n\n"
				+ "케이블카를 타고 5분 정도 올라가서 권금성 선착장에 도착했습니다.\n\n"
				+ "여기서 권금성 정상까지는 도보로 10분!\n\n"
				+ "1.권금성 정상까지 올라간다. 2.여기도 경치가 훌륭하므로 하산한다.\n\n";
			
		for(int i =0; i < story.length(); i++) {
			Thread.sleep(20);
			System.out.print(story.charAt(i));			
		}			
		int number = sc.nextInt();			

		//권금성 정상까지 올라간다.
		if(number == 1) {
			System.out.println("경사가 좀 가파르지만 길이 잘 되어 있어서 권금성 정상에 무사히 도착하였습니다.");
			
			System.out.println("설악산을 하산하여 숙소로 돌아오는 길에 시장에 들렀습니다.");
			System.out.println("생선과 횟감을 사서 숙소로 돌아왔습니다.");
			System.out.println("식사를 하면서 다음 일정을 상의합니다.");
			System.out.println("다음날 체크아웃 하면서 숙소 근처에 해변을 산책하기로 합니다.");
			System.out.println("다음날이 되어 체크아웃 후 10Km 정도 떨어진 해변에 도착했습니다.");
			System.out.println("해변 근처 유명한 카페에서 바다를 보면서 즐거운 시간을 보냅니다.");
			System.out.println("차를 마신 후 가족들과 산책합니다.");
			System.out.println("한시간 후 가족들은 집에 돌아가는 길에 근처 맛집에서 점심식사를 하기로 합니다. 가족과 함께 식사 후 집으로 돌아가겠습니까?");
			System.out.println("1.나머지 일정이 있으므로 가족들과 작별 한다. 2. 가족들과 식사를 같이한다.");
			number = sc.nextInt();
			//가족들과 작별한다.
			if(number == 1) {
				
				System.out.println("서핑을 체험하기 위해 양양으로 이동합니다.");
				System.out.println("양양 죽도에 도착하여 서핑샵에 입장합니다.");
				System.out.println("1박2일동안 서핑 보드 장비를 렌탈합니다.");									
				System.out.println("서핑샵에서 입문자 강습을 2만원에 제공합니다.");
				System.out.println("강습을 받으시겠습니까?");
				System.out.println("1. 강습을 받는다. 2. 받지 않는다.");
				number = sc.nextInt();
				//강습을 받는다.
				if(number == 1) {
					System.out.println("두시간 동안 이론과 실습 기초 강습을 받았습니다.");
					System.out.println("파도가 너무 세서 라인업에 진입하기 어렵습니다.");
					System.out.println("서핑강사가 원한다면 라인업까지 이끌어 주겠다고 합니다. 도전하시겠습니까?");
					System.out.println("1. 도전한다. 2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
					number = sc.nextInt();
					//도전한다
					if(number == 1) {
						System.out.println("가까스로 라인업에 도착했지만 서핑실력이 미숙하여 파도를 놓치고 다시 해안가로 밀려났습니다.");
						System.out.println("이제 강사 없이 혼자서 라인업까지 가야합니다. 더 시도하시겠습니까?");
						System.out.println("1. 더 시도한다.  2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
						number = sc.nextInt();
						//더 시도한다
						if(number == 1) {
							System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
							System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
							System.out.println("참여하시겠습니까?");
							System.out.println("1. 참여한다. 2. 참여하지 않는다.");
							number = sc.nextInt();
							//바베큐 파티를 참여한다.
							if(number == 1) {
								System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
								System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
								System.out.println("초대에 응하겠습니까?");
								System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
								number = sc.nextInt();
								//친구들과 펜션에 놀러간다
								if(number == 1) {
									System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
									System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
									System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
									System.out.println("1.밤새 같이 논다. 2. 자러 간다");
									number = sc.nextInt();
									//밤새 같이 논다.
									if(number == 1) {
										System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
										System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
									// 자러 간다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
											    	
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//친구들과 헤어지고 게스트하우스에서 숙박한다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//참여하지 않는다.
							if(number == 2) {
								System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
								System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
								System.out.println("새로운 친구와 같이 하겠습니까?");
								System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
								number = sc.nextInt();
								//같이 어울린다.
								if(number == 1) {
									System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
									System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
									System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
									System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
										System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
										System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("늦잠을 자서 점심시간이 되었습니다.");
										System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//혼자 다닌다.
								if(number == 2) {
									System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
									System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										if(number == 2) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
							}
						}
						//더 시도하지 않는다.
						if(number == 2) {
							System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
							System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
							System.out.println("참여하시겠습니까?");
							System.out.println("1. 참여한다. 2. 참여하지 않는다.");
							number = sc.nextInt();
							//바베큐 파티를 참여한다.
							if(number == 1) {
								System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
								System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
								System.out.println("초대에 응하겠습니까?");
								System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
								number = sc.nextInt();
								//친구들과 펜션에 놀러간다
								if(number == 1) {
									System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
									System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
									System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
									System.out.println("1.밤새 같이 논다. 2. 자러 간다");
									number = sc.nextInt();
									//밤새 같이 논다.
									if(number == 1) {
										System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
										System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											if(number == 2) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									// 자러 간다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//친구들과 헤어지고 게스트하우스에서 숙박한다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//참여하지 않는다.
							if(number == 2) {
								System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
								System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
								System.out.println("새로운 친구와 같이 하겠습니까?");
								System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
								number = sc.nextInt();
								//같이 어울린다.
								if(number == 1) {
									System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
									System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
									System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
									System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
										System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
										System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
										
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("늦잠을 자서 점심시간이 되었습니다.");
										System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											if(number == 2) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//혼자 다닌다.
								if(number == 2) {
									System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
									System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										if(number == 2) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									if(number == 2) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
						}
					}
					//도전하지 않는다.
					if(number == 2) {
						System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
						System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
						System.out.println("참여하시겠습니까?");
						System.out.println("1. 참여한다. 2. 참여하지 않는다.");
						number = sc.nextInt();
						//바베큐 파티를 참여한다.
						if(number == 1) {
							System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
							System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
							System.out.println("초대에 응하겠습니까?");
							System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
							number = sc.nextInt();
							//친구들과 펜션에 놀러간다
							if(number == 1) {
								System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
								System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
								System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
								System.out.println("1.밤새 같이 논다. 2. 자러 간다");
								number = sc.nextInt();
								//밤새 같이 논다.
								if(number == 1) {
									System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
									System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										if(number == 2) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
										
									}
									if(number == 2) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
								// 자러 간다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//친구들과 헤어지고 게스트하우스에서 숙박한다.
							if(number == 2) {
								System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
								System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
									System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//다음날 아침에 출발
									if(number == 2) {
										System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
									System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
								}
							}
						}
						//참여하지 않는다.
						if(number == 2) {
							System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
							System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
							System.out.println("새로운 친구와 같이 하겠습니까?");
							System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
							number = sc.nextInt();
							//같이 어울린다.
							if(number == 1) {
								System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
								System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
								System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
								System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
									System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
									System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
									System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
									System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									
									
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("늦잠을 자서 점심시간이 되었습니다.");
									System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//혼자 다닌다.
							if(number == 2) {
								System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
								System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
								System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
								System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									if(number == 2) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
								if(number == 2) {
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
									System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
									System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
								}
							}
						}
					}
				}
				//강습을 받지 않는다.
				if(number == 2) {
					System.out.println("파도가 너무 세서 라인업에 진입하기 어렵습니다.");
					System.out.println("지금이라도 서핑 강습을 받겠습니까?");
					System.out.println("1. 강습을 받는다. 2. 받지 않는다.");
					number = sc.nextInt();
					//강습을 받는다.
					if(number == 1) {
						System.out.println("두시간 동안 이론과 실습 기초 강습을 받았습니다.");
						System.out.println("파도가 너무 세서 라인업에 진입하기 어렵습니다.");
						System.out.println("서핑강사가 원한다면 라인업까지 이끌어 주겠다고 합니다. 도전하시겠습니까?");
						System.out.println("1. 도전한다. 2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
						number = sc.nextInt();
						//도전한다
						if(number == 1) {
							System.out.println("가까스로 라인업에 도착했지만 서핑실력이 미숙하여 파도를 놓치고 다시 해안가로 밀려났습니다.");
							System.out.println("이제 강사 없이 혼자서 라인업까지 가야합니다. 더 시도하시겠습니까?");
							System.out.println("1. 더 시도한다.  2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
							number = sc.nextInt();
							//더 시도한다
							if(number == 1) {
								System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
								System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
								System.out.println("참여하시겠습니까?");
								System.out.println("1. 참여한다. 2. 참여하지 않는다.");
								number = sc.nextInt();
								//바베큐 파티를 참여한다.
								if(number == 1) {
									System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
									System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
									System.out.println("초대에 응하겠습니까?");
									System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
									number = sc.nextInt();
									//친구들과 펜션에 놀러간다
									if(number == 1) {
										System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
										System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
										System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
										System.out.println("1.밤새 같이 논다. 2. 자러 간다");
										number = sc.nextInt();
										//밤새 같이 논다.
										if(number == 1) {
											System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
											System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
												if(number == 2) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
												}
											}
										}
										// 자러 간다.
										if(number == 2) {
											System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
												System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
												//다음날 아침에 출발
												if(number == 2) {
													System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//친구들과 헤어지고 게스트하우스에서 숙박한다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//참여하지 않는다.
								if(number == 2) {
									System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
									System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
									System.out.println("새로운 친구와 같이 하겠습니까?");
									System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
									number = sc.nextInt();
									//같이 어울린다.
									if(number == 1) {
										System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
										System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
										System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
										System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
											System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
											System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
											
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("늦잠을 자서 점심시간이 되었습니다.");
											System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
											System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
											System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//혼자 다닌다.
									if(number == 2) {
										System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
										System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
								}
							}
							//더 시도하지 않는다.
							if(number == 2) {
								System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
								System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
								System.out.println("참여하시겠습니까?");
								System.out.println("1. 참여한다. 2. 참여하지 않는다.");
								number = sc.nextInt();
								//바베큐 파티를 참여한다.
								if(number == 1) {
									System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
									System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
									System.out.println("초대에 응하겠습니까?");
									System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
									number = sc.nextInt();
									//친구들과 펜션에 놀러간다
									if(number == 1) {
										System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
										System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
										System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
										System.out.println("1.밤새 같이 논다. 2. 자러 간다");
										number = sc.nextInt();
										//밤새 같이 논다.
										if(number == 1) {
											System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
											System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
											}
										}
										// 자러 간다.
										if(number == 2) {
											System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
												System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
												//다음날 아침에 출발
												if(number == 2) {
													System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//친구들과 헤어지고 게스트하우스에서 숙박한다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//참여하지 않는다.
								if(number == 2) {
									System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
									System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
									System.out.println("새로운 친구와 같이 하겠습니까?");
									System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
									number = sc.nextInt();
									//같이 어울린다.
									if(number == 1) {
										System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
										System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
										System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
										System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
											System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
											System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
											
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("늦잠을 자서 점심시간이 되었습니다.");
											System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
											System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
											System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//혼자 다닌다.
									if(number == 2) {
										System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
										System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
								}
							}
						}
						//도전하지 않는다.
						if(number == 2) {
							System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
							System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
							System.out.println("참여하시겠습니까?");
							System.out.println("1. 참여한다. 2. 참여하지 않는다.");
							number = sc.nextInt();
							//바베큐 파티를 참여한다.
							if(number == 1) {
								System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
								System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
								System.out.println("초대에 응하겠습니까?");
								System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
								number = sc.nextInt();
								//친구들과 펜션에 놀러간다
								if(number == 1) {
									System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
									System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
									System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
									System.out.println("1.밤새 같이 논다. 2. 자러 간다");
									number = sc.nextInt();
									//밤새 같이 논다.
									if(number == 1) {
										System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
										System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
									// 자러 간다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//친구들과 헤어지고 게스트하우스에서 숙박한다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//참여하지 않는다.
							if(number == 2) {
								System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
								System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
								System.out.println("새로운 친구와 같이 하겠습니까?");
								System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
								number = sc.nextInt();
								//같이 어울린다.
								if(number == 1) {
									System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
									System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
									System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
									System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
										System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
										System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("늦잠을 자서 점심시간이 되었습니다.");
										System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//혼자 다닌다.
								if(number == 2) {
									System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
									System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
								}
							}
						}
					}
					//강습을 받지 않는다.
					if(number == 2) {
						System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
						System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
						System.out.println("참여하시겠습니까?");
						System.out.println("1. 참여한다. 2. 참여하지 않는다.");
						number = sc.nextInt();
						//바베큐 파티를 참여한다.
						if(number == 1) {
							System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
							System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
							System.out.println("초대에 응하겠습니까?");
							System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
							number = sc.nextInt();
							//친구들과 펜션에 놀러간다
							if(number == 1) {
								System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
								System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
								System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
								System.out.println("1.밤새 같이 논다. 2. 자러 간다");
								number = sc.nextInt();
								//밤새 같이 논다.
								if(number == 1) {
									System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
									System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
								}
								// 자러 간다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//친구들과 헤어지고 게스트하우스에서 숙박한다.
							if(number == 2) {
								System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
								System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
									System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//다음날 아침에 출발
									if(number == 2) {
										System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
									System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
								}
							}
						}
						//참여하지 않는다.
						if(number == 2) {
							System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
							System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
							System.out.println("새로운 친구와 같이 하겠습니까?");
							System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
							number = sc.nextInt();
							//같이 어울린다.
							if(number == 1) {
								System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
								System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
								System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
								System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
									System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
									System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
									System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
									System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("늦잠을 자서 점심시간이 되었습니다.");
									System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//혼자 다닌다.
							if(number == 2) {
								System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
								System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
								System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
								System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
								}
								if(number == 2) {
									
								}
							}
						}
					}
				}
				
			
			}
			//가족들과 식사를 같이 한다.
			if(number == 2) {
				System.out.println("가족들과 식사 후 기존의 서핑체험 계획은 취소하고 가족과 함께 집에 돌아갑니다");
				System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
				System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
				System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
				System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
				System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
		    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
		    	System.exit(0);
		    	System.exit(0);
			}
		
		
		}
		// 하산한다.
		if(number == 2) {
			System.out.println("설악산을 하산하여 숙소로 돌아오는 길에 시장에 들렀습니다.");
			System.out.println("생선과 횟감을 사서 숙소로 돌아왔습니다.");
			System.out.println("식사를 하면서 다음 일정을 상의합니다.");
			System.out.println("다음날 체크아웃 하면서 숙소 근처에 해변을 산책하기로 합니다.");
			System.out.println("다음날이 되어 체크아웃 후 10Km 정도 떨어진 해변에 도착했습니다.");
			System.out.println("해변 근처 유명한 카페에서 바다를 보면서 즐거운 시간을 보냅니다.");
			System.out.println("차를 마신 후 가족들과 산책합니다.");
			System.out.println("한시간 후 가족들은 집에 돌아가는 길에 근처 맛집에서 점심식사를 하기로 합니다. 가족과 함께 식사 후 집으로 돌아가겠습니까?");
			System.out.println("1.나머지 일정이 있으므로 가족들과 작별 한다. 2. 가족들과 식사를 같이한다.");
			number = sc.nextInt();
			//가족들과 작별한다.
			if(number == 1) {
				
				System.out.println("서핑을 체험하기 위해 양양으로 이동합니다.");
				System.out.println("양양 죽도에 도착하여 서핑샵에 입장합니다.");
				System.out.println("1박2일동안 서핑 보드 장비를 렌탈합니다.");									
				System.out.println("서핑샵에서 입문자 강습을 2만원에 제공합니다.");
				System.out.println("강습을 받으시겠습니까?");
				System.out.println("1. 강습을 받는다. 2. 받지 않는다.");
				number = sc.nextInt();
				//강습을 받는다.
				if(number == 1) {
					System.out.println("두시간 동안 이론과 실습 기초 강습을 받았습니다.");
					System.out.println("파도가 너무 세서 라인업에 진입하기 어렵습니다.");
					System.out.println("서핑강사가 원한다면 라인업까지 이끌어 주겠다고 합니다. 도전하시겠습니까?");
					System.out.println("1. 도전한다. 2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
					number = sc.nextInt();
					//도전한다
					if(number == 1) {
						System.out.println("가까스로 라인업에 도착했지만 서핑실력이 미숙하여 파도를 놓치고 다시 해안가로 밀려났습니다.");
						System.out.println("이제 강사 없이 혼자서 라인업까지 가야합니다. 더 시도하시겠습니까?");
						System.out.println("1. 더 시도한다.  2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
						number = sc.nextInt();
						//더 시도한다
						if(number == 1) {
							System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
							System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
							System.out.println("참여하시겠습니까?");
							System.out.println("1. 참여한다. 2. 참여하지 않는다.");
							number = sc.nextInt();
							//바베큐 파티를 참여한다.
							if(number == 1) {
								System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
								System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
								System.out.println("초대에 응하겠습니까?");
								System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
								number = sc.nextInt();
								//친구들과 펜션에 놀러간다
								if(number == 1) {
									System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
									System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
									System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
									System.out.println("1.밤새 같이 논다. 2. 자러 간다");
									number = sc.nextInt();
									//밤새 같이 논다.
									if(number == 1) {
										System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
										System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
									// 자러 간다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//친구들과 헤어지고 게스트하우스에서 숙박한다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//참여하지 않는다.
							if(number == 2) {
								System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
								System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
								System.out.println("새로운 친구와 같이 하겠습니까?");
								System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
								number = sc.nextInt();
								//같이 어울린다.
								if(number == 1) {
									System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
									System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
									System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
									System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
										System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
										System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("늦잠을 자서 점심시간이 되었습니다.");
										System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//혼자 다닌다.
								if(number == 2) {
									System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
									System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
								}
							}
						}
						//더 시도하지 않는다.
						if(number == 2) {
							System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
							System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
							System.out.println("참여하시겠습니까?");
							System.out.println("1. 참여한다. 2. 참여하지 않는다.");
							number = sc.nextInt();
							//바베큐 파티를 참여한다.
							if(number == 1) {
								System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
								System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
								System.out.println("초대에 응하겠습니까?");
								System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
								number = sc.nextInt();
								//친구들과 펜션에 놀러간다
								if(number == 1) {
									System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
									System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
									System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
									System.out.println("1.밤새 같이 논다. 2. 자러 간다");
									number = sc.nextInt();
									//밤새 같이 논다.
									if(number == 1) {
										System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
										System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
									// 자러 간다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//친구들과 헤어지고 게스트하우스에서 숙박한다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//참여하지 않는다.
							if(number == 2) {
								System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
								System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
								System.out.println("새로운 친구와 같이 하겠습니까?");
								System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
								number = sc.nextInt();
								//같이 어울린다.
								if(number == 1) {
									System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
									System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
									System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
									System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
										System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
										System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("늦잠을 자서 점심시간이 되었습니다.");
										System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//혼자 다닌다.
								if(number == 2) {
									System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
									System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
								}
							}
						}
					}
					//도전하지 않는다.
					if(number == 2) {
						System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
						System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
						System.out.println("참여하시겠습니까?");
						System.out.println("1. 참여한다. 2. 참여하지 않는다.");
						number = sc.nextInt();
						//바베큐 파티를 참여한다.
						if(number == 1) {
							System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
							System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
							System.out.println("초대에 응하겠습니까?");
							System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
							number = sc.nextInt();
							//친구들과 펜션에 놀러간다
							if(number == 1) {
								System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
								System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
								System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
								System.out.println("1.밤새 같이 논다. 2. 자러 간다");
								number = sc.nextInt();
								//밤새 같이 논다.
								if(number == 1) {
									System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
									System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
								}
								// 자러 간다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//친구들과 헤어지고 게스트하우스에서 숙박한다.
							if(number == 2) {
								System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
								System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
									System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//다음날 아침에 출발
									if(number == 2) {
										System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
									System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
								}
							}
						}
						//참여하지 않는다.
						if(number == 2) {
							System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
							System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
							System.out.println("새로운 친구와 같이 하겠습니까?");
							System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
							number = sc.nextInt();
							//같이 어울린다.
							if(number == 1) {
								System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
								System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
								System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
								System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
									System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
									System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
									System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
									System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									
									
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("늦잠을 자서 점심시간이 되었습니다.");
									System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//혼자 다닌다.
							if(number == 2) {
								System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
								System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
								System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
								System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
								}
							}
						}
					}
				}
				//강습을 받지 않는다.
				if(number == 2) {
					System.out.println("파도가 너무 세서 라인업에 진입하기 어렵습니다.");
					System.out.println("지금이라도 서핑 강습을 받겠습니까?");
					System.out.println("1. 강습을 받는다. 2. 받지 않는다.");
					number = sc.nextInt();
					//강습을 받는다.
					if(number == 1) {
						System.out.println("두시간 동안 이론과 실습 기초 강습을 받았습니다.");
						System.out.println("파도가 너무 세서 라인업에 진입하기 어렵습니다.");
						System.out.println("서핑강사가 원한다면 라인업까지 이끌어 주겠다고 합니다. 도전하시겠습니까?");
						System.out.println("1. 도전한다. 2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
						number = sc.nextInt();
						//도전한다
						if(number == 1) {
							System.out.println("가까스로 라인업에 도착했지만 서핑실력이 미숙하여 파도를 놓치고 다시 해안가로 밀려났습니다.");
							System.out.println("이제 강사 없이 혼자서 라인업까지 가야합니다. 더 시도하시겠습니까?");
							System.out.println("1. 더 시도한다.  2. 그냥 해안가 근처에서 적당히 서핑을 즐긴다.");
							number = sc.nextInt();
							//더 시도한다
							if(number == 1) {
								System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
								System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
								System.out.println("참여하시겠습니까?");
								System.out.println("1. 참여한다. 2. 참여하지 않는다.");
								number = sc.nextInt();
								//바베큐 파티를 참여한다.
								if(number == 1) {
									System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
									System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
									System.out.println("초대에 응하겠습니까?");
									System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
									number = sc.nextInt();
									//친구들과 펜션에 놀러간다
									if(number == 1) {
										System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
										System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
										System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
										System.out.println("1.밤새 같이 논다. 2. 자러 간다");
										number = sc.nextInt();
										//밤새 같이 논다.
										if(number == 1) {
											System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
											System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
											}
										}
										// 자러 간다.
										if(number == 2) {
											System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
												System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
												//다음날 아침에 출발
												if(number == 2) {
													System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//친구들과 헤어지고 게스트하우스에서 숙박한다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//참여하지 않는다.
								if(number == 2) {
									System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
									System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
									System.out.println("새로운 친구와 같이 하겠습니까?");
									System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
									number = sc.nextInt();
									//같이 어울린다.
									if(number == 1) {
										System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
										System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
										System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
										System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
											System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
											System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("늦잠을 자서 점심시간이 되었습니다.");
											System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
											System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
											System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//혼자 다닌다.
									if(number == 2) {
										System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
										System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
								}
							}
							//더 시도하지 않는다.
							if(number == 2) {
								System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
								System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
								System.out.println("참여하시겠습니까?");
								System.out.println("1. 참여한다. 2. 참여하지 않는다.");
								number = sc.nextInt();
								//바베큐 파티를 참여한다.
								if(number == 1) {
									System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
									System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
									System.out.println("초대에 응하겠습니까?");
									System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
									number = sc.nextInt();
									//친구들과 펜션에 놀러간다
									if(number == 1) {
										System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
										System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
										System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
										System.out.println("1.밤새 같이 논다. 2. 자러 간다");
										number = sc.nextInt();
										//밤새 같이 논다.
										if(number == 1) {
											System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
											System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
											}
										}
										// 자러 간다.
										if(number == 2) {
											System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
											System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
												System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
												//다음날 아침에 출발
												if(number == 2) {
													System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//친구들과 헤어지고 게스트하우스에서 숙박한다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//참여하지 않는다.
								if(number == 2) {
									System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
									System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
									System.out.println("새로운 친구와 같이 하겠습니까?");
									System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
									number = sc.nextInt();
									//같이 어울린다.
									if(number == 1) {
										System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
										System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
										System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
										System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
											System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
											System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
											
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("늦잠을 자서 점심시간이 되었습니다.");
											System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
											System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
											System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
											System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
											number = sc.nextInt();
											//서핑을 더 한다
											if(number == 1) {
												System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
												System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
												System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
												number = sc.nextInt();
												//바로 출발
												if(number == 1) {
													System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
													System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
													System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
													System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
													number = sc.nextInt();
													//휴게소에 진입
													if(number == 1) {
														System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													//휴게소에 경유하지 않고 집에 도착
													if(number == 2) {
														System.out.println("무사히 집에 도착했습니다.");
														System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
														System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
														System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
														System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
														System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
												    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
												    	System.exit(0);
													}
													
												}
											}
											//휴식을 취한다
											if(number == 2) {
												System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
												System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
									}
									//혼자 다닌다.
									if(number == 2) {
										System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
										System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
								}
							}
						}
						//도전하지 않는다.
						if(number == 2) {
							System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
							System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
							System.out.println("참여하시겠습니까?");
							System.out.println("1. 참여한다. 2. 참여하지 않는다.");
							number = sc.nextInt();
							//바베큐 파티를 참여한다.
							if(number == 1) {
								System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
								System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
								System.out.println("초대에 응하겠습니까?");
								System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
								number = sc.nextInt();
								//친구들과 펜션에 놀러간다
								if(number == 1) {
									System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
									System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
									System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
									System.out.println("1.밤새 같이 논다. 2. 자러 간다");
									number = sc.nextInt();
									//밤새 같이 논다.
									if(number == 1) {
										System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
										System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
									}
									// 자러 간다.
									if(number == 2) {
										System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
										System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
											System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
											//다음날 아침에 출발
											if(number == 2) {
												System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//친구들과 헤어지고 게스트하우스에서 숙박한다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//참여하지 않는다.
							if(number == 2) {
								System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
								System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
								System.out.println("새로운 친구와 같이 하겠습니까?");
								System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
								number = sc.nextInt();
								//같이 어울린다.
								if(number == 1) {
									System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
									System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
									System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
									System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
										System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
										System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
										
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("늦잠을 자서 점심시간이 되었습니다.");
										System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
										System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
										System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
										System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
										number = sc.nextInt();
										//서핑을 더 한다
										if(number == 1) {
											System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
											System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
											System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
											number = sc.nextInt();
											//바로 출발
											if(number == 1) {
												System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
												System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
												System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
												System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
												number = sc.nextInt();
												//휴게소에 진입
												if(number == 1) {
													System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												//휴게소에 경유하지 않고 집에 도착
												if(number == 2) {
													System.out.println("무사히 집에 도착했습니다.");
													System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
													System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
													System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
													System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
													System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
											    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
											    	System.exit(0);
												}
												
											}
										}
										//휴식을 취한다
										if(number == 2) {
											System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
											System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
								}
								//혼자 다닌다.
								if(number == 2) {
									System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
									System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
								}
							}
						}
					}
					//강습을 받지 않는다.
					if(number == 2) {
						System.out.println("두세시간 정도 서핑을 하다가 저녁이 되어 장비를 반납합니다.");
						System.out.println("저녁식사 시간이 되어 음식점을 찾는데 근처에서 바베큐 파티를 합니다.");
						System.out.println("참여하시겠습니까?");
						System.out.println("1. 참여한다. 2. 참여하지 않는다.");
						number = sc.nextInt();
						//바베큐 파티를 참여한다.
						if(number == 1) {
							System.out.println("바베큐 파티에 참여해서 새로운 친구들을 알게 되었습니다.");
							System.out.println("파티가 끝난 후 친구들이 펜션으로 초대 하였습니다.");
							System.out.println("초대에 응하겠습니까?");
							System.out.println("1.친구들과 펜션으로 간다. 2. 작별하고 게스트하우스에서 숙박한다.");
							number = sc.nextInt();
							//친구들과 펜션에 놀러간다
							if(number == 1) {
								System.out.println("펜션에서 친구들과 놀다가 잘 시간이 되었습니다.");
								System.out.println("재밌게 노는 중이지만 몹시 피곤해졌습니다.");
								System.out.println("계속 같이 놀지 자러 간다고 말할지 선택하세요");
								System.out.println("1.밤새 같이 논다. 2. 자러 간다");
								number = sc.nextInt();
								//밤새 같이 논다.
								if(number == 1) {
									System.out.println("아침이 밝았습니다. 밤새 같이 놀다가 피곤해서 늦잠을 잤습니다.");
									System.out.println("서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
								}
								// 자러 간다.
								if(number == 2) {
									System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
									System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
										System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
										//다음날 아침에 출발
										if(number == 2) {
											System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
										}
									}
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//친구들과 헤어지고 게스트하우스에서 숙박한다.
							if(number == 2) {
								System.out.println("아침이 밝았습니다. 서핑 보드 장비렌탈은 오늘까진데 몹시 피곤합니다.");
								System.out.println("장비 대여료도 아깝고 더 타고 싶은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("서핑을 마치고 장비를 반납 후 집에 돌아갈 준비를 합니다.");
									System.out.println("저녁이 되어 배도 고프고 피곤합니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									//다음날 아침에 출발
									if(number == 2) {
										System.out.println("아침일찍 출발하여 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("점심시간이 되어 잠깐 식사를 하고 싶은데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
									System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
								}
							}
						}
						//참여하지 않는다.
						if(number == 2) {
							System.out.println("게스트 하우스에 숙박료를 지불하고 로비 쇼파에서 쉬고 있는데 모르는 사람이 말을 겁니다.");
							System.out.println("낯선 사람이지만 이야기를 하다 보니 친분이 생겼습니다. 서로 일행이 없는데 같이 식사도 하고 놀자고 합니다.");
							System.out.println("새로운 친구와 같이 하겠습니까?");
							System.out.println("1. 같이 식사하고 어울린다. 2. 작별하고 혼자 식사한다.");
							number = sc.nextInt();
							//같이 어울린다.
							if(number == 1) {
								System.out.println("같이 치맥 한잔 하면서 즐거운 식사를 마쳤습니다.");
								System.out.println("2차로 술한잔 더 하고 연락처를 교환한 후 다음날 아침에 서핑을 같이 하기로 하였습니다.");
								System.out.println("게스트 하우스에 돌아와 잠이 든 후 아침이 밝았습니다.");
								System.out.println("어제 알게 된 친구와 아침일찍 서핑을 같이 하기로 했지만 몹시 피곤합니다. 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 친구에게 몹시 피곤해서 쉬겠다고 말한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("친구와 아침일찍 서핑을 하며 즐거운 시간을 보냅니다.");
									System.out.println("점심시간이 되어 친구와 식사 후 집에 갈 준비를 합니다.");
									System.out.println("장비를 반납 후 휴식을 취한 뒤 집으로 출발합니다.");
									System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
									System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
									System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
									System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
									number = sc.nextInt();
									//휴게소에 진입
									if(number == 1) {
										System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									//휴게소에 경유하지 않고 집에 도착
									if(number == 2) {
										System.out.println("무사히 집에 도착했습니다.");
										System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
										System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
										System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
										System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
										System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
								    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
								    	System.exit(0);
									}
									
									
								}
								//휴식을 취한다
								if(number == 2) {
									System.out.println("늦잠을 자서 점심시간이 되었습니다.");
									System.out.println("서핑샵 근처 컵밥집에서 간단히 끼니를 때운 후 파도의 상태를 보러 바다로 갔습니다.");
									System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
									System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
									System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
									number = sc.nextInt();
									//서핑을 더 한다
									if(number == 1) {
										System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
										System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
										System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
										number = sc.nextInt();
										//바로 출발
										if(number == 1) {
											System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
											System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
											System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
											System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
											number = sc.nextInt();
											//휴게소에 진입
											if(number == 1) {
												System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											//휴게소에 경유하지 않고 집에 도착
											if(number == 2) {
												System.out.println("무사히 집에 도착했습니다.");
												System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
												System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
												System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
												System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
												System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
										    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
										    	System.exit(0);
											}
											
										}
									}
									
									//휴식을 취한다
									if(number == 2) {
										System.out.println("오늘로 장비렌탈 기간도 끝나고 집에 돌아갈 준비를 합니다.");
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 길이 많이 막혀서 반 정도 왔는데 벌써 저녁여섯시입니다.");
										System.out.println("배도 고프고 좀 쉬고 싶은데 마침 근처에 휴게소가 있습니다. 쉬었다 가겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
							}
							//혼자 다닌다.
							if(number == 2) {
								System.out.println("근처 음식점에서 간단히 식사를 마친 후 게스트 하우스에서 숙박을 합니다.");
								System.out.println("다음날 아침이 되어 파도를 살피러 바다에 나가봅니다.");
								System.out.println("어제와 달리 파도가 적당히 서핑하기 적합하게 치고 있습니다. 좀 피곤하긴 하지만 더 타고 싶어졌습니다.");
								System.out.println("서핑을 더 즐기면 집에 돌아가기 힘들거 같은데 어떻게 하시겠습니까?");
								System.out.println("1. 서핑을 더 한다. 2. 대여료는 아깝지만 무리하지 않고 휴식을 취한다.");
								number = sc.nextInt();
								//서핑을 더 한다
								if(number == 1) {
									System.out.println("저녁이 되어 서핑을 마치고 장비를 반납하였습니다. 집에 돌아갈 준비를 마쳤습니다.");
									System.out.println("식사 후 하룻밤 더 자고 내일 아침에 출발할까 고민합니다. 어떻게 하시겠습니까?");
									System.out.println("1. 바로 출발한다. 2.식사 후 하룻밤 더 자고 다음날 아침에 출발한다.");
									number = sc.nextInt();
									//바로 출발
									if(number == 1) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 늦은 시간이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										
									}
									if(number == 2) {
										System.out.println("차를 끌고 집으로 돌아가는 길입니다. 이른 아침이라서 차도 별로 막히지 않습니다.");
										System.out.println("절반 쯤 지나왔는데 계속 운전해서 가면 두시간 안에 집에 도착할 거 같습니다.");
										System.out.println("피로가 쌓여서 좀 쉬었다 가고 싶기도 한데 어떻게 하시겠습니까?");
										System.out.println("1. 휴게소에 들렸다 간다. 2. 그냥 간다");
										number = sc.nextInt();
										//휴게소에 진입
										if(number == 1) {
											System.out.println("휴게소에서 간단히 식사 후 다시 출발합니다.");
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
										//휴게소에 경유하지 않고 집에 도착
										if(number == 2) {
											System.out.println("무사히 집에 도착했습니다.");
											System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
											System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
											System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
											System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
											System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
									    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
									    	System.exit(0);
										}
									}
								}
								
							}
						}
					}
				}
				
			
			}
			//가족들과 식사를 같이 한다.
			if(number == 2) {
				System.out.println("가족들과 식사 후 기존의 서핑체험 계획은 취소하고 가족과 함께 집에 돌아갑니다");
				System.out.println(".___________. __    __   _______     _______ .__   __.  _______              ");
				System.out.println("|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\             ");
				System.out.println("`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |            ");
				System.out.println("    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |            ");
				System.out.println("    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  | __  __  __ ");
		    	System.out.println("    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ (__)(__)(__)");
		    	System.exit(0);
			}
		}	

	}

}
