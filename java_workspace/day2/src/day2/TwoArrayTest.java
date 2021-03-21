package day2;

public class TwoArrayTest {

	public static void main(String[] args) {
		//3*4 이차원배열
/*		int two_ar [][]; //배열 선언
		two_ar = new int [3][4]; //배열생성
		System.out.println(two_ar.length);
		System.out.println(two_ar[0].length);
		//1차 배열 출력 반복
		for(int i = 0; i < two_ar.length; i++) {
			for(int j = 0; j < two_ar[0].length; j++) {
				//1-12 값 저장 명시 초기화
				two_ar[i][j] = i+1+j;
				System.out.print(two_ar[i][j]+"\t");
			}
			System.out.println();
		}
*/
		//3*? 이차원 배열
		int two_ar [][] = new int [3][]; //배열생성
		System.out.println(two_ar.length);
		//1차 배열 출력 반복
		for(int i = 0; i < two_ar.length; i++) {
			two_ar[i]= new int [i+2]; //2,3,4, 생성
			for(int j = 0; j < two_ar[i].length; j++) {
				//1-12 값 저장 명시 초기화
				two_ar[i][j] = (i+1)*(j+1);
				System.out.print(two_ar[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
