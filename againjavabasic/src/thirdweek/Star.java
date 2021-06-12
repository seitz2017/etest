package thirdweek;

public class Star {

	public static void main(String[] args) {
		System.out.println("              *");
		System.out.println("             ***");
		System.out.println("            *****");
		System.out.println("           *******");
		System.out.println("          *********");
		System.out.println(" *****************************");
		System.out.println("  ***************************");
		System.out.println("   *************************");
		System.out.println("    ***********************");
		System.out.println("     *********************");
		System.out.println("     ********** **********");
		System.out.println("    ********       ********");
		System.out.println("   ******             ******");
		System.out.println("  ****                   ****");
		System.out.println(" **                         **");
		//System.out.println("*                           *");
		int a=5;
		int b=0;
		//starhead(삼각형)
		for(int i=1; i<2*15/3; i=i+2) {
			
			for(int k = 9+15/2; k>i/2; k--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		//starbody(역삼각형)
		for(int i=1; i<=2*15/3; i=i+2) {
			for(int k = 0; k<i/2; k++) {
				System.out.print(" ");
			}
			for(int j= 9+15+9; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//starleg(가랭이 찢어진 삼각형)
		for(int i=0; i<=2*15/3; i=i+2) {
			
			for(int k =0; k<27+5+1; k++) {
				//System.out.print("*");
				if(k<a || k>27+5-a) {
					System.out.print(" ");
				}else if(k>(27+5)/2+b || k<(27+5)/2-b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}			
			}
			a--;
			System.out.println();
			b=b+3;
		}
		
	}

}
