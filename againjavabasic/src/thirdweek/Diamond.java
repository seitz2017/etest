package thirdweek;

import java.util.Scanner;

public class Diamond {
	
	public static void main(String[] args) {
		/*System.out.println("     *");
		System.out.println("    *** ");
		System.out.println("   ***** ");
		System.out.println("  ******* ");
		System.out.println(" ********* ");
		System.out.println("*********** ");
		System.out.println(" ********* ");
		System.out.println("  ******* ");
		System.out.println("   ***** ");
		System.out.println("    *** ");
		System.out.println("     *");*/
		
		//char [][] star =  new char [3][3];
		
		/*for(int i = 1; i<=12; i= i+2) {
			for(int k=12/2; k>1; k--) {
				System.out.print(" ");
			}
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("2보다 큰 짝수를 입력하세요");
		int n =sc.nextInt();
		//삼각형
		for(int i = 1; i<=n; i= i+2) {
			//한줄씩 선공백
			for(int k = n/2; k>i/2; k--) {
				System.out.print(" ");	
			}
			//한줄씩 선공백 후 별모양 출력			
			for(int j=0; j<i; j++) {
				System.out.print("*");
				
			}System.out.println();
		}
		//역삼각형
		for(int i=1; i<=n-1; i= i+2) {
			System.out.print("  ");
			//한줄씩 선공백 
			for(int k = 0; k<i/2; k++) {
				System.out.print(" ");	
			}
			//한줄씩 선공백 후 별모양 출력
			for(int j=n-2; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*System.out.println("  ********* ");
		System.out.println("   ******* ");
		System.out.println("    ***** ");
		System.out.println("     *** ");
		System.out.println("      *");*/										
	}

}
