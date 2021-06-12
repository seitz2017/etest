package thirdweek;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		/*System.out.println("      *");
		System.out.println("     * * ");
		System.out.println("   * * * *  ");
		System.out.println("  * * * * * ");
		System.out.println(" * * * * * * * * * ");
		System.out.println("* * * * * * * * * * * ");
		System.out.println(" * * * * * * * * * ");
		System.out.println("  * * * * * * * ");
		System.out.println("   * * * * * ");
		System.out.println("   * * * * * ");
		System.out.println("       *");*/
		Scanner sc= new Scanner(System.in);
		System.out.println("2보다 큰 자연수를 입력하시오");
		int n= sc.nextInt();
		//int n = 3;
		System.out.println();
		for(int i = -n; i<=n; i++) {
			System.out.print(" ");
			for(int j=-n; j<=n; j++) {
				if(i*i+j*j <= n*n+1*1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
				
			
		}

	}

}
