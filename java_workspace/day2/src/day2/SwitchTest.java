package day2;

public class SwitchTest {

	public static void main(String[] args) {
		// 1 ~ 12  난수 발생
		// 3,4,5 - 게절은 봄입니다
		// 6,7,8 - 계절은 여름입니다
		// 9,10,11 - 계절은 가을입니다
		//12,1,2 - 계절은 겨울입니다
		int month = (int)(Math.random()*12) +1;
		System.out.println(month + " 월: ");
		
		switch(month) { //int 변수만 온다 / byte short는 자동형변환 int
		// jdk8버전 String 타입도 가능
		case 3:
		case 4:
		case 5:
			System.out.println("게절은 봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("게절은 여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("게절은 가을입니다");
			break;
		default:
			System.out.println("계절은 겨울입니다");
		}

	}

}
