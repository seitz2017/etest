package thirdweek;

public class Starupperbody {

	public static void main(String[] args) {
		//필수 변수 할당
		int number = 1;
		int width = number*15;
		int height = number*9;
		int center = width/2;
		int start;
		int end;
		start = center;
		end = center;
		for(int i =0; i<height/3; i++) {
			
			for(int k=0; k<width; k++) {
				if(k<start || k>end) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			start--;
			end++;
		}
		start=0;
		end=width;
		for(int i = height/3; i<height/3*2; i++) {
			for(int k=0; k<width; k++) {
				
				if(k>=start && k<end) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
					
			}System.out.println();
			start++;
			end--;
		}
		

	}

}
