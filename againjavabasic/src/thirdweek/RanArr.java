package thirdweek;

import java.util.Random;
import java.util.Scanner;

public class RanArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하시오");
		int number = sc.nextInt();
		// TODO Auto-generated method stub
		int[][] rannum = new int[number][number];
		Random random = new Random();
		for(int a = 0; a<number; a++) {
			for(int b = 0; b<number; b++) {
				rannum[a][b] = random.nextInt(number)+1;
			}
		}
		
		/*System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.print(arr[0][2]);
		System.out.println();
		System.out.print(arr[1][0]);
		System.out.print(arr[1][1]);
		System.out.print(arr[1][2]);
		System.out.println();
		System.out.print(arr[2][0]);
		System.out.print(arr[2][1]);
		System.out.print(arr[2][2]);*/
		//System.out.println(arr[number-1][number-1]);
		for(int i =0; i<number; i++) {
			for(int j=0; j<number; j++) {
				System.out.print(rannum[i][j]);
			}
			System.out.println();
		}

	}

}
