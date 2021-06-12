package thirdweek;

import java.util.Random;
import java.util.Scanner;

public class SudoRan {

	public static void main(String[] args) {
		boolean isSame=true;
		int row;
		int col;
		int loopCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하시오");
		int number = sc.nextInt();
		long start = System.currentTimeMillis();
		//n차 정사각 2차원 배열 생성
		int[][] rannum = new int[number][number];
		//랜덤함수 생성
		Random random = new Random();	
		Loop2:
		while(true) {
			//리셋카운트 초기화
			System.out.println(loopCount);
			loopCount=0;
			for(int a = 0; a<number; a++) {
				for(int b = 0; b<number; b++) {
					Loop1:
					while(true) {
						//랜덤 자연수 배열에 입력
						rannum[a][b]=random.nextInt(number)+1;
						row=a;
						col=b;
						//가로열 중복체크
						for(int c=col-1;c>=0;c--) {
							while(isSame) {
								if(rannum[a][b]==rannum[a][c]) {
									continue Loop1;
								}else {
									isSame=false;
								}
							}
							isSame=true;
							
							
						}
						//세로열 중복체크
						for(int d=row-1;d>=0;d--) {
							while(isSame) {
								if(rannum[a][b]  == rannum[d][b]) {
									loopCount++;	
									//무한루프 방지
									if(loopCount>300) {
										continue Loop2;
									}else {
										continue Loop1;
									}
									
									
								}else {
									isSame=false;
								}
							}
							isSame=true;
						}
						break;
						
					}
					
				}
			}
			long end = System.currentTimeMillis();
			System.out.println();
			System.out.println("걸린시간 : " + (end - start)/1000.0 +"초");
			//배열출력
			for(int i =0; i<number; i++) {
				for(int j=0; j<number; j++) {
					if(String.valueOf(rannum[i][j]).length() == 1) {
						System.out.print("  "+rannum[i][j]+"  ");
					}else {
						System.out.print(" "+rannum[i][j]+"  ");
					}
					
				}
				System.out.println();
			}
			break;
		}
		
	}

}
