package day2;

public class WhileTest {

	public static void main(String[] args) {
		
		while(true) {
			int number = (int)(Math.random()*50)+1;
			System.out.println(number);
			if(number == 25) {
				break;
			}
		}
	}

}
