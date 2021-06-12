package thirdweek;

import java.util.Scanner;

public class InhancedDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하세요");
		int number = sc.nextInt();	//입력값
		int height = number*2+1;	//마름모의 높이(도형의 높이)
		int width = number*2+1;		//마름모의 가로길이(도형의 가로길이)
		int upper= height/2+1;		//윗 삼각형의 높이
		//System.out.println(upper);
		int leg= height/2;			//아래 역삼각형의 높이
		int center=width/2;			//도형의 가로길이의 절반
		int start=center;
		int end=center;
		//삼각형
		for(int i = 0; i < upper; i++) {
			for(int k = 0; k < width; k++) {
				if(k<start || k>end) {
					System.out.print(" ");//중간부분 좌우 양옆 공백처리
				}else {
					System.out.print("*");//중간부분
				}
			
			}
			start--;	//중간부분 좌우 한칸식 증가
			end++;		//중간부분 좌우 한칸식 증가
			System.out.println();
		}
		//역삼각형
		start = 0;
		end = width-1;
		//System.out.println(end);
		for(int i =0; i < leg; i++) {
			for(int k=0; k< width; k++) {
				if(k < start+1 || k > end-1) {
					System.out.print(" ");//중간부분 좌우 양옆 공백처리
				}else {
					System.out.print("*");//중간부분
				}
				
			}
			start ++; //중간부분 좌우 한칸식 감소
			end --;	  //중간부분 좌우 한칸식 감소	
			System.out.println();
		}

	}

}
