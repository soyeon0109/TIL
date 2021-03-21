package day2;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// 소수= 1과 자신의 수로만 나누어지는 자연수 
		int su = 30;
		
		for(int j = 2; j <= su; j++) {
			int count = 0;
			for(int i = 1; i <= j; i++) {
				if(j % i == 0) {
					count++;
				}
			}
			//System.out.println(count);
			if(count == 2) {
				System.out.println(j + ": 소수입니다"); 
			}
			else System.out.println(j+": 소수가 아닙니다");
			}
	}	

}
