package day2;

public class IfTest {

	public static void main(String[] args) {
		// 이자바학생 국어 영어 수학 100 88 77점
		// 총점, 정수평균, 실수평균
		// 정수평균 70점 이상 합격 

		String name = "이자바";
		// 1-100사이 난수 발생
		int kor = (int)(Math.random()*100) +1;
		int eng = (int)(Math.random()*100) +1;
		int mat = (int)(Math.random()*100) +1;
		int sum = kor + eng + mat;
		int avg = sum / 3;
		double dAvg = sum / (double)3;
		
		System.out.println("학생이름 = "+ name);
		System.out.println("국어점수 = "+ kor);
		System.out.println("영어점수 = "+ eng);
		System.out.println("수학점수 = "+ mat);
		System.out.println("정수평균 = "+ avg);
		System.out.println("실수평균 = "+ dAvg);
		
/*		if(avg >= 70)
			System.out.println("pass");
		else System.out.println("fail");
*/		
		//System.out.println(avg >= 70?"pass":"fail");
		
/*		if(avg >= 80) {
			System.out.println("A등급");
		}
		else if(avg >= 60) {
			System.out.println("B등급");
		}
		else if(avg >= 40) {
			System.out.println("C등급");
		}
		else System.out.println("낙제");
*/		
		switch(avg/10) {
		case 10:
		case 9:
		case 8:
			System.out.println("A등급");
			break;
		case 7:
		case 6:
			System.out.println("B등급");
			break;
		case 5:
		case 4:
			System.out.println("C등급");
			break;
		default:
			System.out.println("낙제");
		}
	}

}
