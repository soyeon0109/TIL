package day2;

public class StarTest {

	public static void main(String[] args) {
/*		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			
			System.out.println(" ");
		}
*/		
		//'a' 97 'A' 65 '0' 48
		char c = 'a';
		for(int i = 1; i <= 5; i++) {
			for(int j = c; j < c+i; j++) {
				System.out.print((char)(j));
			}
			c= (char)(c+i);
			System.out.println(" ");
		}
/*		for(int i = 1; i <= 5; i+=2) {
			for(int j = 1; j <= (5-i)/2; j++) {
				System.out.print("   ");
			}
			for(int k = 1; k <=i; k++) {
				System.out.print(" * ");
			}
			
			System.out.println(" ");
		}
*/
	}

}
